package com.springboot.domain;

public class Booking {
	
	private int movieId;	// 고유번호
	private String movieTitle;	// 제목
	private int time;	// 러닝타임
	private int seatNum;	// 좌석번호
	private int price;	// 가격
	private boolean paid;
	
	// 생성자
	public Booking(int movieId,String movieTitle, int time, int seatNum, int price, boolean paid) {
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.time = time;
		this.seatNum = seatNum;
		this.price = price;
		this.paid = paid;
	}
	
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean getPaid() {
		return paid;
	}
	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	
	
}
