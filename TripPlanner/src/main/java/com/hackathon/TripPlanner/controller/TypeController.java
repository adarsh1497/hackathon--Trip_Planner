package com.hackathon.TripPlanner.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.TripPlanner.model.Place;
import com.hackathon.TripPlanner.model.Type;
import com.hackathon.TripPlanner.repository.PlaceRepository;
import com.hackathon.TripPlanner.repository.TypeRepository;

@RestController
@RequestMapping("/dev")
public class TypeController {
	
	@Autowired
	TypeRepository typeRepo;
	
	@GetMapping("/type")
	public List<Type> getAllTypes(){
		return typeRepo.findAll();
	}
	
	@PostMapping("/type/add")
	public Type createType(@RequestBody Type type) {
		typeRepo.save(type);
		return type;
	}
	
	@GetMapping("/type/{typeId}")
	public List<Place> getAllPlacesWithThisType(@PathVariable("typeId") Long typeId){
		Type type = typeRepo.findById(typeId).get() ;
		return type.getPlaces();
	}
	
	/*
	 * @PostMapping("/add") public Type addTypes(@RequestBody Type type) {
	 * 
	 * 
	 * }
	 */
	
}
