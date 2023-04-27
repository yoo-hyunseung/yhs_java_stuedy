package com.sist.movie;

import java.util.*;
import java.io.*;
public class MovieSystem {
	private static ArrayList list = new ArrayList(); 
	// 하나의 데이터 인스턴스를 위해 공용으로 사용해서 추가/삭제/수정 용이 
	
	static {
		try {
			FileReader fr = new FileReader("/Users/yuhyeonseung/Desktop/sist/javaDev/movie.txt");
			int i=0; // 한글자 읽기 int로 읽어온다. => a => 65로 인식
			StringBuffer sb = new StringBuffer();
			while((i = fr.read())!=-1) {
				sb.append((char)i);
			}
			StringTokenizer st;
			String[] movies = sb.toString().split("\n");
			for(String m : movies) {
				st = new StringTokenizer(m,"|");
				MovieVO vo = new MovieVO();
				vo.setNo(Integer.parseInt(st.nextToken()));
				vo.setTitle(st.nextToken());
				vo.setGenre(st.nextToken());
				vo.setPoster(st.nextToken());
				vo.setActor(st.nextToken());
				vo.setRegdate(st.nextToken());
				vo.setGrade(st.nextToken());
				vo.setDirector(st.nextToken());
				list.add(vo);
			}
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	// menu
	public int movieMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("======= 영화메뉴 ======");
		System.out.println("1. 목록출력");
		System.out.println("2. 상세보기");
		System.out.println("3. 영화 검색");
		System.out.println("9. 시스템 종료.");
		System.out.println("=====================");
		System.out.print("menu 선택 : ");
		
		return scan.nextInt();
	}
	// 목록 출력 (페이지)
	public ArrayList movieListData(int page) {
		
		int totalpage = (int)(Math.ceil(list.size()/10.0)); // 1 ~ 194page
		int start = (page-1)*10; // 0 , 10 , 20, 30 ...
		int end = page*10;
		if(page == totalpage) {
			end = list.size() ;
//			end = (page*10)-(10-list.size()%10);// list.size();
		}
		ArrayList movieList = new ArrayList(list.subList(start, end));
		return movieList;
	}
	// 상세보기
	public MovieVO movieDetailData(int no) {
		return (MovieVO)list.get(no-1);
	}
	// 영화 검색
	// 조립
	public void process() {
		while(true) {
			int menu = movieMenu();
			if(menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(menu == 1) {
				Scanner scan = new Scanner(System.in);
				System.out.print("input page number(1 ~ 194) :");
				ArrayList mList = movieListData(scan.nextInt());
				for(int i =0 ; i < mList.size();i++) {
					MovieVO vo = (MovieVO)mList.get(i);
					System.out.println(vo.getNo()+". "+vo.getTitle());

				}
			}
			else if(menu ==2) {
				Scanner scan = new Scanner(System.in);
				System.out.print("input movie number(1 ~ 1938) :");
				MovieVO vo = movieDetailData(scan.nextInt());
				System.out.println("순위 : "+vo.getNo()+". 제목"+vo.getTitle());
				System.out.println("감독 : "+ vo.getDirector());
				System.out.println("출연 : "+ vo.getActor());
				System.out.println("장르 : "+ vo.getGenre());
			}
			else if(menu == 3) {
				Scanner scan = new Scanner(System.in);
				System.out.print("Search Movie name : ");
				
			}
		}
	}
	
	public static void main(String[] args) {
		MovieSystem ms = new MovieSystem();
		ms.process();
	}
}
