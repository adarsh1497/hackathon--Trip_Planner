package com.hackathon.TripPlanner.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true , value = {"places"})
@Entity
public class City extends Auditable {

	@Getter
	@Setter
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@Getter
	@Setter
	private Location location;

	@Getter
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Places> places = new HashSet<Places>();
	
	public void addPlace(Places place) {
		places.add(place);
	}
}


/*
 * city.getPlaces().add(new Place()); cityRepository.save(city);
 */