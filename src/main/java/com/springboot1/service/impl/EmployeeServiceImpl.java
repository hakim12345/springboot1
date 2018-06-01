package com.springboot1.service.impl;

import com.springboot1.dao.EmployeeDao;
import com.springboot1.domain.Employee;
import com.springboot1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getAll() {

        List<Employee> employeeList = employeeDao.getAll();
        return employeeList;
    }
}
