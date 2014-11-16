package com.trip.hack.view;

import java.io.Serializable;
import java.util.List;

import com.trip.hack.domain.User;

public class UserViewBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8711404970411307722L;
	private List<String> errorMessage;
	private String name;
	private String email;
	private String reenteredEmail;
	private String password;
	private String reenteredPassword;

	public List<String> getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(List<String> errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReenteredEmail() {
		return reenteredEmail;
	}

	public void setReenteredEmail(String reenteredEmail) {
		this.reenteredEmail = reenteredEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReenteredPassword() {
		return reenteredPassword;
	}

	public void setReenteredPassword(String reenteredPassword) {
		this.reenteredPassword = reenteredPassword;
	}

	public boolean hasErrors() {
		return !errorMessage.isEmpty();
	}
}
