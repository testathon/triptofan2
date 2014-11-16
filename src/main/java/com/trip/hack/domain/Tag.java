package com.trip.hack.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAG")
public class Tag implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5036814852217370780L;
	
	@Id
	@GeneratedValue
	private int id;
	
    /**
     */
    private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
