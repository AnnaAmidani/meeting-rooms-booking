package com.meetingrooms.booking.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.meetingrooms.booking.model.Booking;
import com.meetingrooms.booking.service.BookingService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path = "/bookings")
class BookingController {

	private Logger log = LoggerFactory.getLogger(BookingController.class);

	@Autowired
	BookingService bookingService;


	@GetMapping(value = "/findAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Booking> findAll() {
		return bookingService.findAll();
	}

	@ApiOperation(value = "Finds all the existing bookings for a meeting room", notes = "Provides the overall list of bookings for a meeting room", response = Booking.class, responseContainer = "List")
	@GetMapping(value = "/findByRoomNumber", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Booking> findByRoomRef(String roomRef) {
		return bookingService.findByRoomRef(roomRef);
	}


	@ApiOperation(value = "Stores a new booking for a meeting room", response = Booking.class)
	@PostMapping(path = "/bookARoom", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Booking> submitQuestion(@RequestBody @Valid Booking booking) {
		bookingService.bookARoom(booking);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}