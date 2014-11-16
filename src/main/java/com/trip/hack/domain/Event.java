package com.trip.hack.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Event implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 7210306164300582702L;

	/**
     */
    private String name;

    /**
     */
    private String summary;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     */
    @ElementCollection
    private List<Cost> cost = new ArrayList<Cost>();

    /**
     */
    @ManyToOne
    private Location location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<Cost> getCost() {
		return cost;
	}

	public void setCost(List<Cost> cost) {
		this.cost = cost;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
