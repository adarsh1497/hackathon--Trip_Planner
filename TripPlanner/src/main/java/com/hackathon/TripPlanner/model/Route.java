package com.hackathon.TripPlanner.model;

import java.util.List;
import java.util.Set;

import javax.persistence.OneToMany;

public class Route {
	
	
	
	@OneToMany
	private Set<Places> selectedByUser;
	
	@OneToMany
	private List<Places> visitingSequence;
	
	
}
