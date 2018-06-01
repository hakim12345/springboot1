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
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAll() {

        Session session = sessionFactory.getCurrentSession();

        List<Employee> list= session.createCriteria(Employee.class).list();
        return list;
    }

    @Override
    public Employee getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee employee = (Employee) session.get(Employee.class ,id);
        return employee;
    }

    @Override
    public void create(Employee employee) {
        Session session =sessionFactory.getCurrentSession();
        session.save(employee);
    }
}
