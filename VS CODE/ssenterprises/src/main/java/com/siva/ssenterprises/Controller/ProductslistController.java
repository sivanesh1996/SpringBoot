package com.siva.ssenterprises.Controller;

import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.siva.ssenterprises.Model.Productslist;
import com.siva.ssenterprises.Service.ProductslistService;


@Controller
@RequestMapping("/productslist")
public class ProductslistController {
    
    @Autowired
    private ProductslistService productslistServ;

   

    @GetMapping
    private String getAllProducts(Model m){
        return productslistServ.retrieve(m);
    }

    @GetMapping("/productslist?pid={pid}")
    private String getProductById(@RequestParam("pid")int pid,Model model){
        return productslistServ.retrieveone(pid,model);
    }
}