package com.sivagroups.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sivagroups.ems.service.ProductsService;

@Controller
public class ProductsController {
    
    @Autowired
    private ProductsService productsService;

    // public ProductsController(ProductsService productsService) {
    //     super();
    //     this.productsService = productsService;
    // }

    @GetMapping("/products")
    public String listProducts(Model model){
        model.addAttribute("products", productsService.getAllProducts());
        return "products";
    }
    
}
