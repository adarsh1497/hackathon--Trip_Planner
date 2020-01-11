package com.hackathon.TripPlanner.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.TripPlanner.model.Type;
import com.hackathon.TripPlanner.repository.TypeRepository;

@RestController
@RequestMapping("/type")
public class TypeController {
	
	@Autowired
	TypeRepository typeRepo;
	
	
	@GetMapping("/all")
	public List<Type> getAllTypes(){
		return typeRepo.findAll();
	}
	
	/*
	 * @PostMapping("/add") public Type addTypes(@RequestBody Type type) {
	 * 
	 * 
	 * }
	 */
	
}
