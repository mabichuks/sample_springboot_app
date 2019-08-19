package com.employeemgt.com.EmployeeMgt.Service;

import com.employeemgt.com.EmployeeMgt.Data.DepartmentDao;
import com.employeemgt.com.EmployeeMgt.Entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private DepartmentDao _repo;

    @Autowired
    public DepartmentService(DepartmentDao _repo) {
        this._repo = _repo;
    }

    public List<Department> getDepartments() {

        return _repo.findAll();

    }
}
