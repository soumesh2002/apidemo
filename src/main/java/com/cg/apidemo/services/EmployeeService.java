package com.cg.apidemo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.apidemo.entity.Employee;

import java.util.ArrayList;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public List<Employee> updateEmployee(int id, Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == employee.getId()) {
                employees.set(i, employee);
                break;
            }
        }
        return employees;
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
                break;
            }
        }
    }

    public List<Employee> getEmployeesByType(String type) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getEmploymentType().equalsIgnoreCase(type)) {
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }
}
