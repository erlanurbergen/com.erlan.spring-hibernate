package com.erlan.spring.entity.service;

import com.erlan.spring.entity.DAO.EmployeeDAO;
import com.erlan.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class EmployeeServiceImplementation implements EmployeeService{


    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployyees() {
        return employeeDAO.getAllEmployyees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }
}
