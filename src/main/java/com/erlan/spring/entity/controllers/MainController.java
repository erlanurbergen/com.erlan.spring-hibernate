package com.erlan.spring.entity.controllers;

import com.erlan.spring.entity.DAO.EmployeeDAO;
import com.erlan.spring.entity.DAO.EmployeeDAOImplementation;
import com.erlan.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("/")
    public String getAllEmployees(Model model) {

        List<Employee> allEmployyees = employeeDAO.getAllEmployyees();
        model.addAttribute("allEmployees", allEmployyees);
        return "allEmployees";
    }
}
