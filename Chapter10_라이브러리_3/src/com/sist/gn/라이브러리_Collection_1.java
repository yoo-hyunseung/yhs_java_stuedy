package com.sist.gn;
/*
 *  
 *    제네릭
 *      => 데이터형을 통일화
 *      => 라이브러리의 데이터형을 변경할 경우에 사용
 *         -------- 매개변수 / 리턴형 (Object)
 *                  => 프로그램 개발시마다 형변환을 해야한다.
 *                  => 프로그램에 필요한 데이터형으로 변경
 *           ** 데이터를 저장할 때는 한가지 데이터형만 지정해야 사용하기 쉽게
 *              프로그램 => 데이터를 통일한다
 *      => 사용법 -> <> 
 *      List <클래스명> => Object => 클래스명으로 변경
 *      List<String> 
 *      List<MovieVO> 
 *      
 *      => T , E , K ,V
 *         ------------
 *         T -> type(클래스형)
 *         E -> Element
 *         K -> Key
 *         V -> Value
 *         Map<K,V>
 *         Map<String, String>
 *         List<E>
 *         List<Element>
 *         List<Integer>
 *              ------- 기본형은 사용이 불가능 , 클래스형만 사용이가능
 *                      ----- 클래스형으로 제작, -> Wrapper
 *                       
  *           
 *         
 *         
 *         
 *         
 */
import java.util.*;
class Box<T>{
	T t; // t를 사용하지 않으면 자동으로 Object 로 변경 제네릭스를 정수형이면 그거로 바뀜

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
public class 라이브러리_Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList();
		list.add("사과");
		list.add("배");
		list.add("딸기");
		
		for(Object obj : list) {
			String f = (String)obj;
			System.out.println(f);
		}
		
		list.add("1");
		for(Object obj : list) {
			String f = (String)obj; // 정수형 변환 오류 자료형 통일이 필요
			System.out.println(f);
		}
	}

}
