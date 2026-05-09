package com.workshop.labjpa.repository;

import com.workshop.labjpa.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
