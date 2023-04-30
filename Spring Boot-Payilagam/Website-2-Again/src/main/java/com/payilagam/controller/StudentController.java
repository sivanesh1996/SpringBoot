package com.payilagam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.payilagam.dao.StudentDAO;
import com.payilagam.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentDAO studentdao;
	
	@RequestMapping("index")
	public String index()
	{
		return "index.jsp";
	}
	
	@RequestMapping("addStud")
	public String add(Student stud)
	{
		studentdao.save(stud);
		return "index.jsp";
	}
	
	@RequestMapping("viewStud")
	public ModelAndView view(@RequestParam int id)
	{
		ModelAndView mav=new ModelAndView("viewStud.jsp");
		Student student=studentdao.findById(id).orElse(new Student());
		mav.addObject(student);
		return mav;
	}
	
	@RequestMapping("delStud")
	public ModelAndView del(@RequestParam int id)
	{
		ModelAndView mav=new ModelAndView("delStud.jsp");
		Student student=studentdao.findById(id).orElse(new Student());
		studentdao.deleteById(id);
		mav.addObject(student);
		return mav;
	}
	
	@RequestMapping("updateStud")
	public ModelAndView del(Student student)
	{
		ModelAndView mav=new ModelAndView("updateStud.jsp");
		student=studentdao.findById(student.getId()).orElse(new Student());
		studentdao.deleteById(student.getId());
		mav.addObject(student);
		return mav;
	}

}
