package com.hackathon.TripPlanner.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.data.util.Pair;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Location implements Serializable  {

	
	@Id
	@Getter
	@Setter
	Double latitude;
	
	@Id
	@Getter
	@Setter
	Double longitude;

	@Getter
	@Setter
	@OneToOne
	Address address;

}
