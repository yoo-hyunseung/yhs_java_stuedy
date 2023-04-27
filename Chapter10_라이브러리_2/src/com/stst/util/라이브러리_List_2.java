package com.stst.util;
// List 의 메소드
/*
 *    add, remove, set, size, clear
 *    ------------------------------ 기본 메소드
 *    containsAll() -> 두개의 list에서 중복된 데이터를 모아서 관리
 *       => 오라클 join 
 *    retainAll; => 두개 list에서 중복된 데이터만 남기기
 *    addAll => 데이터 전체 
 *    subList => 부분적 데이터 복사할 경우에 사용
 *    -------------------- 장바구니, 예매 
 *                         ------ 중복 구매
 *                         
 */import java.util.*;
 // 오라클 join -> 어렵다...
public class 라이브러리_List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(3);// index 00
		list.add(5);// index 01
		list.add(6);// index 02
		list.add(7);// index 03
		list.add(8);// index 04
		list.add(9);// index 05
		list.add(2);// index 06
		list.add(1);// index 07
		list.add(4);// index 08
		// 출력
//		for(int i =0  ; i <list.size();i++) {
//			
//		}
		for( Object i : list) {
			System.out.println(i.toString());			
		}
		// 일부만 추가 subList(start , end)
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		list2.add(10);
		list2.add(11);
		list2.add(12);
		System.out.println("================");
		for(Object i : list2) {
			System.out.println(i.toString());	 
		}
		Collections.sort(list);
		System.out.println("================");
		for( Object i : list) {
			System.out.println(i.toString());			
		}
		System.out.println("======containsAll==========");
		// 같은 데이터를 추출
		list.containsAll(list2); // return true / false 
		System.out.println(list.containsAll(list2)); // 모두 포함이 되었는지? -> 아니면false
		for( Object i : list) {
			System.out.println(i.toString());			
		}
		
		//list에 중복된 거만 추출 => 교집합
		System.out.println(list.retainAll(list2)); // 합집합 list에 중복된 거만 추출
		for( Object i : list) {
			System.out.println(i.toString());			
		}
		System.out.println("========retainAll========");
		
		// addAll
		ArrayList list3 = new ArrayList();
		list3.addAll(list);
		for( Object i : list3) {
			System.out.println(i.toString());			
		}
		
		
	}

}
