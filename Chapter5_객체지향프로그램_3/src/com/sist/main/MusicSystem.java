package com.sist.main;

import java.util.Scanner;

public class MusicSystem {
	Music[] music = new Music[50];
	// 1. 메소드 => 생성자역할
	void init() {
		/*
		 *   인스턴스 : 객체 생성 => 객체명 변수 , 배열
		 *   static  : 클래스명. 배열명 바로 사용가능
		 *   
		 *   
		 */
		for(int i =0 ; i < MusicData.title.length;i++) {
//			System.out.println("할당전 music["+i+"]= "+music[i]);
			music[i] = new Music(); //music 크기의 메모리공간을 50개 생성
//			System.out.println("할당후 music["+i+"]= "+music[i]);
			music[i].title = MusicData.title[i];
			music[i].singer = MusicData.singer[i];
			music[i].album = MusicData.album[i];
			music[i].state = MusicData.state[i];
			music[i].modify = MusicData.modify[i];
		}
	}
	int menu() {
		System.out.println("==========Menu===========");
		System.out.println("1. 목록보기");
		System.out.println("2. 찾기");
		System.out.println("3. 상세보기");
		System.out.println("9. 프로그램 종료");
		System.out.println("=========================");
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴선택 : ");
		return scan.nextInt();
	}
	Music[] musicListData() {
		return music;
	}
	Music detailData(int n) {
		return music[n-1];
	}
	Music[] musicFindData(String title) {
		int count =0;
		for(Music mm : music) {
			if(mm.title.contains(title))count++;
		}
		Music[] m = new Music[count];
		int i = 0;
		for(Music mm : music) {
			if(mm.title.contains(title)) {
				m[i] = mm;
				i++;
			}
		}
		return m;
	}
	
//	public static void main(String[] args) {
//		MusicSystem ms = new MusicSystem();
//		ms.init();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("검색어 입력 : ");
//		String str = scan.next();
//		Music[] data = ms.musicFindData(str);
//		int i =1 ;
//		for(Music m : data) {
//			System.out.println(i+ "  " + m.title);
//			i++;
//		}
//		System.out.println("====================================");
//		System.out.println("상세보기 (1 ~ 50) ");
//		int no = scan.nextInt();
//		Music mm = ms.detailData(no);
//		System.out.println("title : "+mm.title);
//		System.out.println("singer : "+mm.singer);
//		System.out.println("album : "+mm.album);
//		System.out.println("state : "+mm.state);
//		System.out.println("modify : "+mm.modify);
//		
//	}
}
