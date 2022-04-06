package com.Genspark.AssignmentSpringBoot.Controller;

import com.Genspark.AssignmentSpringBoot.Entity.Employee;
import com.Genspark.AssignmentSpringBoot.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/")
    public String home(){
        return "<HTML><H1>Welcome to Our Company</H1></HTML>";

    }
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return this.employeeService.getAllEmployee();
    }
    @GetMapping("/employees/{employId}")
    public Employee getEmployeeById(@PathVariable String employId){
        return this.employeeService.getEmployeeById(Integer.parseInt(employId));
    }
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return this.employeeService.addEmployee(employee);
    }
    @PutMapping("/employees")
    public Employee UpdateEmployee(@RequestBody Employee employee){
        return this.employeeService.UpdateEmployee(employee);
    }
    @DeleteMapping("/employees/{employId}")
    public String deleteEmployee(@PathVariable String employId){
        return this.employeeService.deleteEmployeeById(Integer.parseInt(employId));
    }

}
