package com.hackathon.TripPlanner.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true , value = {"types","city"})
@Entity
@Table(name = "places")
public class Place extends Auditable {
	
	@Getter
	@Setter
	private String description;
	
	@Getter
	@Setter
	private float rating;
	
	@Getter
	@Setter
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@Getter
	@Setter
	private Location location;
	
	@ManyToOne
	@Getter
	@Setter
    private City city ;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@Getter
	@Setter
	private Set<Type> types = new HashSet<Type>();
	
	public void addType(Type type) {
		types.add(type);
	}
}
