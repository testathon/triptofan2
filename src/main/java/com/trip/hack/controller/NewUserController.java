package com.trip.hack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class NewUserController {

	@RequestMapping("/add")
	public String newUser(ModelMap modelMap) {
		
		return "newUser";
	}
}
