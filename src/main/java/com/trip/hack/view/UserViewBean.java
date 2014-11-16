package com.trip.hack.view;

import java.io.Serializable;
import java.util.List;

import com.trip.hack.domain.User;

public class UserViewBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4627290303622642259L;
	private User user;
	private List<String> errorMessage;

	public boolean hasErrors() {
		return !errorMessage.isEmpty();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
