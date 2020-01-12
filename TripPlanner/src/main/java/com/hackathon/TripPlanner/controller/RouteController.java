package com.hackathon.TripPlanner.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.TripPlanner.model.Route;
import com.hackathon.TripPlanner.repository.RouteRepository;

@RestController
@RequestMapping("/dev")
public class RouteController {

	@Autowired
	RouteRepository routeRepo;

	/*
	 * @GetMapping("/route/user/{userId}") public Set<Route>
	 * getRoutesSelectedByUser(@PathVariable("userId") String userId){ return }
	 * 
	 * @GetMapping("/route") public List<Route> getRoute(){
	 * 
	 * }
	 */

}
