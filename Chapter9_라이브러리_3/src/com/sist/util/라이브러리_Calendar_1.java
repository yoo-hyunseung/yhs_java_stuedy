package com.sist.util;

import java.util.*;
/*
 *   Calendar : Date 클래스를 보완해서 새롭게 만든 클래스
 *   1) Calendar 생성 
 *      Calendar cal = Calendar.getInstance();
 *      -------- 추상 클래스 
 *   2) 날짜 설정 => set();
 *   3) 날짜 읽기 => get();
 *   4) 각 달의 마지막날 => 
 *      getActualMaximum();
 *   5) 요일 읽기
 *      get();
 * 
 */

public class 라이브러리_Calendar_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Calendar cal = Calendar.getInstance(); // 오늘 날짜를 읽어준다.
		// getInstance() 이면 추상클래스일 확률이 높음 
		// 필요시에는 오버라이딩을 해서 사용한다.
		// new 를 사용하지 않는 경우 => 추상클래스 / 인터페이스
		/*
		 *   기능을 가지고 있다 => 추상클래스 (구현된 메소드 , 구현이 안된 메소드)
		 *   기능을 가지고 있지 않다. => 인터페이스( 구현이 안된 메소드)
		 *   List list = new ArrayList<>(); => 인터페이스 new 하고 하위 클래스가 들어오면 인터페이스
		 */
		System.out.println("년도 : "+cal.get(Calendar.YEAR)); // 1
//		System.out.println("년도 : "+cal.get(1));
		// Month 는 0 부터 시작(0 ~ 11)  항상 +1 을 해줘야함
		System.out.println("월 : "+(cal.get(Calendar.MONTH)+1)); 
		
		System.out.println("일 : "+(cal.get(Calendar.DATE))); 
		
		System.out.println("시 : "+(cal.get(Calendar.HOUR))); 
		System.out.println("분 : "+(cal.get(Calendar.MINUTE))); 
		System.out.println("초 : "+(cal.get(Calendar.SECOND))); 
		System.out.println("이번달의 마지막날 : "+(cal.getActualMaximum(Calendar.DAY_OF_MONTH)));
		String [] week = {"","일","월","화","수","목","금","토"};
		// week => 인덱스가 1~7 설정되어있어서 0인덱스를 뻈다.
		System.out.println("요일 : "+week[cal.get(Calendar.DAY_OF_WEEK)]);
	}

}
