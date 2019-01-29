package com.meetingrooms.booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meetingrooms.booking.model.Booking;
import com.meetingrooms.booking.model.Room;
import com.meetingrooms.booking.repository.BookingRepository;
import com.mongodb.MongoClient;


@Service
public class RoomServiceImpl implements RoomService {

	@Override
	public List<Room> findAll() {
		List <Room> roomList = new ArrayList <Room>();
		Room room1 = new Room("Tiger", "1");
		Room room2 = new Room("Lion", "2");
		Room room3 = new Room("Panther", "3");
		Room room4 = new Room("Penguin", "4");
		Room room5 = new Room("Dodo", "5");
		Room room6 = new Room("T-rex", "6");
		roomList.add(room1);
		roomList.add(room2);
		roomList.add(room3);
		roomList.add(room4);
		roomList.add(room5);
		roomList.add(room6);
		return roomList;
	}

}