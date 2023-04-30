package com.payilagam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@GetMapping("/")
	@ResponseBody
	public String home(){
		return "<h2>Hi.Iam root path </h2>";
	}
	
	@GetMapping("/add/{a}/{b}")
	@ResponseBody
	public int add(@PathVariable("a")int a,@PathVariable("b")int b) {
		return (a+b);
	}
	
	
	@GetMapping("/addition")
	@ResponseBody
	public int addition(@RequestParam(value="a",defaultValue="1")int a,@RequestParam(value="b",defaultValue="2")int b) {
		return (a+b);
	}
	
	
	@GetMapping("/index")
	@ResponseBody
	public String index(){
		return "<h1>Welcome to Spring Boot Application</h1>";
	}
	
	@GetMapping("/welcome")
	public String welcome(){
		return "welcome";
	}

}
