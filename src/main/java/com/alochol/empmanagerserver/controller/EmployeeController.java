package com.alochol.empmanagerserver.controller;

import com.alochol.empmanagerserver.config.auth.PermissionRequired;
import com.alochol.empmanagerserver.constant.http.model.ServiceResult;
import com.alochol.empmanagerserver.mybatis.model.Employee;
import com.alochol.empmanagerserver.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    /**
     * 添加员工
     * @param Employee
     * @return
     */
    @PermissionRequired
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ServiceResult addEmployee(@RequestBody Employee Employee) {
        return ServiceResult.success(employeeService.addEmployee(Employee));
    }

    /**
     * 修改员工
     * 只有管理员有权限
     * @param Employee
     * @return
     */
    @PermissionRequired
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ServiceResult updateEmployee(@RequestBody Employee Employee) {
        return ServiceResult.success(employeeService.updateEmployee(Employee));
    }

    /**
     * 删除员工
     * 只有管理员有权限
     * @param id
     * @return
     */
    @PermissionRequired
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ServiceResult removeEmployee(@PathVariable("id") String id) {
        employeeService.removeEmployee(id);
        return ServiceResult.success();
    }

    /**
     * 删除员工
     * 只有管理员有权限
     * @param ids
     * @return
     */
    @PermissionRequired
    @RequestMapping(value = "/removebatch", method = RequestMethod.DELETE)
    public ServiceResult removeEmployees(@RequestBody List<String> ids) {
        employeeService.removeEmployees(ids);
        return ServiceResult.success();
    }

    /**
     * 分页查询员工
     * 只有管理员有权限
     * @return
     */
    @PermissionRequired
    @RequestMapping(value = "/bypage", method = RequestMethod.GET)
    public ServiceResult selectByPage(@RequestParam(value = "empName", required = false) String mgrName,
                                      @RequestParam(value = "ageStart", required = false) Integer ageStart,
                                      @RequestParam(value = "ageEnd", required = false) Integer ageEnd,
                                      @RequestParam(value = "gender", required = false) Integer gender,
                                      @RequestParam(value = "creatorId", required = false) String creatorId,
                                      @PageableDefault(size = 10, sort = {"emp_name"}, direction = Sort.Direction.ASC) Pageable pageable
    ) {
        PageInfo Employees = employeeService.selectByPage(mgrName, ageStart, ageEnd, gender, creatorId, pageable);
        return ServiceResult.success(Employees);
    }

    /**
     * 查询所有员工
     * 只有管理员有权限
     * @return
     */
    @PermissionRequired
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ServiceResult selecAll(@RequestParam(value = "mgrName", required = false) String mgrName,
                                  @RequestParam(value = "ageStart", required = false) Integer ageStart,
                                  @RequestParam(value = "ageEnd", required = false) Integer ageEnd,
                                  @RequestParam(value = "gender", required = false) Integer gender,
                                  @RequestParam(value = "creatorId", required = false) String creatorId
    ) {
        List<Employee> Employees = employeeService.selectAll(mgrName, ageStart, ageEnd, gender, creatorId);
        return ServiceResult.success(Employees);
    }

    /**
     * 查询所有员工
     * 只有管理员有权限
     * @return
     */
    @PermissionRequired
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ServiceResult selecById(@PathVariable("id") String id) {
        Employee Employee = employeeService.selectById(id);
        return ServiceResult.success(Employee);
    }

}
