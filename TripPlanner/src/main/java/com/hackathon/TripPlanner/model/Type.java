package com.hackathon.TripPlanner.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Type extends Auditable {
	
	@Getter
	@Setter
	private String type;
	
	
	@ManyToMany
	@Getter
	@Setter
	List<Places> places;
	
}
