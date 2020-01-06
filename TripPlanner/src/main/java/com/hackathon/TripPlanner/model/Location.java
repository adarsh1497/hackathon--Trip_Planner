package com.hackathon.TripPlanner.model;

import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

public class Location  {
	
	
	@Getter
	@Setter
	Double latitude;
	
	
	@Getter
	@Setter
	Double longitude;
	
	@Getter
	@Setter
	@OneToOne
	Address address;
	
}
