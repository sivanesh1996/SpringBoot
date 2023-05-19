package com.sivagroups.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sivagroups.ems.entity.Products;
import com.sivagroups.ems.service.ProductsService;

@Controller
public class ProductsController {
    
   // @Autowired
    private ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        super();
        this.productsService = productsService;
    }

    @GetMapping("/products")
    public String listProducts(Model model){
        model.addAttribute("products", productsService.getAllProducts());
        return "products";
    }

    @GetMapping("products/new")
    public String createProductForm(Model model){
        Products products=new Products();
        model.addAttribute("products", products);
        return "createProduct";
    }

    @PostMapping("/products")
    public String saveProduct(@ModelAttribute("products") Products products){
        productsService.saveProduct(products);
        return "redirect:/products";
}
}
