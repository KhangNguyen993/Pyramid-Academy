package com.Genspark.AssignmentSpringBoot.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_employee")
public class Employee {
    @Id
    @Column(name = "e_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int employId;
    String employFirstName;
    String employLastName;
    String employeeAddress;
    String employeePhone;

    public Employee() {
    }

    public Employee( String employFirstName, String employLastName, String employeeAddress, String employeePhone) {
        this.employFirstName = employFirstName;
        this.employLastName = employLastName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
    }

    public int getEmployId() {
        return employId;
    }

    public void setEmployId(int employId) {
        this.employId = employId;
    }

    public String getEmployFirstName() {
        return employFirstName;
    }

    public void setEmployFirstName(String employFirstName) {
        this.employFirstName = employFirstName;
    }

    public String getEmployLastName() {
        return employLastName;
    }

    public void setEmployLastName(String employLastName) {
        this.employLastName = employLastName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }
}
