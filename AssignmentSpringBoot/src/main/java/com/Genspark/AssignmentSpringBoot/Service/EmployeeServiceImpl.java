package com.Genspark.AssignmentSpringBoot.Service;

import com.Genspark.AssignmentSpringBoot.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> list;
    public EmployeeServiceImpl() {
        list = new ArrayList<>();
        list.add(new Employee(101,"Khang","Nguyen","15915 Peach bluff ln Cypress 77429","7148372804"));
        list.add(new Employee(102,"Kristy","Nguyen","6404 Heatherwood dr Riverside 92509","9517562638"));
        list.add(new Employee(103,"John","Nguyen","4410 W kent ave, Santa Ana 92709","7143831268"));


    }

    @Override
    public List<Employee> getAllEmployee() {
        return list;
    }

    @Override
    public Employee getEmployeeById(int employId) {
                Employee employee = null;
        for (Employee e: list
             ) {
            if(e.getEmployId() == employId){
                employee = e;
                break;
            }
        }
        return employee;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        list.add(employee);
        return employee;
    }

    @Override
    public Employee UpdateEmployee(Employee employee) {
        String firstName = employee.getEmployFirstName();
        String lastName = employee.getEmployLastName();
        String address = employee.getEmployeeAddress();
        String phone = employee.getEmployeePhone();
        Employee emp = null;
                for (Employee e: list
        ) {
            if(e.getEmployId() == employee.getEmployId()){
                e.setEmployFirstName(firstName);
                e.setEmployLastName(lastName);
                e.setEmployeeAddress(address);
                e.setEmployeePhone(phone);
                emp = e;
                break;
            }
        }
        return emp;
    }

    @Override
    public String deleteEmployeeById (int employId) {
        for (Employee e: list
             ) {
            if(e.getEmployId()== employId){
                list.remove(e);
                break;
            }
        }
        return "Delete successfully";
    }

//    @Override
//    public Employee UpdateEmployee(int employId) {
//        Employee employee = null;

//        return employee;
//    }

}
