package com.Genspark.AssignmentSpringBoot.Dao;

import com.Genspark.AssignmentSpringBoot.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
}
