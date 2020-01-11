package com.hackathon.TripPlanner.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;


@Entity
public class City extends Auditable {
	
	//TimeZone timeZone;
	
	String name;
	
	
	Location location;

	
	
	Set<Places> places;
}
