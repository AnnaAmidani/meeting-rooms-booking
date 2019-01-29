package com.meetingrooms.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meetingrooms.booking.model.Booking;
import com.meetingrooms.booking.repository.BookingRepository;
import com.mongodb.MongoClient;


@Service
public class BookingServiceImpl implements BookingService {

	protected final BookingRepository bookingRepository;
	protected final MongoClient client;

	@Autowired
	public BookingServiceImpl(final BookingRepository bookingRepository, MongoClient client) {
		this.bookingRepository = bookingRepository;
		this.client = client;
	}

	@Override
	public List<Booking> findAll() {
		return bookingRepository.findAll();
	}

	@Override
	public Booking bookARoom(final Booking booking) {
		return bookingRepository.save(booking);
	}


}