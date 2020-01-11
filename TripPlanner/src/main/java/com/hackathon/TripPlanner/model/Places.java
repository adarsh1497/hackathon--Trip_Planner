package com.hackathon.TripPlanner.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	@ManyToMany
	@Getter
	@Setter
	Set<Type> types;
	
	
}
