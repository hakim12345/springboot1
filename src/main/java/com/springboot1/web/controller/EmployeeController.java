package com.springboot1.web.controller;


import com.springboot1.domain.Employee;
import com.springboot1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/springboot1"})
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Employee>> getAll()
    {
        List<Employee> employeeList = employeeService.getAll();

        return new ResponseEntity<List<Employee>>(employeeList , HttpStatus.OK);
    }

    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<Employee> getById(@PathVariable("id") int id)
    {
        Employee employee = employeeService.getById(id);

        return  new ResponseEntity<Employee>(employee , HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Void> create(@RequestBody Employee employee)
    {
        employeeService.create(employee);
        HttpHeaders headers = new HttpHeaders();
        return  new ResponseEntity<Void>(headers , HttpStatus.CREATED);
    }
}