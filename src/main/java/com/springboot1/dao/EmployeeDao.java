package com.springboot1.dao;

import com.springboot1.domain.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getAll();
}
