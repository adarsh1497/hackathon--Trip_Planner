package com.hackathon.TripPlanner.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
public class User extends Person {
	
	
	@Getter
	@Setter
	@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
	private  Set<Route> routes ; 
	
	
	
}
