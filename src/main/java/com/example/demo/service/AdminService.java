package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bookings;
import com.example.demo.entity.Parking;
import com.example.demo.repository.BookingsRepo;
import com.example.demo.repository.ParkingRepo;

@Service
public class AdminService {
	
	@Autowired 
	private BookingsRepo bookingsRepo;
	
	@Autowired 
	private ParkingRepo parkingRepo;

	public Bookings bookParking(Bookings booking) {
		
		Parking parking = this.parkingRepo.findById(booking.getParking_Id()).get();
		
		if(booking.getVehicleType() == 2)
			parking.setTwoWheelerAvailableSlots(parking.getTwoWheelerAvailableSlots()-1);
		else
			parking.setFourWheelerAvailableSlots(parking.getFourWheelerAvailableSlots()-1);
		
		this.parkingRepo.save(parking);
		Bookings result = this.bookingsRepo.save(booking);
		
		return result;
	}

	public void deleteBooking(String vehicleNumber) {
		Bookings booking = this.bookingsRepo.getByVehicleNumber(vehicleNumber);
		Parking parking = this.parkingRepo.findById(booking.getParking_Id()).get();

		if(booking.getVehicleType() == 2)
			parking.setTwoWheelerAvailableSlots(parking.getTwoWheelerAvailableSlots()+1);
		else
			parking.setFourWheelerAvailableSlots(parking.getFourWheelerAvailableSlots()+1);

		this.parkingRepo.save(parking);
		
		this.bookingsRepo.delete(booking);
		
		
		
	}
	
	

}
