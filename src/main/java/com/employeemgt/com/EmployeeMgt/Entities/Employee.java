package com.employeemgt.com.EmployeeMgt.Entities;

public class Employee {

    private Long employeeId;
    private String firstName;
    private String lastName;
    private String staffId;
    private int departmentId;

    public Employee() { }

    public Employee(Long employeeId, String firstName, String lastName, String staffId, int departmentId) {
        super();
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.staffId = staffId;
        this.departmentId = departmentId;
    }

    public Long getId() {
        return employeeId;
    }

    public void setId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }




}
