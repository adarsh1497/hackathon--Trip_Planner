package com.hackathon.TripPlanner.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;


@JsonIgnoreProperties(ignoreUnknown = true, value = {"places"})
@Entity
public class Type extends Auditable {
	
	@Getter
	@Setter
	private String type;
	
	
	@ManyToMany(mappedBy="types")
	@Getter
	@Setter
	private List<Place> places;
}
