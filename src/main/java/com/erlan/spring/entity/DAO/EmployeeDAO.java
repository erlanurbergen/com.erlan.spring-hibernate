package com.erlan.spring.entity.DAO;

import com.erlan.spring.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployyees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);
}
