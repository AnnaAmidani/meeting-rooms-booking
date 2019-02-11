package com.meetingrooms.booking.model;

import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Booking {
	
	@Id
	private String id;

	@Size(max = 20)
	private String roomName;
	
	private String roomId;
	
	private LocalDateTime from;
	
	private LocalDateTime to;
	
	@Size(max = 50)
	private String bookingRef;
	
	@Max(value = 100)
	private int capacity; 
	
	@Size(max = 50)
	private String creator;
	
	@Size(max = 50)
	private String email;
	
	public Booking() {
		
	}	
	
	public String getRoomName() {
		return roomName;
	}



	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}



	public String getRoomId() {
		return roomId;
	}



	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}



	public String getBookingRef() {
		return bookingRef;
	}



	public void setBookingRef(String bookingRef) {
		this.bookingRef = bookingRef;
	}



	public int getCapacity() {
		return capacity;
	}



	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}



	public String getCreator() {
		return creator;
	}



	public void setCreator(String creator) {
		this.creator = creator;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public LocalDateTime getFrom() {
		return from;
	}



	public void setFrom(LocalDateTime from) {
		this.from = from;
	}



	public LocalDateTime getTo() {
		return to;
	}



	public void setTo(LocalDateTime to) {
		this.to = to;
	}



	@Override
	public String toString() {
		return String.format("Booking[roomName=%s, roomId='%s', from='%s', to='%s', bookingRef='%s', capacity='%s', creator='%s', email='%s']", roomName, roomId, from, to, bookingRef, capacity, creator, email);
	}
}