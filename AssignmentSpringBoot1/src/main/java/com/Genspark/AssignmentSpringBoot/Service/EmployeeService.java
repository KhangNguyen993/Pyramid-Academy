package com.Genspark.AssignmentSpringBoot.Service;

import com.Genspark.AssignmentSpringBoot.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    Employee getEmployeeById(int employId);
    Employee addEmployee(Employee employee);
    Employee UpdateEmployee(Employee employee);
    String deleteEmployeeById(int employId);
}
