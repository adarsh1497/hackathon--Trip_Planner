package com.hackathon.TripPlanner.model;

import lombok.Getter;

public enum Type {
	
	CULTURAL(1) ,
	WATER_SPORTS_AND_SCUBA_DIVING(2),
	ADVENTURE_HIKING(3),
	ECOTOURISM(4),
	CULTURAL_FOR_MUSEUMS(5),
	LOCAL_TRADITION(6),
	CULINARY(7) ,                      // FOOD IS MAJOR CRITERIA
	RELIGIOUS_DESTINATIONS(8),
	SHOPPING_DESTINATIONS(9);
	
	@Getter
	private int value;
	
	

	private Type(int value) {
		this.value = value;
	}
	
	
}
