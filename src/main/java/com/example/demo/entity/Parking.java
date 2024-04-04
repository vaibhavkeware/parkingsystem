package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Parking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int parkingId;
	
	private String parkingName;
	
	private String location;
	
	private int  fourWheelerSlots;
	
	private int twoWheelerSlots;
	
	private int fourWheelerAvailableSlots;
	
	private int twoWheelerAvailableSlots;

	public Parking(int parkingId, String parkingName, String location, int fourWheelerSlots, int twoWheelerSlots,
			int fourWheelerAvailableSlots, int twoWheelerAvailableSlots) {
		super();
		this.parkingId = parkingId;
		this.parkingName = parkingName;
		this.location = location;
		this.fourWheelerSlots = fourWheelerSlots;
		this.twoWheelerSlots = twoWheelerSlots;
		this.fourWheelerAvailableSlots = fourWheelerAvailableSlots;
		this.twoWheelerAvailableSlots = twoWheelerAvailableSlots;
	}

	public Parking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getParkingName() {
		return parkingName;
	}

	public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getFourWheelerSlots() {
		return fourWheelerSlots;
	}

	public void setFourWheelerSlots(int fourWheelerSlots) {
		this.fourWheelerSlots = fourWheelerSlots;
	}

	public int getTwoWheelerSlots() {
		return twoWheelerSlots;
	}

	public void setTwoWheelerSlots(int twoWheelerSlots) {
		this.twoWheelerSlots = twoWheelerSlots;
	}

	public int getFourWheelerAvailableSlots() {
		return fourWheelerAvailableSlots;
	}

	public void setFourWheelerAvailableSlots(int fourWheelerAvailableSlots) {
		this.fourWheelerAvailableSlots = fourWheelerAvailableSlots;
	}

	public int getTwoWheelerAvailableSlots() {
		return twoWheelerAvailableSlots;
	}

	public void setTwoWheelerAvailableSlots(int twoWheelerAvailableSlots) {
		this.twoWheelerAvailableSlots = twoWheelerAvailableSlots;
	}
	
	
}
