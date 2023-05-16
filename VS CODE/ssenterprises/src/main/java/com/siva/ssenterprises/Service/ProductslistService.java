package com.siva.ssenterprises.Service;
import java.util.List;


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
    
       Productslist _products=productslistRepo.findById(pid).orElse(new Productslist());
       model.addAttribute("products",_products);
        return "getAllProducts";
    }
    
    public String create(Productslist productslist,Model model){
      productslistRepo.save(productslist);
      List<Productslist> products= productslistRepo.findAll();
       model.addAttribute("products",products);
       return "getAllProducts";
     
    }

    public String update(Productslist productslist,Model model){
      if(productslistRepo.existsById(productslist.getPid())){
         model.addAttribute("productslist",productslist);
         productslistRepo.deleteById(productslist.getPid());
         
         return "update";
      }
      else{
         String s="this product id doesnt exists";
         model.addAttribute("stringData",s);
         model.addAttribute("productslist",productslist);
         return "getAllProducts";
      }
    }
}
