package com.sivagroups.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sivagroups.ems.entity.Products;

public interface ProductsRepository extends JpaRepository<Products,Integer>{
    
}
