package com.lcw.user.service.entities;

public class Hotel {
	
	private String id;
	private String name;
	private String location;
	private String about;
	
	
	public Hotel(String id, String name, String location, String about) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.about = about;
	}


	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getLocation() {
		return location;
	}


	public String getAbout() {
		return about;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public void setAbout(String about) {
		this.about = about;
	}

	
}
