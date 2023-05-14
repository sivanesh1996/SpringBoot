package com.siva.ssenterprises.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.siva.ssenterprises.Model.Productslist;
import com.siva.ssenterprises.Repository.ProductslistRepository;


@Service
public class ProductslistService {

    @Autowired
    private ProductslistRepository productslistRepo;

    public String retrieve(Model model){
       List<Productslist> products= productslistRepo.findAll();
       model.addAttribute("products",products);
       return "getAllProducts";
    }

    public String retrieveone(int pid,Model model){
    
       Optional<Productslist> products= productslistRepo.findById(pid);
        model.addAttribute("products",products);
        return "getProduct";
    }
    
}
