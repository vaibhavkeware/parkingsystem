package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Bookings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	
	private int parking_Id;
	
	private int user_Id;
	
	private int vehicleType;
	
	private Date inTime;
	
	private String status; 
	
	private String vehicleNumber;

	public Bookings(int bookingId, int parking_Id, int user_Id, int vehicleType, Date inTime, String status, String vehicleNumber) {
		super();
		this.bookingId = bookingId;
		this.parking_Id = parking_Id;
		this.user_Id = user_Id;
		this.vehicleType = vehicleType;
		this.inTime = inTime;
		this.status = status;
		this.vehicleNumber = vehicleNumber;
	}

	public Bookings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(int vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Date getInTime() {
		return inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getParking_Id() {
		return parking_Id;
	}

	public int getUser_Id() {
		return user_Id;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

}
