package com.alochol.empmanagerserver.service;

import com.alibaba.fastjson.JSONObject;
import com.alochol.empmanagerserver.config.auth.UserRole;
import com.alochol.empmanagerserver.config.cache.CacheService;
import com.alochol.empmanagerserver.constant.http.code.ServiceResultCode;
import com.alochol.empmanagerserver.exception.BusinessException;
import com.alochol.empmanagerserver.exception.ParameterIllegalException;
import com.alochol.empmanagerserver.mybatis.dao.ManagerMapper;
import com.alochol.empmanagerserver.mybatis.model.Manager;
import com.alochol.empmanagerserver.mybatis.model.ManagerExample;
import com.alochol.empmanagerserver.util.RylaiDate;
import com.alochol.empmanagerserver.util.RylaiRandom;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManagerService {

    @Autowired
    private CacheService cacheService;

    @Autowired
    private ManagerMapper managerMapper;

    public Manager addManager(Manager manager) {
        if (manager == null || StringUtils.isAnyBlank(manager.getMgr_name(), manager.getMgr_password())) {
            throw new ParameterIllegalException("用户名密码不能为空");
        }
        ManagerExample managerExample = new ManagerExample();
        managerExample.createCriteria().andMgr_nameEqualTo(manager.getMgr_name());
        List<Manager> managers = managerMapper.selectByExample(managerExample);

        if (managers != null && managers.size() > 0) {
            throw new ParameterIllegalException("添加的管理员已存在");
        }
        manager.setCreate_date(RylaiDate.getCurrentDate());
        manager.setUpdate_date(RylaiDate.getCurrentDate());
        managerMapper.insert(manager);
        return manager;
    }

    public Manager updateManager(Manager manager) {
        if (manager == null || StringUtils.isAnyBlank(manager.getId(), manager.getMgr_name())) {
            throw new ParameterIllegalException("用户名或用户id不能为空");
        }
        ManagerExample managerExample = new ManagerExample();
        managerExample.createCriteria().andIdEqualTo(manager.getId());
        manager.setUpdate_date(RylaiDate.getCurrentDate());
        managerMapper.updateByPrimaryKey(manager);
        return manager;
    }

    public void removeManager(String id) {
        if (StringUtils.isBlank(id)) {
            throw new ParameterIllegalException("用户id不能为空");
        }
        managerMapper.deleteByPrimaryKey(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public void removeManagers(List<String> ids) {
        if (ids == null || ids.size() == 0) {
            throw new ParameterIllegalException("用户id不能为空");
        }
        ManagerExample managerExample = new ManagerExample();
        managerExample.createCriteria().andCreate_idIn(ids);
        managerMapper.deleteByExample(managerExample);
    }

    public PageInfo selectByPage(String mgrName, List<Byte> roleIds, Integer ageStart, Integer ageEnd, Integer gender, Pageable pageable) {
        ManagerExample managerExample = getManagerExample(mgrName, roleIds, ageStart, ageEnd, gender);
        PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize(),
                pageable.getSort().toString().replace(":", " "));
        List<Manager> managers = managerMapper.selectByExample(managerExample);
        PageInfo<Manager> pageInfo = new PageInfo<>(managers);
        return pageInfo;
    }

    public List<Manager> selectAll(String mgrName, List<Byte> roleIds, Integer ageStart, Integer ageEnd, Integer gender) {
        ManagerExample managerExample = getManagerExample(mgrName, roleIds, ageStart, ageEnd, gender);
        List<Manager> managers = managerMapper.selectByExample(managerExample);
        return managers;
    }

    /**
     * 条件查询 example
     * @param mgrName
     * @param roleIds
     * @param ageStart
     * @param ageEnd
     * @param gender
     * @return
     */
    private ManagerExample getManagerExample(String mgrName, List<Byte> roleIds, Integer ageStart, Integer ageEnd, Integer gender) {
        ManagerExample managerExample = new ManagerExample();
        ManagerExample.Criteria criteria = managerExample.createCriteria();
        if (StringUtils.isNotBlank(mgrName))
            criteria.andMgr_nameLike("%" + mgrName + "%");
        if (roleIds == null || roleIds.size() == 0) {
            // 默认只查自己注册的管理员
            criteria.andRole_idIn(new ArrayList<Byte>(){{add(((byte) UserRole.COMMON_MANAGER.getRoleId()));}});
        } else {
            criteria.andRole_idIn(roleIds);
        }
        if (ageStart != null)
            criteria.andMgr_ageGreaterThanOrEqualTo(ageStart);
        if (ageEnd != null)
            criteria.andMgr_ageLessThanOrEqualTo(ageEnd);
        if (gender != null && gender < 2) // 合法的gender 只有 0 和 1
            criteria.andGenderEqualTo(gender.byteValue());
        return managerExample;
    }

    public Manager selectById(String id) {
        if (StringUtils.isBlank(id)) {
            throw new ParameterIllegalException();
        }
        return managerMapper.selectByPrimaryKey(id);
    }

    public JSONObject login(Manager manager) {

        // 判断参数是否为空
        if (null == manager || StringUtils.isAnyBlank(manager.getMgr_name(), manager.getMgr_password())) {
            throw new ParameterIllegalException("用户名密码不能为空");
        }

        // 判断用户是否存在
        ManagerExample managerExampleExist = new ManagerExample();
        managerExampleExist.createCriteria().andMgr_nameEqualTo(manager.getMgr_name());
        List<Manager> managers = managerMapper.selectByExample(managerExampleExist);
        if (managers == null || managers.size() == 0) {
            throw new BusinessException(ServiceResultCode.USER_HAD_EXIST);
        }

        Manager mgr = managers.get(0);

        // 密码错误
        if (!manager.getMgr_password().equals(mgr.getMgr_password())) {
            throw new BusinessException(ServiceResultCode.USER_PASSWORD_ERR);
        }

        // 保存用户token
        JSONObject job = new JSONObject();
        String token = RylaiRandom.getUUid();
        cacheService.set(token, mgr);
        job.put("token", token);
        job.put("manager", mgr);

        // 处理敏感信息
        mgr.setMgr_password(null);
        return job;
    }

    public Manager register(Manager reqManager) {
        // 判断参数是否为空
        if (null == reqManager || StringUtils.isAnyBlank(reqManager.getMgr_name(), reqManager.getMgr_password())) {
            throw new ParameterIllegalException("用户名密码不能为空");
        }
        if (reqManager.getRole_id() != UserRole.COMMON_MANAGER.getRoleId() && reqManager.getRole_id() != UserRole.SYSTEM_MANAGER.getRoleId()) {
            throw new ParameterIllegalException("用户角色不合法");
        }
        // 判断用户是否存在
        ManagerExample managerExampleExist = new ManagerExample();
        managerExampleExist.createCriteria().andMgr_nameEqualTo(reqManager.getMgr_name());
        List<Manager> managers = managerMapper.selectByExample(managerExampleExist);
        if (managers == null || managers.size() == 0) {
            throw new BusinessException(ServiceResultCode.USER_HAD_EXIST);
        }

        // 保存用户数据
        reqManager.setMgr_password(reqManager.getMgr_password());

        reqManager.setRole_id((byte)UserRole.COMMON_MANAGER.getRoleId());
        managerMapper.insert(reqManager);

        return reqManager;
    }

}
