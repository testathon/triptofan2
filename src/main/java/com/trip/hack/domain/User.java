package com.trip.hack.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class User implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 5325408405136831039L;
	
    /**
     */
    private String email;

    /**
     */
    private String name;

    /**
     */
    private String password;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Itenerary> createdIteneries = new ArrayList<Itenerary>();

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Itenerary> favoriteIteneries = new ArrayList<Itenerary>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Itenerary> getCreatedIteneries() {
		return createdIteneries;
	}

	public void setCreatedIteneries(List<Itenerary> createdIteneries) {
		this.createdIteneries = createdIteneries;
	}

	public List<Itenerary> getFavoriteIteneries() {
		return favoriteIteneries;
	}

	public void setFavoriteIteneries(List<Itenerary> favoriteIteneries) {
		this.favoriteIteneries = favoriteIteneries;
	}

}
