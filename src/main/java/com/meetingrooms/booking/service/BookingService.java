package com.meetingrooms.booking.service;

import java.util.List;
import com.meetingrooms.booking.model.AvailabilityRequest;

import com.meetingrooms.booking.model.Booking;

public interface BookingService {
	
	List<Booking> findAll();
	
	Booking bookARoom(final Booking booking);

	boolean isAvailable(AvailabilityRequest availabilityReequest);
}
