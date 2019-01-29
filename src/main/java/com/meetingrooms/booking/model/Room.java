package com.meetingrooms.booking.model;

import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Room {

	private String roomName;
	
	private String roomId;
	
	public Room() {
		
	}
	
	public Room(String roomName, String roomId) {
		this.roomId = roomId;
		this.roomName = roomName;
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
	
}