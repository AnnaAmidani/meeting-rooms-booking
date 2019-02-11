package com.meetingrooms.booking.model;

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