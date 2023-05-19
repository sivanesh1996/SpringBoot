package com.sivagroups.ems.service;

import java.util.List;

import com.sivagroups.ems.entity.Products;

public interface ProductsService {
    List<Products> getAllProducts();
    Products saveProduct(Products products);
}
