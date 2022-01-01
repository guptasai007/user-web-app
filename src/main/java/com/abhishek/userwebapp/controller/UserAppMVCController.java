package com.abhishek.userwebapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abhishek.userwebapp.model.User;
import com.abhishek.userwebapp.repository.UserRepository;

@Controller
public class UserAppMVCController {

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
	
	@RequestMapping("/newUserForm")
	public String newUserForm()
	{
		return "newUserForm";
	}
	
	@RequestMapping(value = "/addNewUser", method= RequestMethod.POST)
	public void addNewUser(@ModelAttribute User user, HttpServletResponse httpResponse) throws Exception
	{
		repository.save(user);
		httpResponse.sendRedirect("/");
	}
	
	@RequestMapping("/updateUser/{userId}")
	public ModelAndView updateUserForm(@PathVariable("userId") long userId)
	{
		ModelAndView mav = new ModelAndView("updateUserForm");
		User existingUser = repository.findById(userId).get();
		mav.addObject("userToUpdate", existingUser);
		return mav;		
	}
	
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public void updateUser(@ModelAttribute User user, HttpServletResponse httpResponse) throws Exception
	{
		repository.save(user);
		httpResponse.sendRedirect("/");
	}
}