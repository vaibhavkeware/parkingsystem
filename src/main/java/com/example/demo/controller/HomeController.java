package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Parking;
import com.example.demo.entity.User;
import com.example.demo.service.EmailService;
import com.example.demo.service.HomeService;

import jakarta.mail.MessagingException;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private HomeService homeService;

	@Autowired
	private EmailService emailService;
	
	@GetMapping("/signin")
	private void signIn(@RequestBody User user){
		
	}
	
	@PostMapping("/signup")
	private User signUp(@ModelAttribute("user") User user){
		User result = this.homeService.addUser(user);
		return result;
	}
	
	@PostMapping("/register")
	private Parking registerParking(@RequestBody Parking parking){
		Parking result = this.homeService.addParking(parking);
		return result;
	}
	
	@GetMapping("/generateotp")
	private void generateOtp(@RequestParam String mailId) throws MessagingException {
		this.emailService.sendOtpEmail(mailId);
	}
	
	@GetMapping("/validateotp")
	private String validateOtp(@RequestParam int otp) {
		
		return null;
	}
	
}
