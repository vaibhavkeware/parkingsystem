package com.example.demo.controller;

import org.json.JSONObject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@GetMapping("/paymentpage")
	private ModelAndView getPaymentOrder() {
		ModelAndView md = new ModelAndView();
		
		md.setViewName("paymentpage");
		
		return md;
	}
	@PostMapping("/pay")
	private String createPaymentOrder() throws RazorpayException {
		
		var client = new RazorpayClient("rzp_test_RrqZOQ68kp057g", "AZNS0jfQWks76MbFnuQm6SVa");
		
		JSONObject ob = new JSONObject();
		ob.put("amount", 2000);
		ob.put("currency", "INR");
		
		Order order = client.Orders.create(ob);
		return order.toString();
	}
	
	@GetMapping("/showuserform")
	private ModelAndView showUserForm(Model model ) {
		ModelAndView mnv = new ModelAndView();
	    mnv.setViewName("signup");
	    
		model.addAttribute("user", new User());
		
	    return mnv;
	}
}
