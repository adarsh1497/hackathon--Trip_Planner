package com.hackathon.TripPlanner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.TripPlanner.repository.RouteRepository;

@RestController
@RequestMapping("/dev")
public class RouteController {

	@Autowired
	RouteRepository routeRepo;
	
	
	
}
