package com.hackathon.TripPlanner.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "places")
public class Places extends Auditable {
	
	@Getter
	@Setter
	String name;
	
	@OneToOne
	@Getter
	@Setter
	Address address;
	
	@ManyToOne
	@Getter
	@Setter
	City city;
	
	
	@OneToOne
	@Getter
	@Setter
	Location location;
}
