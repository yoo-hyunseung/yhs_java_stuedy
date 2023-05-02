package com.sist.lib;

/*
 *     제네릭(JDK 1.5 도입)
 *     -> JDK 1.8 (호환성) ==> 17버전, SpringFrame(14버전)
 *                           ----- Spring-Boot
 *     1) 제네릭이 도입된 이유
 *        => 컬렉션(ArrayList, Set, Map) => 데이터형(매개변수, 리턴형) => Object
 *           반드시 형변환후에 사용
 *           오류 발생이 많다 -> 모든 데이터형을 사용할 수 있다 => 방지
 *        => 데이터형을 통일화, 데이터형의 안정성 => 데이터 고정
 *        => 데이터형을 명시화 => 가독성이 좋다
 *           List<Object> list = new ArrayList<Object>(); -> 가독성이 낮다
 *               ------- 생략이 가능
 *           List<String> list = new ArrayList<String>(); -> 가독성이 높다.
 *                ------                       ------ 일치해야 한다.
 *                
 *           *** 기본형 사용할 수 없다. ==> Wrapper
 *        => 데이터형을 모르는 경우 (와일드 카드)
 *           List<?> list = new ArrayList<String>();
 *                -(String)               ------
 *        예)
 *        
 *           class Box<T>{ => T 임시 클래스 => default (T -> Object)
 *           
 *           }
 *           Box<String> = Object => String 변경 ㅣ 매개변수, 리턴형을 변경
 *           <>안에는 라이브러리만 들어가는 것이 아니고, 사용자정의 클래스도 첨부가 가능하다.
 *           Box<MovieVO> ... 
 *           
 *           임시제네릭
 *           -------
 *           T -> 임시 데이터형 (클래스형 -> type) -> 사용자 정의 제네릭
 *           E -> 임시 데이터형 (클래스형 -> element) 요소 
 *                ArrayList<E> , Vector<E> , LinkedList<E>
 *           K -> key (클래스형)
 *           V -> value (클래스형)
 *           map<K,V> 
 *    ---------------------------------------------------------------------------
 *    Iterator / ListIterator => 데이터를 모아서 관리
 *    -------- hasNext() , next() , remove()
 *    -------- hasNext() , next() , remove() , hasPrevious()
 *    -------- 순서가 없는 경우 주로 사용 Set, Map을 출력할 때 사용
 *    ArrrayList => for(index를 사용하기 때문)
 *    
 *    
 *           
 *     
 *     
 */
import java.util.*;
public class 정리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("배");
		list.add("수박");
		list.add("딸기");
		list.add("바나나");
		// 일반 출력 =for-each
		for(String s : list) {
			System.out.print(s+" ");
		}
		System.out.println("\n----------- Iterator -----------");
		// 출력이 어려운 경우 -> 단방향
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("\n---------------- 재출력 ---========");
		while(it.hasNext()) {
			System.out.print(it.next()+" "); // 출력이 안됨
		}*/
		
		// ListIterator => List 에서만 사용이 가능
//		List<?> list = new ArrayList<Integer>();
//		List<String> list1 = new ArrayList<String>();
//		List<?> list1 = new ArrayList<String>();
//		list1 = new ArrayList<Integer>(); // string으로 설정되어서 바꿀수 없다. 제네릭을 바꾸려면 와일드 카드를 사용해야한다.
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
//		for(int i =0 ; i <list.size(); i++) {
//			System.out.print(list.get(i)+" ");
//		}
//		System.out.println();
//		for(int i = list.size()-1 ; i >=0 ;i--) {
//			System.out.print(list.get(i)+" ");
//		}
		ListIterator it = list.listIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("\n=====================");
		while(it.hasPrevious()) {
			System.out.print(it.previous()+ " ");
		}
		
	}

}
