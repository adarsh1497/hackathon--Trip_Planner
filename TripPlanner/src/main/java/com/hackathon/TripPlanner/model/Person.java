package com.hackathon.TripPlanner.model;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

public class Person {
	
	@Id
	@Getter
	@Setter
	String userName;
	
	@NotNull
	@Getter
	@Setter
	String name;
	
	@NotNull
	@Getter
	@Setter
	String email;
	
	
	@Getter
	@Setter
	String password;
	
	
}
