package com.trip.hack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.trip.hack.view.UserViewBean;

@Controller
@RequestMapping("/user")
public class NewUserController {

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("user") UserViewBean user,
			BindingResult result) {
		return new ModelAndView("newUser", "command", user);
	}

	@RequestMapping("/new")
	public ModelAndView newUser() {
		return new ModelAndView("newUser", "command", new UserViewBean());
	}
}
