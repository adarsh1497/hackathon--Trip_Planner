package com.hackathon.TripPlanner.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.TripPlanner.model.City;
import com.hackathon.TripPlanner.model.Places;
import com.hackathon.TripPlanner.model.Type;
import com.hackathon.TripPlanner.repository.CityRepository;
import com.hackathon.TripPlanner.repository.PlaceRepository;

@RestController
@RequestMapping("/places")
public class PlacesController {

	@Autowired
	PlaceRepository placeRepo;
	
	@Autowired
	CityRepository cityRepo;
	
	@GetMapping("/filter")
	public Set<Places> filteredPlaces(@RequestBody Set<Type> types){
		Set<Places> places = new HashSet<Places>();
		for(Type type : types) {
			for(Places place :type.getPlaces()) {
				places.add(place);
			}
		}
		return places;
	}
	
	@PostMapping("/add")
	public Places addPlace(@RequestBody Places place) {
		City city = place.getCity();
		city.addPlace(place);
		//cityRepo.save(city);
		placeRepo.save(place);
		return place;
	}
}
