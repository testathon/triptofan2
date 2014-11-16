package com.trip.hack.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Itenerary implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 4470270585895392190L;

	/**
     */
    private String name;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Event> events = new ArrayList<Event>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
    
}
