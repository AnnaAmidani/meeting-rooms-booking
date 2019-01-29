package com.meetingrooms.booking.service;

import java.util.List;

import com.meetingrooms.booking.model.Booking;
import com.meetingrooms.booking.model.Room;

public interface RoomService {
	
	List<Room> findAll();
		
}
