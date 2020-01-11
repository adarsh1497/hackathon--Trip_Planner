package com.hackathon.TripPlanner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.TripPlanner.model.City;
import com.hackathon.TripPlanner.repository.CityRepository;

@RestController
@RequestMapping("/cities")
public class CityController {

	@Autowired
	CityRepository cityRepo;
	
	@GetMapping("/all")
	public List<City> getAllCities(){
		return cityRepo.findAll();
	}
	
	
	
	
}
