package com.springboot1.dao.impl;

import com.springboot1.dao.EmployeeDao;
import com.springboot1.domain.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = false)
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional(readOnly = false)
    public List<Employee> getAll() {

        Session session = sessionFactory.getCurrentSession();

        List<Employee> list= session.createCriteria(Employee.class).list();
        return list;
    }
}
