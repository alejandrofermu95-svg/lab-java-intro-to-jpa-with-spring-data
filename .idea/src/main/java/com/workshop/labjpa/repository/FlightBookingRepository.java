package com.workshop.labjpa.repository;

import com.workshop.labjpa.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {

    List<FlightBooking> findByCustomerId(Integer customerId);

    List<FlightBooking> findByFlightId(Integer flightId);
}
