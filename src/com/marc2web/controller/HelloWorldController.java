package com.marc2web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.marc2web.service.ServiceClass;


@Controller
@RequestMapping(value= "/")
public class HelloWorldController {
	

@RequestMapping(method=RequestMethod.GET)
	public String visitHome() {
		return "home";

	}
	
	
}
