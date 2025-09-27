package com.springboot.repository;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.springboot.domain.Booking;


@Repository
public class BookingRepositoryImpl implements BookingRepository{
	
	private final Map<Integer, Set<Integer>> bookedSeat = new HashMap<>();
	private final List<Booking> bookings = new ArrayList<>();
	
	@Override
	public Set<Integer> GetAllBookedSeats(int movieId) {
		// TODO Auto-generated method stub
		return bookedSeat.getOrDefault(movieId, new HashSet<>());
	}
	
	

	@Override
	public void bookSeat(Booking booking ) {
		bookedSeat.computeIfAbsent(booking.getMovieId(), m -> new HashSet<>()).add(booking.getSeatNum());
		bookings.add(booking);
		
	}



	@Override
	public List<Booking> findAll() {
		// TODO Auto-generated method stub
		return bookings;
	}



	@Override
	public Set<Integer> getAllBookedSeats(int movieId) {
		// TODO Auto-generated method stub
		return bookedSeat.getOrDefault(movieId, new HashSet<>());
	}
	
}
