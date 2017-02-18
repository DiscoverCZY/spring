package com.discover.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SimpleSpringMVCController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		 ModelAndView view = new ModelAndView();
		 view.addObject("message", "Fuck the whole world");
		 view.setViewName("index");
		 return view;
	}
}
