package com.anigna.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anigna.api.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
    
}
