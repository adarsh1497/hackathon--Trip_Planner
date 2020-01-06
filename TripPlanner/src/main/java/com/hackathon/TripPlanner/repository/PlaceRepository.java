package com.hackathon.TripPlanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.TripPlanner.model.Places;

public interface PlaceRepository extends JpaRepository<Places, Long> {

}
