package com.hackathon.TripPlanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.TripPlanner.model.Route;

public interface RouteRepository extends JpaRepository<Route, Long> {

}
