package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bookings;
import com.example.demo.entity.Parking;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/showparking")
	private List<Parking> getParking(@RequestParam String location){
		
		return null;
	}
	
	@GetMapping("/showavailableparking")
	private List<Parking> getAvailableParking(@RequestParam String location, int vehicleType){
		
		return null;
	}
	
	@PostMapping("/bookonline")
	private void bookOnlineParking(@RequestBody Bookings booking) {
		
	}
}
