package com.siva.ssenterprises.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siva.ssenterprises.Model.Productslist;

@Repository
public interface ProductslistRepository extends JpaRepository<Productslist,Integer>{
    
}
