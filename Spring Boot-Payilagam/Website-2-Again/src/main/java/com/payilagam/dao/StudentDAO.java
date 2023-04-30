package com.payilagam.dao;

import org.springframework.data.repository.CrudRepository;

import com.payilagam.model.Student;

public interface StudentDAO extends CrudRepository<Student,Integer> {

}
