package com.trip.hack.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ITENERARY")
public class Itenerary implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 4470270585895392190L;
	
	@Id
	@GeneratedValue
	private int id;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
}
