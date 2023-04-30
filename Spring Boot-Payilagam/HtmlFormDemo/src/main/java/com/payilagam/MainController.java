package com.payilagam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;


@Controller
public class MainController {
	
	@GetMapping("/evenForm")  //page controller
	public String evenForm() {
		return "even";
	}
	
	@GetMapping("/processEven")  //process controller
	public String processEven(@RequestParam("number")int number,Model model) {
		model.addAttribute("number",number);
		if(number%2==0) {
			model.addAttribute("result","Even");
		}
		else {
			model.addAttribute("result", "Not Even");
		}
		return "evenresult";
	
	}
}
