package com.hackathon.TripPlanner.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.TripPlanner.model.City;
import com.hackathon.TripPlanner.model.Place;
import com.hackathon.TripPlanner.model.Type;
import com.hackathon.TripPlanner.repository.CityRepository;

@RestController
@RequestMapping("/dev")
public class CityController {

	@Autowired
	CityRepository cityRepo;
	
	@GetMapping("/cities")
	public List<City> getAllCities(){
		return cityRepo.findAll();
	}
	
	
	@GetMapping("/cities/{id}")
	public City getCity(@PathVariable("id") Long id) {
		return cityRepo.findById(id).get();
	}
	
	@PostMapping("/cities")
	public City addCity(@RequestBody City city) {
		cityRepo.save(city);
		return city;
	}
	
	@GetMapping("/cities/places/{id}")
	public Set<Place> getAllPlaces(@PathVariable("id") Long id){
		Optional<City> city = cityRepo.findById(id);
		return city.get().getPlaces();
	}
	
	@DeleteMapping("/cities/{id}")
	public void deleteCity(@PathVariable("id") Long id) {
		if(cityRepo.existsById(id))
			cityRepo.deleteById(id);
		
	}
	
	
	
}
