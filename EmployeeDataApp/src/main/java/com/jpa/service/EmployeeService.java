package com.jpa.service;

import java.util.List;

import com.jpa.model.Employee;

public interface EmployeeService {
    List <Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    }
