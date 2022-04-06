package com.Genspark.AssignmentSpringBoot.Service;

import com.Genspark.AssignmentSpringBoot.Dao.EmployeeDao;
import com.Genspark.AssignmentSpringBoot.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getAllEmployee() {
        return this.employeeDao.findAll();
    }

    @Override
    public Employee getEmployeeById(int employId) {
        Employee employee = null;
        Optional<Employee> e = this.employeeDao.findById(employId);
        if(e.isPresent()){
            employee = e.get();
        } else {
            throw new RuntimeException("Employee not found for id :: " + employId);
        }
        return employee;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

    @Override
    public Employee UpdateEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

    @Override
    public String deleteEmployeeById (int employId) {
        this.employeeDao.deleteById(employId);
        return "Delete successfully";
    }

//    @Override
//    public Employee UpdateEmployee(int employId) {
//        Employee employee = null;

//        return employee;
//    }

}
