package com.erlan.spring.entity.service;

import com.erlan.spring.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployyees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);
}
