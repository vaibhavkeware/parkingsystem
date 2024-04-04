package com.example.demo.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class OtpService {

	public String generateOtp() {
	   final String CHARACTERS = "0123456789";
	   final int OTP_LENGTH = 6;
	   
	   Random random = new Random();
       StringBuilder otp = new StringBuilder(OTP_LENGTH);
       for (int i = 0; i < OTP_LENGTH; i++) {
           otp.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
       }
       return otp.toString();
	}
	
	public boolean validateOtp(String userOtp) {
		return true;
	}
}
