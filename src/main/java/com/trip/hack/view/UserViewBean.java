package com.trip.hack.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.trip.hack.domain.User;

public class UserViewBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8711404970411307722L;
	private List<String> errorMessages = new ArrayList<String>();
	private String name;
	private String email;
	private String reenteredEmail;
	private String password;
	private String reenteredPassword;

	public void addErrorMessage(String errorMessage) {
		errorMessages.add(errorMessage);
	}

	public void clearErrorMessages() {
		errorMessages.clear();
	}

	public List<String> getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(List<String> errorMessage) {
		this.errorMessages = errorMessage;
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
		return !errorMessages.isEmpty();
	}
}
