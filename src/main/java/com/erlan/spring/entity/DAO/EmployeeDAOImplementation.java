package com.erlan.spring.entity.DAO;

import com.erlan.spring.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
public class EmployeeDAOImplementation implements EmployeeDAO{


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployyees() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> allEmployees = session.createQuery("from Employee", Employee.class).getResultList();

        return allEmployees;
    }
}
