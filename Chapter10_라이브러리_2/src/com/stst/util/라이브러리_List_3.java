package com.stst.util;

import java.util.*;
/*
 *    subList(int start, int end) => index 번호가 start 부터 end까지 데이터 복사
 *                                                      --- (end-1)
 *                                                      
 *    => 페이지 나누기
 *        0 ~ 9 , 10 ~ 19 , 20 ~ 29 ...
 *    addAll() => ArrayList가 가지고 있는 모든 데이터 복사
 *    retainAll() => 두개의 ArrayList에서 같은 값을 가지고 있는 데이터 복사
 *    Collections.sort() => ArrayList 정렬                                                
 */
public class 라이브러리_List_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ArrayList names1 = new ArrayList();
		names1.add("홍길동");
		names1.add("심청이");
		names1.add("이순신");
		names1.add("감강찬");
		names1.add("춘향이");
		for(Object o : names1) {
			System.out.print(o +" ");
		}
		ArrayList names2 = new ArrayList();
		names2.add("홍길수");
		names2.add("심청이");
		names2.add("이순이");
		names2.add("감강차");
		names2.add("성춘향");
		// 교집합 > retainAll
		ArrayList temp = new ArrayList();
		temp.addAll(names1);
		temp.retainAll(names2); // name1 과 names2 에 있는 데이터의 
		                          // 같은 데이터를 찾아 names1에 저장
		System.out.println("\nafter retainAll");
		for(Object o : temp) {
			System.out.print(o +" ");
		}
		System.out.println("\nnames1 :"+names1.toString());
		
		
		
	}

}
