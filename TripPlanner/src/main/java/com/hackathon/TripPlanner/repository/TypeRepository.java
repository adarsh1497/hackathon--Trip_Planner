package com.hackathon.TripPlanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.TripPlanner.model.Type;

public interface TypeRepository extends JpaRepository<Type, Long>  {

}
