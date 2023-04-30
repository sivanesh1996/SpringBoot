package com.payilagam.dao;

import org.springframework.data.repository.CrudRepository;

import com.payilagam.model.Contacts;

public interface ContactsDAO extends CrudRepository<Contacts,String> {

}