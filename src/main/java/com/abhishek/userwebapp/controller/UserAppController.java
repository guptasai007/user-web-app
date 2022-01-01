package com.abhishek.userwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.abhishek.userwebapp.model.User;
import com.abhishek.userwebapp.repository.UserRepository;

@Controller
public class UserAppController {

	@Autowired
	private UserRepository repository;
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mav = new ModelAndView("index");
		List<User> allUsers = repository.findAll();
		mav.addObject("users", allUsers);
		return mav;
	}
}
