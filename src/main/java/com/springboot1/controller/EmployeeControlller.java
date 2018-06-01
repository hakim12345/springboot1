package com.springboot1.controller;


import com.springboot1.domain.Employee;
import com.springboot1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeControlller {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/springboot1/getAll" , method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> getAll()
    {
        System.out.println("Hello java....");
        List<Employee> employeeList = employeeService.getAll();

        return new ResponseEntity<List<Employee>>(employeeList , HttpStatus.OK);
    }
}