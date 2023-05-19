package com.sivagroups.ems.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sivagroups.ems.entity.Products;
import com.sivagroups.ems.repository.ProductsRepository;
import com.sivagroups.ems.service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    
    // public ProductsServiceImpl(ProductsRepository productsRepository) {
    //     super();
    //     this.productsRepository = productsRepository;
    // }


    @Override
    public List<Products> getAllProducts() {
      return productsRepository.findAll();
    }
    
}
