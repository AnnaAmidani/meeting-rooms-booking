package com.meetingrooms.booking.service;

import java.util.List;

import com.meetingrooms.booking.model.Booking;

public interface BookingService {
	
	List<Booking> findAll();

	List<Booking> findByRoomRef(String roomRef);
	
	Booking bookARoom(final Booking booking);
	
}
