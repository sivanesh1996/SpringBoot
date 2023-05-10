package com.anigna.api.Controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.anigna.api.Model.Employee;
import com.anigna.api.Service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class ApiController {
    
    @Autowired
    private EmployeeService employeeService;

   
    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.retrieve();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id){
        Optional<Employee> employee=employeeService.retrieveOne(id);
        if(employee.isPresent()){
            return new ResponseEntity<>(employee.get(),HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public String saveEmployee(@RequestBody Employee employee){
        Optional<Employee> _employee=employeeService.create(employee);
        if(_employee.isPresent()){
            return "The employee data have been saved sucessfully";
        }
        else{
            return "Employee already exists in record";
        }
    }

   
}
