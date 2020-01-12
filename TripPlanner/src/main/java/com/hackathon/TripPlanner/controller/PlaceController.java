package com.hackathon.TripPlanner.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
import com.hackathon.TripPlanner.repository.TypeRepository;

@RestController
@RequestMapping("/dev")
public class PlaceController {

	@Autowired
	PlaceRepository placeRepo;
	
	@Autowired
	CityRepository cityRepo;
	
	@Autowired
	TypeRepository typeRepo;
	
	@GetMapping("/place/all")
	public List<Place> getAllPlaces(){
		return placeRepo.findAll();
	}
	
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
	
	
	@PostMapping("/place/{cityId}/{typeId}")
	public Place addPlace( @Valid @RequestBody Place place ,  @PathVariable("cityId") Long cityId , @PathVariable("typeId") Long typeId )  {
		City city = cityRepo.findById(cityId).get();
		Type type = typeRepo.findById(typeId).get();
		
		Place newPlace = new Place();
		
		newPlace.setRating(place.getRating());
		newPlace.setCity(city);
		newPlace.setDescription(place.getDescription());
		newPlace.setLocation(place.getLocation());
		newPlace.setName(place.getName());
		newPlace.addType(type);
		
		placeRepo.save(newPlace);
		city.addPlace(newPlace);
		cityRepo.save(city);
		return newPlace;
	}
	
}
