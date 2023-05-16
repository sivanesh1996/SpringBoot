package com.siva.ssenterprises.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @GetMapping("/index")
    private String index(){
        return "index";
    }

    @GetMapping("/productmanagement")
    private String productmanagement(){
        return "ProductManagement";
    }
    
}
