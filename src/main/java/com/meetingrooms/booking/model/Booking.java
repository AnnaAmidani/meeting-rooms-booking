package com.meetingrooms.booking.model;

import java.time.LocalDateTime;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Booking {
	
	@Id
	private String id;

	@Size(max = 20)
	private String roomName;
	
	private String roomRef;
	
	@JsonFormat(pattern="yyyy-MM-dd-HH:mm:ss")
	private LocalDateTime from;
	
	@JsonFormat(pattern="yyyy-MM-dd-HH:mm:ss")
	private LocalDateTime to;
	
	public Booking(String roomName, String roomRef, LocalDateTime from, LocalDateTime to) {
		this.roomName = roomName;
		this.roomRef = roomRef;
		this.from = from;
		this.to = to;
	}
	
	public Booking() {
		
	}

	
	
	public String getRoomName() {
		return roomName;
	}



	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}



	public String getRoomRef() {
		return roomRef;
	}



	public void setRoomRef(String roomRef) {
		this.roomRef = roomRef;
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
		return String.format("Booking[roomName=%s, roomRef='%s', from='%s', to='%s']", roomName, roomRef, from, to);
	}
}