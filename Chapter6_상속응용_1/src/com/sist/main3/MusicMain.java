package com.sist.main3;
import java.util.Scanner;

public class MusicMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("선택 (지니 1 멜론 2)");
		int select = scan.nextInt();
		// => 상속 -> 클래스를 통합 할 수 있다.
		/*
		 *  상속 
		 *    => 객체 생성
		 *    => 상위클래스 = 하위 클래스
		 *       -------------------
		 */
		GenieMusicSystem ms = null;
		if(select == 1) {
			ms = new GenieMusicSystem(); // musicAllData();
		}
		else {
			ms = new MelonMusicSystem();// musicAllData();
		}
		// 1. 목록 출력
		Music [] music = ms.musicAllData();
		System.out.println(ms.title);
		for(Music m : music) {
			System.out.println(m.getRank()+". "+m.getTitle());
		}
	}
}
