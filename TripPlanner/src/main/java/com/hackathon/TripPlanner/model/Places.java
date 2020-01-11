package com.hackathon.TripPlanner.model;

import java.util.Set;

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
	
	@Getter
	@Setter
	City city;
	
	
	Set<Type> types;
	
}
