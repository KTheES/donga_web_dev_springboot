package com.springboot.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springboot.domain.Booking;
import com.springboot.domain.Movie;
import com.springboot.repository.BookingRepository;
import com.springboot.repository.MovieRepository;

@Service
public class BookingService {

    private final PaymentService paymentService;
	private final BookingRepository bookingRepository;
	private final MovieRepository movieRepository;
	
	public BookingService(BookingRepository bookingRepository, MovieRepository movieRepository, PaymentService paymentService) {
		this.bookingRepository = bookingRepository;
		this.movieRepository = movieRepository;
		this.paymentService = paymentService;
	}
	
	
	public boolean isSeatAvailable(int movieId, int seatNum) {
		Set<Integer> booked = bookingRepository.GetAllBookedSeats(movieId);
		return !booked.contains(seatNum);
	}
	
	public Booking bookSeat(int movieId, int seatNum) {
		Movie movie = movieRepository.findById(movieId);
		
		Booking booking = new Booking(movieId, movie.getTitle(), movie.getRunningTime(), seatNum, movie.getPrice(), true);
				
		boolean paid = paymentService.processPayment(movie.getPrice());
		booking.setPaid(paid);
		
		bookingRepository.bookSeat(booking);
		return booking;
	}
	
	public Set<Integer> getBookedSeats(int movieId) {
	    return bookingRepository.getAllBookedSeats(movieId);
	}

	
	public List<Booking> findAllBookings() {
	    return bookingRepository.findAll();
	}


	


}
