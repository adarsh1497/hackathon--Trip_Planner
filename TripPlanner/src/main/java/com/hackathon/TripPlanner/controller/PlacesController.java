package com.hackathon.TripPlanner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.TripPlanner.model.Places;
import com.hackathon.TripPlanner.repository.PlaceRepository;

@RestController
@RequestMapping("/places")
public class PlacesController {

	@Autowired
	PlaceRepository placeRepo;
	
	@GetMapping("/getPlaces/{}")
	public List<Places> getPlaces(){
		return placeRepo.findAll();
	}
	
}
