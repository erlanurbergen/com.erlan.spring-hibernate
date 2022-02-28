package com.erlan.spring.entity.controllers;

import com.erlan.spring.entity.DAO.EmployeeDAO;
import com.erlan.spring.entity.DAO.EmployeeDAOImplementation;
import com.erlan.spring.entity.Employee;
import com.erlan.spring.entity.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String getAllEmployees(Model model) {

        List<Employee> allEmployyees = employeeService.getAllEmployyees();
        model.addAttribute("allEmployees", allEmployyees);
        return "allEmployees";
    }


    @RequestMapping("/addEmployee")
    public String addNewEmployee(Model model){

        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "addEmployee";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){

        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping(  "/updateEmployee")
    public String updateEmployee(@RequestParam("empId") int id, Model model) {

        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);

        return "addEmployee";
    }


    @RequestMapping("deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id, Model model){

        employeeService.deleteEmployee(id);

        return "redirect:/";
    }
}
