package com.payilagam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class IndexController {
	
	@RequestMapping("index")
	public ModelAndView index(UserDetails ud) {
		/*HttpSession session=request.getSession();
		String s=request.getParameter("name");*/
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("details", ud); //model object
		mav.setViewName("index");//setting view
		
		//session.setAttribute("username", s); //model

		return mav; 

	}
	
	

}
