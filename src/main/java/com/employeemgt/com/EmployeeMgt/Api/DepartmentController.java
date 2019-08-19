package com.employeemgt.com.EmployeeMgt.Api;

import com.employeemgt.com.EmployeeMgt.Entities.Department;
import com.employeemgt.com.EmployeeMgt.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService _dept;

    @RequestMapping(method = RequestMethod.GET, value = "/department")
    public List<Department> getAll() {
        return  _dept.getDepartments();
    }

}
