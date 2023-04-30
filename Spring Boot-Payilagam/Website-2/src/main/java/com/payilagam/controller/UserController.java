package com.payilagam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.payilagam.dao.EmployeeDAO;
import com.payilagam.model.Employee;

@Controller
public class UserController {
	
	@Autowired
	EmployeeDAO empdao;
	
	@RequestMapping("index")
	public String employee()
	{
		return "index.jsp";
	}
	
	@RequestMapping("addEmp")
	public String addEmp(Employee emp)
	{
		empdao.save(emp);
		return "index.jsp";
	}
	
	@RequestMapping("getEmp")
	public ModelAndView getId(@RequestParam int id)
	{
		ModelAndView mav=new ModelAndView("showEmp.jsp");
		Employee emps=empdao.findById(id).orElse(new Employee());
		mav.addObject("emps",emps);
		return mav;
	}
	
	@RequestMapping("deleteEmp")
	public ModelAndView deleteId(@RequestParam int id)
	{
		ModelAndView mav=new ModelAndView("deleteEmp.jsp");
		Employee emps=empdao.findById(id).orElse(new Employee());
		empdao.deleteById(id);
		mav.addObject("emps",emps);
		return mav;
	}
	
	@RequestMapping("updateEmp")
	public ModelAndView updateName(Employee emps)
	{
		ModelAndView mav=new ModelAndView("updateEmp.jsp");
		emps=empdao.findById(emps.getId()).orElse(new Employee());
		empdao.deleteById(emps.getId());
		mav.addObject("emps",emps);
		return mav;
	}

}
