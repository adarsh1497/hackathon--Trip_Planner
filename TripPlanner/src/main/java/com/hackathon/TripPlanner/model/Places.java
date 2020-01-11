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
	private String description;
	
	@Getter
	@Setter
	private float rating;
	
	
	@Getter
	@Setter
	private String name;
	
	@OneToOne
	@Getter
	@Setter
	private Address address;
	
	@ManyToOne
	@Getter
	@Setter
    private City city;
	
	@ManyToMany
	@Getter
	@Setter
	private Set<Type> types;
	
	
}
