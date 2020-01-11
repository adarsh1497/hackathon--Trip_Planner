package com.hackathon.TripPlanner.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Route implements Serializable {
	
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
	private List<Places> visitingSequence;
	
	
}
