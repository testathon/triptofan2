package com.trip.hack.domain;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Tag implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5036814852217370780L;
	
    /**
     */
    private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
