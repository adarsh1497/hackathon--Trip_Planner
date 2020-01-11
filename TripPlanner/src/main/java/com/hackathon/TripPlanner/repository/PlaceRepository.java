package com.hackathon.TripPlanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.TripPlanner.model.Place;

public interface PlaceRepository extends JpaRepository<Place, Long> {

}
