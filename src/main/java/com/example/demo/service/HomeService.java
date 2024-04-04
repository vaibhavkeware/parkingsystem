package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Parking;
import com.example.demo.entity.User;
import com.example.demo.repository.ParkingRepo;
import com.example.demo.repository.UserRepo;

@Service
public class HomeService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ParkingRepo parkingRepo;
	
	public User addUser(User user) {
	     User result = this.userRepo.save(user);
	     return result;
	}

	public Parking addParking(Parking parking) {
		Parking result = this.parkingRepo.save(parking);
		return result;
	}

}
