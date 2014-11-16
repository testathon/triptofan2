package com.trip.hack.domain;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Location implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -311151837166897503L;

	/**
     */
    private String name;

    /**
     */
    private String addrLine1;

    /**
     */
    private String addrLine2;

    /**
     */
    private String city;

    /**
     */
    private String stateCode;
    
    /**
     */
    private Number zip;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrLine1() {
		return addrLine1;
	}

	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	public String getAddrLine2() {
		return addrLine2;
	}

	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public Number getZip() {
		return zip;
	}

	public void setZip(Number zip) {
		this.zip = zip;
	}

}
