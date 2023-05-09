package com.anigna.api.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anigna.api.Model.Employee;
import com.anigna.api.Repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployeeById(int empid){
        return employeeRepository.findById(empid);
    }

    public double calculateSalary(int empid){
        Employee emp=employeeRepository.getById(empid);
        int experience=emp.getExperience();
        return experience * 10000;
    }
    
}
