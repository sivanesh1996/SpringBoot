package com.payilagam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
public class IndexController {
	
	@RequestMapping("index")
	public ModelAndView index(@RequestParam("uname")String s,
			HttpSession session)
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("username",s);
		mav.setViewName("index");
		//session.setAttribute("username",s);
		return mav;
	}

}
