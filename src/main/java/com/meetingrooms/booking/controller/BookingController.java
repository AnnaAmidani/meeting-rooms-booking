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
import com.meetingrooms.booking.model.Room;
import com.meetingrooms.booking.service.BookingService;
import com.meetingrooms.booking.service.RoomService;

import io.swagger.annotations.ApiOperation;

import com.meetingrooms.booking.model.AvailabilityRequest;
import com.meetingrooms.booking.model.AvailabilityResponse;

@RestController
@RequestMapping(path = "/bookings")
class BookingController {

	private Logger log = LoggerFactory.getLogger(BookingController.class);

	@Autowired
	BookingService bookingService;
	
	@Autowired
	RoomService roomService;

	@GetMapping(value = "/findAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Booking> findAll() {
		return bookingService.findAll();
	}
	
	@GetMapping(value = "/roomNames", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Room> getRoomNames() {
		return roomService.findAll();
	}

	@ApiOperation(value = "Stores a new booking for a meeting room", response = Booking.class)
	@PostMapping(path = "/bookARoom", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Booking> submitQuestion(@RequestBody @Valid Booking booking) {
		bookingService.bookARoom(booking);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

  @PostMapping(path = "/isAvailable", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public AvailabilityResponse isAvailable(@RequestBody AvailabilityRequest availabilityRequest){
		return new AvailabilityResponse(bookingService.isAvailable(availabilityRequest));
	}

}