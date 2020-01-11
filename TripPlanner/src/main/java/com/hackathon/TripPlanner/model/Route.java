package com.hackathon.TripPlanner.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Route extends Auditable {
	
	@Id
	@ManyToOne
	@Getter
	@Setter
	private User user;
	
	@Getter
	@Setter
	@OneToMany
	private Set<Places> selectedByUser;
	
	@Getter
	@Setter
	@OneToMany
	private List<Places> visitingSequence = new ArrayList<Places>() ;
	
	/*
	 * public double getDistance(Places p1 , Places p2) {
	 * p1.getAddress().location.latitude }
	 */
	public void setArrangedPlaces(Set<Places> selectedByUser) {
		
	}
	
}
