package com.hackathon.TripPlanner.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "locations")
public class Location extends Auditable {

	@Getter
	@Setter
	String address;
	
	@Getter
	@Setter
	String country;
	
	@Getter
	@Setter
	private Double latitude;
	
	
	@Getter
	@Setter
 	private Double longitude;

}
