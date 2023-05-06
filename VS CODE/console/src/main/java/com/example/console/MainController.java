package com.example.console;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @Autowired
    EmployeeRepository employeerepository;

    @GetMapping("getEmployeeData")
    public String getEmployeeData(Model model){
        List<Employee> employeeData = employeerepository.findAll();
        model.addAttribute("employeeData", employeeData);
        return "EmployeeInfo";
    }
}
