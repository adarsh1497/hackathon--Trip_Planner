package com.hackathon.TripPlanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.TripPlanner.model.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
