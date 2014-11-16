package com.trip.hack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
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
		validateUserForm(user);
		if (user.hasErrors()) {
			clearPasswords(user);
		}
		return new ModelAndView("newUser", "command", user);
	}

	private void validateUserForm(UserViewBean user) {
		if (!StringUtils.hasText(user.getEmail())) {
			user.addErrorMessage("Must enter an email!");
		}
		if (!StringUtils.hasText(user.getReenteredEmail())) {
			user.addErrorMessage("Must re-enter your email!");
		}
		if (!StringUtils.hasText(user.getPassword())) {
			user.addErrorMessage("Must enter a password!");
		}
		if (!StringUtils.hasText(user.getReenteredPassword())) {
			user.addErrorMessage("Must re-enter your password!");
		}

		if ((StringUtils.hasText(user.getEmail())
				&& StringUtils.hasText(user.getReenteredEmail()) && StringUtils
					.hasText(user.getReenteredEmail()))
				&& !user.getEmail().equals(user.getReenteredEmail())) {
			user.addErrorMessage("Entered emails do not match!");
		}
		if ((StringUtils.hasText(user.getEmail()) && StringUtils.hasText(user
				.getReenteredEmail())) && !user
				.getPassword().equals(user.getReenteredPassword())) {
			user.addErrorMessage("Entered passwords do not match!");
		}
	}

	private void clearPasswords(UserViewBean user) {
		user.setPassword("");
		user.setReenteredPassword("");
	}

	@RequestMapping("/new")
	public ModelAndView newUser() {
		return new ModelAndView("newUser", "command", new UserViewBean());
	}
}
