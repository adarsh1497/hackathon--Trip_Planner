package com.hackathon.TripPlanner.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address")
public class Address extends Auditable {
	
	@Getter
	@Setter
	String address;
	
	@Getter
	@Setter
	String cityName;
	
	@Getter
	@Setter
	String country;
	
}
