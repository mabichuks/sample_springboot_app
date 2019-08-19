package com.employeemgt.com.EmployeeMgt.Entities;

public class Department {

    private long departmentId;
    private String name;

    public Department() {
    }


    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
