package com.cg.apidemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.apidemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByEmploymentType(String employmentType);
}
