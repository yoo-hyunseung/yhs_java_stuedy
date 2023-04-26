package com.sist.util;
// Date -> Calendar 
import java.util.*;
public class 라이브러리_Calendar_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("년도를 입력 : ");
		int year = scan.nextInt();
		System.out.print("월 입력 : ");
		int month = scan.nextInt();
		System.out.print("일 입력 : ");
		int day = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR,year); // 오늘 날짜를 year 로 바꿔준다.
		cal.set(Calendar.MONTH,month-1); // month 는 인덱스 0부터 시작한다.
		cal.set(Calendar.DATE,day);
		
		System.out.println("=========== 설정된 날짜 ===========");
		System.out.println("년도 :"+cal.get(Calendar.YEAR));
		System.out.println("월 :"+cal.get(Calendar.MONTH)+1); // +1 을해줘야한다. 주의
		System.out.println("일 :"+cal.get(Calendar.DATE));
		String [] week = {"일","월","화","수","목","금","토"};
		System.out.println("요일 : "+week[cal.get(Calendar.DAY_OF_WEEK)-1]);
		// week - 1 
	}

}
