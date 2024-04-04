package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Parking;

public interface ParkingRepo extends JpaRepository<Parking, Integer>{

}
