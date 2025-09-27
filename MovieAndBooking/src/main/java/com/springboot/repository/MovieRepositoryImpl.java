package com.springboot.repository;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.springboot.domain.Movie;

@Repository
public class MovieRepositoryImpl implements MovieRepository{
	// Movie저장소 객체 -> 
	private List<Movie> movieRepoList = new ArrayList<Movie>();

	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return movieRepoList;
	}

	@Override
	public Movie findById(int movieId) {
		// TODO Auto-generated method stub
		return movieRepoList.stream()
	            .filter(m -> m.getMovieId() == movieId)
	            .findFirst()
	            .orElse(null);
	}


	
	
	public MovieRepositoryImpl() {
		Movie movie1 = new Movie() ;
		movie1.setMovieId(1);
		movie1.setInformation("2012년, 지구상 전 인류가 멸망한 가운데 홀로 살아남은 과학자 로버트 네빌은 필사적으로 또 다른 생존자를 찾아 나선다. 로버트는 마침내 인기척을 찾아내지만, 그들은 더 이상 인간이 아닌 바이러스에 감염된 변종 인류로 로버트를 위협해오기 시작한다. 로버트는 어딘가에 살아있을지 모를 생존자들을 위해, 항체를 가진 자신의 피를 이용해 백신을 만들기 위해 혼신의 힘을 다한다.");
		movie1.setActor("윌 스미스, 앨리스 브라가, 대시 미호크 출연");
		movie1.setLeftSeat(50);
		movie1.setRunningTime(97);
		movie1.setTitle("나는 전설이다");
		movie1.setPosterImg("../images/I_am_legend.jpg");
		
		Movie movie2 = new Movie() ;
		movie2.setMovieId(2);
		movie2.setInformation("1990년대에 유망주였던 F1 드라이버 소니 헤이즈는 사고로 선수 생활이 끝날 뻔하고, 30년 후에 그는 한 팀 소유주의 설득으로 레이싱에 복귀하게 된다.");
		movie2.setActor("브래드 피트,댐슨 이드리스,케리 콘던,하비에르 바르뎀 출연");
		movie2.setLeftSeat(50);
		movie2.setRunningTime(155);
		movie2.setTitle("F1 : 더 무비");
		movie2.setPosterImg("../images/F1Poster.jpg");
		
		Movie movie3 = new Movie() ;
		movie3.setMovieId(3);
		movie3.setInformation("가리봉동 소탕작전 후 4년 뒤, 금천서 강력반은 베트남으로 도주한 용의자를 인도받아 오라는 미션을 받는다. 괴물형사 ‘마석도’와 ‘전일만’ 반장은 현지 용의자에게서 수상함을 느끼고, 그의 뒤에 무자비한 악행을 벌이는 ‘강해상'이 있음을 알게 된다. ‘마석도’와 금천서 강력반은 한국과 베트남을 오가며 역대급 범죄를 저지르는 ‘강해상’을 본격적으로 쫓기 시작하는데...");
		movie3.setActor("마동석,손석구,최귀화,박지환,허동원 출연");
		movie3.setLeftSeat(50);
		movie3.setRunningTime(106);
		movie3.setTitle("범죄도시 2");
		movie3.setPosterImg("../images/The_Roundup.jpg");
		
		Movie movie4 = new Movie() ;
		movie4.setMovieId(4);
		movie4.setInformation("만우절에 연인과 헤어진 경찰 223은 슬픈 마음을 달래기 위해 술집을 찾아가고, 그곳에서 금발 머리가 매력적인 마약 밀매상을 만나게 된다. 한편, 여자친구가 떠난 후 슬픔에 잠겨있는 경찰 663은 여자친구가 마지막으로 남긴 편지를 애써 외면하고, 단골집 점원 페이는 우연히 그 편지 속에서 경찰 663의 집 열쇠를 발견한다.");
		movie4.setActor("임청하,금성무,양조위,왕페이 출연");
		movie4.setLeftSeat(50);
		movie4.setRunningTime(102);
		movie4.setTitle("중경삼림");
		movie4.setPosterImg("../images/chungching_express.jpg");
		
		Movie movie5 = new Movie();
		movie5.setMovieId(5);
		movie5.setInformation("지구의 모든 것이 얼어붙은 후, 인류 생존을 위해 17년째 기차를 타고 횡단하며 살아가는 소수의 생존자들의 이야기, 꼬리 칸의 가난한 사람들은 머리 칸의 부유한 사람들에 대항하여 혁명을 일으키고, 꼬리 칸의 지도자 커티스는 엔진 칸을 향해 나아가지만, 결국 열차 전체의 구조를 바꾸지 않고는 진정한 혁명이 될 수 없음을 깨닫게 되는데...");
		movie5.setActor("크리스 에반스,송강호,틸다 스윈튼,고아성,제이미 벨 출연");
		movie5.setLeftSeat(50);
		movie5.setRunningTime(126);
		movie5.setTitle("설국열차");
		movie5.setPosterImg("../images/snowpiercer.jpg");
		
		Movie movie6 = new Movie();
		movie6.setMovieId(6);
		movie6.setInformation("아내와 어린 딸과 함께 사는 오대수는 술이 취해 집에 돌아가는 길에 누군가에게 납치당한다. 8평의 좁은 방에서 감금당한 채 매일 군만두를 먹는 대수는 우연히 뉴스를 통해 아내가 살해당했고 아내의 살인범으로 자신이 지목되고 있음을 알게 된다. 15년 동안 탈출을 위해 온갖 방법을 다 쓰던 어느 날, 대수는 갑자기 자유를 얻게 되고, 납치범을 찾아 복수하기 위해 시내의 모든 중국집을 샅샅이 뒤진다.");
		movie6.setActor("최민식,유지태,강혜정,윤진서,김병옥,오달수 출연");
		movie6.setLeftSeat(50);
		movie6.setRunningTime(120);
		movie6.setTitle("올드보이");
		movie6.setPosterImg("../images/oldboy.jpg");
		
		
		// add
		movieRepoList.add(movie1);
		movieRepoList.add(movie2);
		movieRepoList.add(movie3);
		movieRepoList.add(movie4);
		movieRepoList.add(movie5);
		movieRepoList.add(movie6);
		
	}
	
	
	public List<Movie> getAllMovies() {
		return movieRepoList;
	}

}
