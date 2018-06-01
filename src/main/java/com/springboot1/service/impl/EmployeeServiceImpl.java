package com.springboot1.service.impl;

import com.springboot1.dao.EmployeeDao;
import com.springboot1.domain.Employee;
import com.springboot1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    @Transactional(readOnly = false)
    public List<Employee> getAll() {

        return employeeDao.getAll();
    }

    @Override
    @Transactional(readOnly = true)
    public void create(Employee employee) {
       employeeDao.create(employee);
    }

    @Override
    @Transactional(readOnly = false)
    public Employee getById(int id) {

        return employeeDao.getById(id);
    }
}
