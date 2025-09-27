package com.springboot.domain;

public class Movie {
	
	public Movie() {
		super();
	}
	private int movieId;					// 고유 번호
	private String title;			// 제목
	private String actor;			// 배우
	private int runningTime;		// 총 상영 시간
	private String information; 	//영화 정보
	private int leftSeat;	//남은 좌석 수
	private String posterImg;
	private final int price = 15000;

	//생성자
	public Movie(int movieId,String title,String actor,int runningTime,String information,int leftSeat,String posterImg) {
		this.movieId = movieId;
		this.title= title;
		this.actor = actor;
		this.runningTime = runningTime;
		this.information = information;
		this.leftSeat = leftSeat;
		this.posterImg = posterImg;
	}
	
	//getter/setter 
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public int getLeftSeat() {
		return leftSeat;
	}
	public void setLeftSeat(int leftSeat) {
		this.leftSeat = leftSeat;
	}

	public int getPrice() {
		return price;
	}

	public void setPosterImg(String posterImg) {
		this.posterImg = posterImg;
	}

	public String getPosterImg() {
		return posterImg;
	}
	
	
	public void bookSeat() {
		if(leftSeat>0) {
			leftSeat --;
		}else {
			System.out.println("예매 가능한 좌석 없음");
		}
	}
	
	
}
