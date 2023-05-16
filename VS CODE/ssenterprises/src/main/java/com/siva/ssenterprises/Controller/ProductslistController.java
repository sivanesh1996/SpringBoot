package com.siva.ssenterprises.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.siva.ssenterprises.Model.Productslist;
import com.siva.ssenterprises.Service.ProductslistService;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
@RequestMapping("/productslist")
public class ProductslistController {
    
    @Autowired
    private ProductslistService productslistServ;

   

    @GetMapping
    private String getAllProducts(Model m){
        return productslistServ.retrieve(m);
    }

    @GetMapping("/productslistById")
    private String getProductById(@RequestParam int pid,Model model){
        return productslistServ.retrieveone(pid, model);
    }

    @PostMapping
    public String saveProduct(Productslist productslist,Model model){
        return productslistServ.create(productslist, model);
    }

    @GetMapping("/update")
    public String updateProduct(Productslist productslist,Model model){
        return productslistServ.update(productslist, model);
    }

    
    
}