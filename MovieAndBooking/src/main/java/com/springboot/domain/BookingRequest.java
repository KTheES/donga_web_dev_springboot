 package com.springboot.domain;

public class BookingRequest {


	private int movieId;	// 고유 ID
	private String bookingStatus;	// 예매상태
	private int seatNum; 	// 좌석번호
	private int price;	// 
	
	// 생성자
	
	public BookingRequest(int movieId, String bookingStatus, int seatNum, int price) {
		this.movieId = movieId;
		this.bookingStatus = bookingStatus;
		this.seatNum = seatNum;
		this.price = price;
	}
	
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
	
}

