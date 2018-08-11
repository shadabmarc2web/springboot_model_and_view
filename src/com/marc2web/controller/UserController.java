package com.marc2web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.marc2web.model.User;

@Controller
public class UserController {
	
	@RequestMapping(value="/listUsers")
	public ModelAndView listUsers() {
		
		return new ModelAndView("listUsers","listUserMessage","SHOWING LIST OF USERS");
	}
	
	@RequestMapping(value="/saveUser")
	public ModelAndView saveUser(User user) {
		
		return new ModelAndView("saveUser","saveUserMessage","User Data is Saved.");
	}
	
	@RequestMapping(value="/deleteUser")
	public ModelAndView ListUser() {
		
		return new ModelAndView("deleteUser","deleteUserMessage","User Data Deleted");
	}

}
