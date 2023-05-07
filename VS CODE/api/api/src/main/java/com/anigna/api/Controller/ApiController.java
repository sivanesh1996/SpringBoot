package com.anigna.api.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.anigna.api.Model.Employee;
import com.anigna.api.Repository.EmployeeRepository;

@RestController
public class ApiController {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @GetMapping("/getEmployee/{id}")
    public Optional<Employee> getEmployee(@PathVariable Integer id){
        return employeeRepository.findById(id);
    }
}
