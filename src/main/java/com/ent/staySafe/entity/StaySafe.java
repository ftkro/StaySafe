package com.ent.staySafe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StaySafe")
public class StaySafe {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="room_number")
	private String roomNumber;
	
	@Column(name="checkin_Date")
	private String checkInDate;
	
	@Column(name="checkout_Date")
	private String checkOutDate;
	
	
	public StaySafe(int id, String firstName, String lastName, String roomNumber, String checkInDate, String checkOutDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roomNumber = roomNumber;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}


	public String getCheckInDate() {
		return checkInDate;
	}


	public void setCheckInDate(String checkinDate) {
		this.checkInDate = checkInDate;
	}


	public String getCheckOutDate() {
		return checkOutDate;
	}


	public void setCheckoutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
	
}
