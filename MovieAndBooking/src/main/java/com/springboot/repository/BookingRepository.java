package com.springboot.repository;

import java.util.*;

import com.springboot.domain.Booking;

public interface BookingRepository {

	Set<Integer> GetAllBookedSeats(int movieId);
	void bookSeat(Booking booking);	// save 기능입니다
	List<Booking> findAll();
	Set<Integer> getAllBookedSeats(int movieId);

}
