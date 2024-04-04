package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {
	
//	@Autowired
//    private JavaMailSender javaMailSender;
	
	@Autowired
	private OtpService otpService;

    public void sendOtpEmail(String to) throws MessagingException {
    	
//    	String otp = otpService.generateOtp();
//    	String subject = "OTP from Parking System ";
//    	String body = "Otp for parking system is";
//        MimeMessage message = javaMailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message, true);
//        helper.setTo(to);
//        helper.setSubject(subject);
//        helper.setText(body);
//        javaMailSender.send(message);
    }
}
