package com.alochol.empmanagerserver.service;

import com.alochol.empmanagerserver.config.UserContextThreadLocal;
import com.alochol.empmanagerserver.exception.ParameterIllegalException;
import com.alochol.empmanagerserver.mybatis.dao.EmployeeMapper;
import com.alochol.empmanagerserver.mybatis.model.Employee;
import com.alochol.empmanagerserver.mybatis.model.EmployeeExample;
import com.alochol.empmanagerserver.util.RylaiDate;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee addEmployee(Employee employee) {
        if (employee == null || StringUtils.isAnyBlank(employee.getEmp_name())) {
            throw new ParameterIllegalException("员工名不能为空");
        }
        EmployeeExample employeeExample = new EmployeeExample();
        employeeExample.createCriteria().andEmp_nameEqualTo(employee.getEmp_name());
        List<Employee> employees = employeeMapper.selectByExample(employeeExample);
        // TODO: 19-2-25 查找manager表 防止员工名重复
        if (employees != null && employees.size() > 0) {
            throw new ParameterIllegalException("添加的员工已存在");
        }
        employee.setCreate_date(RylaiDate.getCurrentDate());
        employee.setUpdate_date(RylaiDate.getCurrentDate());
        employee.setCreate_id(UserContextThreadLocal.getCacheUsermanager().getCreate_id());
        employeeMapper.insert(employee);
        return employee;
    }

    public Employee updateEmployee(Employee employee) {
        if (employee == null || StringUtils.isAnyBlank(employee.getId(), employee.getEmp_name())) {
            throw new ParameterIllegalException("员工名或员工id不能为空");
        }
        EmployeeExample employeeExample = new EmployeeExample();
        employeeExample.createCriteria().andIdEqualTo(employee.getId());
        employee.setUpdate_date(RylaiDate.getCurrentDate());
        employeeMapper.updateByPrimaryKeySelective(employee);
        return employee;
    }

    public void removeEmployee(String id) {
        if (StringUtils.isBlank(id)) {
            throw new ParameterIllegalException("员工id不能为空");
        }
        employeeMapper.deleteByPrimaryKey(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public void removeEmployees(List<String> ids) {
        if (ids == null || ids.size() == 0) {
            throw new ParameterIllegalException("员工id不能为空");
        }
        EmployeeExample employeeExample = new EmployeeExample();
        employeeExample.createCriteria().andCreate_idIn(ids);
        employeeMapper.deleteByExample(employeeExample);
    }

    public PageInfo selectByPage(String empName, Integer ageStart, Integer ageEnd, Integer gender, String creatorId, Pageable pageable) {
        EmployeeExample employeeExample = getManagerExample(empName, ageStart, ageEnd, gender, creatorId);
        PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize(),
                pageable.getSort().toString().replace(":", " "));
        List<Employee> employeesrs = employeeMapper.selectByExample(employeeExample);
        PageInfo<Employee> pageInfo = new PageInfo<>(employeesrs);
        return pageInfo;
    }

    public List<Employee> selectAll(String empName, Integer ageStart, Integer ageEnd, Integer gender, String creatorId) {
        EmployeeExample employeeExample = getManagerExample(empName, ageStart, ageEnd, gender, creatorId);
        List<Employee> employeesrs = employeeMapper.selectByExample(employeeExample);
        return employeesrs;
    }

    /**
     * 条件查询 example
     * @param empName
     * @param ageStart
     * @param ageEnd
     * @param gender
     * @param creatorId
     * @return
     */
    private EmployeeExample getManagerExample(String empName, Integer ageStart, Integer ageEnd, Integer gender, String creatorId) {
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        if (StringUtils.isNotBlank(empName))
            criteria.andEmp_nameLike("%" + empName + "%");
        if (ageStart != null)
            criteria.andEmp_ageGreaterThanOrEqualTo(ageStart);
        if (ageEnd != null)
            criteria.andEmp_ageLessThanOrEqualTo(ageEnd);
        if (gender != null && gender < 2) // 合法的gender 只有 0 和 1
            criteria.andEmp_genderEqualTo(gender.byteValue());
        if (StringUtils.isNotBlank(creatorId))
            criteria.andCreate_idEqualTo(creatorId);
        return employeeExample;
    }

    public Employee selectById(String id) {
        if (StringUtils.isBlank(id)) {
            throw new ParameterIllegalException();
        }
        return employeeMapper.selectByPrimaryKey(id);
    }
}
