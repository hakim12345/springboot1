package com.springboot1.service;

import com.springboot1.domain.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    Employee getById(int id);

    void create(Employee employee);
}
