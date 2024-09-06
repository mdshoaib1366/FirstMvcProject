package com.nareshit.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	@RequestMapping("/sayHome")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/student")
	public ModelAndView student()
	{
		String name = "Shoaib";
		Integer roll = 101;
		ModelAndView model = new ModelAndView();
		model.setViewName("student");
		model.addObject("name", name);
		model.addObject("roll", roll);
		return model;
	}
	
	@RequestMapping("/showList")
	public ModelAndView list()
	{
		Date date = new Date();
		
		List<String> al = new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("3");
		ModelAndView mv = new ModelAndView("list");
		mv.addObject("alist", al);
		mv.addObject("date", date);
		return mv;
	}
	
}
