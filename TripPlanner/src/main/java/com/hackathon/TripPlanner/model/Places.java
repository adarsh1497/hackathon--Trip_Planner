package com.hackathon.TripPlanner.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.type.TrueFalseType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true , value = {"types"})
@Entity
@Table(name = "places")
public class Places extends Auditable {
	
	
	@Getter
	@Setter
	private String description;
	
	@Getter
	@Setter
	private float rating;
	
	
	@Getter
	@Setter
	private String placeName;
	
	@Getter
	@Setter
	Location location;
	
	@ManyToOne
	@Getter
	@Setter
    private City city;
	
	@ManyToMany
	@Getter
	@Setter
	private Set<Type> types;
	
	public void addType(Type type) {
		types.add(type);
	}
}
