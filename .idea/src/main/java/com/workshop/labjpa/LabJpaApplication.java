package com.workshop.labjpa;

import com.workshop.labjpa.model.Customer;
import com.workshop.labjpa.model.CustomerStatus;
import com.workshop.labjpa.model.Flight;
import com.workshop.labjpa.model.FlightBooking;
import com.workshop.labjpa.repository.CustomerRepository;
import com.workshop.labjpa.repository.FlightBookingRepository;
import com.workshop.labjpa.repository.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LabJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabJpaApplication.class, args);
    }
    @Bean
    CommandLineRunner initData(CustomerRepository customerRepository,
                               FlightRepository flightRepository,
                               FlightBookingRepository bookingRepository) {

        return args -> {

            System.out.println("🔥 INSERTANDO DATOS...");

            Customer c1 = customerRepository.save(
                    new Customer("Alice", CustomerStatus.GOLD, 120000)
            );

            Customer c2 = customerRepository.save(
                    new Customer("Bob", CustomerStatus.SILVER, 80000)
            );

            Flight f1 = flightRepository.save(
                    new Flight("AB123", "Boeing 747", 300, 400)
            );

            Flight f2 = flightRepository.save(
                    new Flight("CD456", "Airbus A320", 180, 250)
            );

            bookingRepository.save(
                    new FlightBooking(c1.getId(), f1.getId())
            );

            bookingRepository.save(
                    new FlightBooking(c2.getId(), f2.getId())
            );
        };
    }
}
