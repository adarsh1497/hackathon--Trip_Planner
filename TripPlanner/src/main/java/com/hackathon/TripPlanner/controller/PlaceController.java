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
import com.hackathon.TripPlanner.model.Place;
import com.hackathon.TripPlanner.model.Route;
import com.hackathon.TripPlanner.model.Type;
import com.hackathon.TripPlanner.repository.CityRepository;
import com.hackathon.TripPlanner.repository.PlaceRepository;
import com.hackathon.TripPlanner.repository.RouteRepository;

@RestController
@RequestMapping("/dev")
public class PlaceController {

	@Autowired
	PlaceRepository placeRepo;
	
	@Autowired
	CityRepository cityRepo;
	
	@Autowired
	RouteRepository routeRepo;
	
	@GetMapping("/place/filter")
	public Set<Place> filteredPlaces(@RequestBody Set<Type> types){
		Set<Place> places = new HashSet<Place>();
		for(Type type : types) {
			for(Place place :type.getPlaces()) {
				places.add(place);
			}
		}
		Route route = new Route();
		route.setSelectedByUser(places);
		return places;
	}
	
	
	@PostMapping("/place")
	public Place addPlace(@RequestBody Place place) {
		City city = place.getCity();
		city.addPlace(place);
		
		cityRepo.save(city);
		
		placeRepo.save(place);
		return place;
	}
	
	
}
