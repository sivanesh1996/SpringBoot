package com.payilagam.dao;

import org.springframework.data.repository.CrudRepository;

import com.payilagam.model.Employee;

public interface EmployeeDAO extends CrudRepository<Employee,Integer> {

}
