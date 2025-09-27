package com.springboot.controller;

import java.security.PublicKey;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.springboot.domain.Booking;
import com.springboot.domain.Movie;
import com.springboot.repository.MovieRepository;
import com.springboot.service.BookingService;
import com.springboot.service.MovieService;

import org.springframework.ui.Model;


@Controller
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	private final BookingService bookingService;
	private final MovieRepository movieRepository;
	
	public BookingController(BookingService bookingService, MovieRepository movieRepository) {
        this.bookingService = bookingService;
        this.movieRepository = movieRepository;
    }

	
	@RequestMapping(value = "/{movieId}", method=RequestMethod.GET)
	public String bookingPage(@PathVariable("movieId") int movieId, Model model) {
		Movie movie = movieRepository.findById(movieId);
		Set<Integer> bookedSeat = bookingService.getBookedSeats(movieId);
		
		model.addAttribute("movieId", movieId);
	    model.addAttribute("movie", movie);
	    model.addAttribute("bookedSeat", bookedSeat);
	    model.addAttribute("bookings", bookingService.findAllBookings());
		return "booking";
	}
	
	
	@RequestMapping(value= "/{movieId}", method=RequestMethod.POST)
	public String bookSeat(@PathVariable("movieId") int movieId,@RequestParam("seatNum") int seatNum, Model model) {
       bookingService.bookSeat(movieId, seatNum);
       model.addAttribute("message", "예매에 성공했습니다. 좌석 번호: " + seatNum);
	    
       return bookingPage(movieId, model);
	}
		
		
	
	}
	

