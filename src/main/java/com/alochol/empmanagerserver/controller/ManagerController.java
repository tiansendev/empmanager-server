package com.alochol.empmanagerserver.controller;

import com.alibaba.fastjson.JSONObject;
import com.alochol.empmanagerserver.config.auth.PermissionRequired;
import com.alochol.empmanagerserver.config.auth.UserRole;
import com.alochol.empmanagerserver.constant.http.model.ServiceResult;
import com.alochol.empmanagerserver.mybatis.model.Manager;
import com.alochol.empmanagerserver.service.ManagerService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    /**
     * 添加普通管理员
     * 只有管理员有权限
     * @param manager
     * @return
     */
    @PermissionRequired(role = UserRole.SYSTEM_MANAGER)
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ServiceResult addManager(@RequestBody Manager manager) {
        return ServiceResult.success(managerService.addManager(manager));
    }

    /**
     * 修改普通管理员
     * 只有管理员有权限
     * @param manager
     * @return
     */
    @PermissionRequired
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ServiceResult updateManager(@RequestBody Manager manager) {
        return ServiceResult.success(managerService.updateManager(manager));
    }

    /**
     * 删除普通管理员
     * 只有管理员有权限
     * @param id
     * @return
     */
    @PermissionRequired(role = UserRole.SYSTEM_MANAGER)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ServiceResult removeManager(@PathVariable("id") String id) {
        managerService.removeManager(id);
        return ServiceResult.success();
    }

    /**
     * 删除普通管理员
     * 只有管理员有权限
     * @param ids
     * @return
     */
    @PermissionRequired(role = UserRole.SYSTEM_MANAGER)
    @RequestMapping(value = "/removebatch", method = RequestMethod.DELETE)
    public ServiceResult removeManagers(@RequestBody List<String> ids) {
        managerService.removeManagers(ids);
        return ServiceResult.success();
    }

    /**
     * 分页查询普通管理员
     * 只有管理员有权限
     * @return
     */
//    @PermissionRequired(role = UserRole.SYSTEM_MANAGER)
    @RequestMapping(value = "/bypage", method = RequestMethod.GET)
    public ServiceResult selectByPage(@RequestParam(value = "mgrName", required = false) String mgrName,
                                      @RequestParam(value = "roleIds", required = false) List<Byte> roleIds,
                                      @RequestParam(value = "ageStart", required = false) Integer ageStart,
                                      @RequestParam(value = "ageEnd", required = false) Integer ageEnd,
                                      @RequestParam(value = "gender", required = false) Integer gender,
                                      @PageableDefault(size = 10, sort = {"mgr_name"}, direction = Sort.Direction.ASC) Pageable pageable) {
        PageInfo managers = managerService.selectByPage(mgrName, roleIds, ageStart, ageEnd, gender, pageable);
        return ServiceResult.success(managers);
    }

    /**
     * 查询所有普通管理员
     * 只有管理员有权限
     * @return
     */
    @PermissionRequired(role = UserRole.SYSTEM_MANAGER)
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ServiceResult selecAll(@RequestParam(value = "mgrName", required = false) String mgrName,
                                  @RequestParam(value = "roleIds", required = false) List<Byte> roleIds,
                                  @RequestParam(value = "ageStart", required = false) Integer ageStart,
                                  @RequestParam(value = "ageEnd", required = false) Integer ageEnd,
                                  @RequestParam(value = "gender", required = false) Integer gender
    ) {
        List<Manager> managers = managerService.selectAll(mgrName, roleIds, ageStart, ageEnd, gender);
        return ServiceResult.success(managers);
    }

    /**
     * 查询所有普通管理员
     * 只有管理员有权限
     * @return
     */
    @PermissionRequired
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ServiceResult selecById(@PathVariable("id") String id) {
        Manager manager = managerService.selectById(id);
        return ServiceResult.success(manager);
    }

    /**
     * 登录
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ServiceResult login(@RequestBody Manager manager) {
        JSONObject jsonObject = managerService.login(manager);
        return ServiceResult.success(jsonObject);
    }

    /**
     * 注册
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ServiceResult register(@RequestBody Manager manager) {
        return ServiceResult.success(managerService.register(manager));
    }
}
