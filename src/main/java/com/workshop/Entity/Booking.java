package com.workshop.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Booking {
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private String fromLocation;
	private String toLocation;
	private String tripType;
	private LocalDate startDate;
	private LocalDate returnDate;
	private LocalTime  time;
	private String distance;
	private String userid;
	private String bookingId;
	private String name;
	private String email;
	private String phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public String getTripType() {
		return tripType;
	}
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", fromLocation=" + fromLocation + ", toLocation=" + toLocation + ", tripType="
				+ tripType + ", startDate=" + startDate + ", returnDate=" + returnDate + ", time=" + time
				+ ", distance=" + distance + ", userid=" + userid + ", bookingId=" + bookingId + ", name=" + name
				+ ", email=" + email + ", phone=" + phone + "]";
	}
	public Booking(int id, String fromLocation, String toLocation, String tripType, LocalDate startDate,
			LocalDate returnDate, LocalTime time, String distance, String userid, String bookingId, String name,
			String email, String phone) {
		super();
		this.id = id;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.tripType = tripType;
		this.startDate = startDate;
		this.returnDate = returnDate;
		this.time = time;
		this.distance = distance;
		this.userid = userid;
		this.bookingId = bookingId;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
