package com.payilagam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.payilagam.dao.ContactsDAO;
import com.payilagam.model.Contacts;

@Controller
public class ContactsController {
	
	@Autowired
	ContactsDAO contactsdao;
	
	@RequestMapping("home")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("savePage")
	public String savePage()
	{
		return "savePage.jsp";
	}
	
	@RequestMapping("save")
	public ModelAndView save(Contacts contact)
	{
		
		ModelAndView mav=new ModelAndView("saved.jsp");
		contactsdao.save(contact);
		//contact=contactsdao.findById(contact.getMobile()).orElse(new Contacts());
		mav.addObject("ct",contact);
		
		return mav;
	}
	
	@RequestMapping("disPage")
	public String disPage()
	{
		return "disContact.jsp";
	}
	
	@RequestMapping("display")
	public ModelAndView display(@RequestParam String name)
	{
		ModelAndView mav=new ModelAndView("disContact.jsp");
		Contacts contact=contactsdao.findById(name).orElse(new Contacts());
		mav.addObject("ct",contact);
		return mav;
	}
	
	@RequestMapping("viewAll")
	public ModelAndView viewAll()
	{
		ModelAndView mav=new ModelAndView("disContact.jsp");
		Iterable<Contacts> contact=contactsdao.findAll();
		mav.addObject("ct",contact);
		return mav;
	}
	
	
	
	@RequestMapping("delPage")
	public String delPage()
	{
		return "delContact.jsp";
	}
	
	
	@RequestMapping("delete")
	public ModelAndView del(@RequestParam String name)
	{
		ModelAndView mav=new ModelAndView("delete.jsp");
		Contacts contact=contactsdao.findById(name).orElse(new Contacts());
		contactsdao.deleteById(name);
		mav.addObject("ct",contact);
		return mav;
	}
	
	@RequestMapping("updatePage")
	public String updatePage()
	{
		return "updatePage.jsp";
	}

	@RequestMapping("update")
	public ModelAndView update(@RequestParam String name)
	{
		ModelAndView mav=new ModelAndView("update.jsp");
		Contacts contact=contactsdao.findById(name).orElse(new Contacts());
		contactsdao.deleteById(name);
		mav.addObject("ct",contact);
		return mav;
	}
	
	
	@RequestMapping("updated1")
	public ModelAndView updated1(Contacts contact)
	{
		
		ModelAndView mav=new ModelAndView("updated2.jsp");
		contactsdao.save(contact);
		//contact=contactsdao.findById(contact.getMobile()).orElse(new Contacts());
		mav.addObject("ct",contact);
		
		return mav;
	}
}
