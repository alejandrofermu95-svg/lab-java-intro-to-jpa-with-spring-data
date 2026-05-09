package com.workshop.labjpa.repository;

import com.workshop.labjpa.model.*;
import com.workshop.labjpa.model.Customer;
import com.workshop.labjpa.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByStatus(CustomerStatus status);

    List<Customer> findByTotalMilesGreaterThan(Integer miles);
}
