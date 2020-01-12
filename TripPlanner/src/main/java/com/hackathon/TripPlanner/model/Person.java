package com.hackathon.TripPlanner.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Person {
	

	@Id
	@Getter
	@Setter
	String userName;
	
	@NotNull
	@Getter
	@Setter
	String name;
	
	
	@Getter
	@Setter
	@NotNull
	String phoneNumber;
	
	@Getter
	@Setter
	String password;
	
	
}
