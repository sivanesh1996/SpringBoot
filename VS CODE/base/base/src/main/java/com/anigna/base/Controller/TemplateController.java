package com.anigna.base.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateController {
    
    @GetMapping("/")
    public String Home(){
        return "startup";
    }
}
