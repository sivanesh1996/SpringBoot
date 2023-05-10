package com.anigna.api.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anigna.api.Model.Employee;
import com.anigna.api.Repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> retrieve(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> retrieveOne(int empid){
        return employeeRepository.findById(empid);
    }
    
    public Optional<Employee> create(Employee employee){
        if(employeeRepository.existsById(employee.getId())){
            return Optional.empty();
        }
        else{
            return Optional.of(employeeRepository.save(employee));
        }
    }
    
}
