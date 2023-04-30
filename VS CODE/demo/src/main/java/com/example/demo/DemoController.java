package com.example.demo;

import java.util.Arrays;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    
    @GetMapping("/")
    @ResponseBody 
    public String index(){
      return "Hi Website.Welcome";
    }

    @GetMapping("/demo")
    public String demo(Model model){
      model.addAttribute("temp","Welcome to Thymeleaf..");
      model.addAttribute("flag", true);
      
      var empl=Arrays.asList("siva","raj kumar","guru");
      model.addAttribute("employee",empl);
      return "Demo";
    }

    @GetMapping("/greeting")
    public String greeting(){
      return "greeting";
    }

    @PostMapping("/processData")
    @ResponseBody
    public String processData(@RequestParam("name")String name){
      return "Welcome " +name;
    }
}
