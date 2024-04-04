package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.demo.entity.Bookings;
import com.example.demo.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/book")
	private Bookings bookParking(@RequestBody Bookings booking) {
		return this.adminService.bookParking(booking);
	}
	
	@PutMapping("/confirm")
	private void confirmBooking(@RequestParam String vehicleNumber) {
		
	}
	
	@DeleteMapping("/release")
	private void releaseParkingSlot(@RequestParam String vehicleNumber) {
		this.adminService.deleteBooking(vehicleNumber);
	}
}
