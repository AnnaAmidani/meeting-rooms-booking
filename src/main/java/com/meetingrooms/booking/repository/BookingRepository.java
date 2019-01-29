package com.meetingrooms.booking.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.meetingrooms.booking.model.Booking;


@Repository
public interface BookingRepository extends MongoRepository<Booking, String> {


}
