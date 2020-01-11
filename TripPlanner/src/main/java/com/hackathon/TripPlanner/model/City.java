package com.hackathon.TripPlanner.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;


@Entity
public class City extends Auditable {
	
	
	@Getter
	@Setter
	String name;
	
	
	/*
	 * @Getter
	 * 
	 * @Setter Location location;
	 */
	
	@Getter
	@Setter
	@OneToMany
	Set<Places> places;
}
