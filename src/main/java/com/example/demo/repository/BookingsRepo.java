package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Bookings;

public interface BookingsRepo extends JpaRepository<Bookings, Integer> {

	@Query(value="Select b from Bookings b where b.vehicleNumber =:vehicleNumber ")
	Bookings getByVehicleNumber(String vehicleNumber);

}
