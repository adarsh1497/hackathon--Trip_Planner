package com.hackathon.TripPlanner.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address")
public class Address {
	
	@Getter
	@Setter
	String address;
	
	@Getter
	@Setter
	int pincode;
	
	
	@Getter
	@Setter
	String city;
	
	
	
	@Getter
	@Setter
	String country;
	
	@OneToOne
	@Getter
	@Setter
	Location location;
	
	
}