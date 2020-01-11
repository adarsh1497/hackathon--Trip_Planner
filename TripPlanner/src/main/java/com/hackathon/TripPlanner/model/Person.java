package com.hackathon.TripPlanner.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)

public abstract class Person {
	
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
	@NotNull
	String phoneNumber;
	
	@Getter
	@Setter
	String password;
	
	
}
