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
	private String checkinDate;
	
	@Column(name="checkout_Date")
	private String checkoutDate;
	
	
	public StaySafe(int id, String firstName, String lastName, String roomNumber, String checkinDate, String checkoutDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roomNumber = roomNumber;
		this.checkinDate = checkinDate;
		this.checkoutDate = checkoutDate;
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


	public String getCheckinDate() {
		return checkinDate;
	}


	public void setCheckinDate(String checkinDate) {
		this.checkinDate = checkinDate;
	}


	public String getCheckoutDate() {
		return checkoutDate;
	}


	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	
	
}
