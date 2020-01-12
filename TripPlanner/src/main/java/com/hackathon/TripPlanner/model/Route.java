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
	
	@ManyToOne
	@Getter
	@Setter
	private User user;
	
	@Getter
	@Setter
	@OneToMany
	private Set<Place> selectedByUser;
	
	@Getter
	@Setter
	@OneToMany
	private List<Place> visitingSequence = new ArrayList<Place>() ;
	
	
	
	//  to be changed with Travelling SalesMan Algo
	public void setArrangedPlaces(Set<Place> selectedByUser) {
		for(Place place : selectedByUser) {
			visitingSequence.add(place);
		}
	}
	
}
