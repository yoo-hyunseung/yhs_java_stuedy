package com.sist.string;

import java.util.Scanner;

// String 메소드 (문자열 제어하는 기능)
/*
 *    String 문자열 배열
 *    ------ 문자마다 인덱스번호를 가지고 있다.(0 부터 시작)
 *    String s = "Hello Java";
 *                0123456789 ==> 오라클은 1번 
 *                자바 -> == != substring(0,3) => 012
 *                오라클 -> = <> substr(1,5) => 12345
 *                자바스크립트 === !== 
 *    주요기능 310 page
 *    1) 문자열에서 문자 한개 추출 => char charAt(int index);
 */
public class 라이브러리_String_3 {
	public static void main(String[] args) {
//		String msg = "Hello Java";
//		for(int i =0 ; i < msg.length();i++) {
//			System.out.println((i+1)+"번째 문자 : "+msg.charAt(i));
//		}
		// 코딩 테스트 문제 -> msg 를 거꾸로 출력
//		for(int i = msg.length()-1; i >=0; i--) {
////			System.out.println((i+1)+"번째 문자 : "+msg.charAt(i));
//			System.out.print(msg.charAt(i));
//		}
//		
		// 알파벳 문자열을 입력 받아서 대문자 몇개 소문자 몇개를 출력 하는 프로그램
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int upper = 0;
		int lower = 0;
		for(int i =0 ; i < str.length();i++) {
			char c = str.charAt(i);
			if(c >= 'A' && c <='Z') {
				upper++;
			}
			else if(c >= 'a' && c <= 'z') {
				lower++;
			}
		}
		System.out.println("대문자 갯수 : "+upper+", 소문자 갯수 : "+lower);
	}
}
