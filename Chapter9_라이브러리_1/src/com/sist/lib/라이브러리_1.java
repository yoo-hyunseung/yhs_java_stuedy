package com.sist.lib;
/*
 *    1. java.lang
 *       Object : 모든 클래스의 상위 클래스(모든 클래스는 상속을 Object로 받는다.)
 *          기능(메소드)
 *          = toString() : 자주 사용이 된다. 객체를 문자열화 시킨다
 *                         => 오버라이딩 
 *          = clone(); : 객체 복제 => prototype 복
 *              참조 : 같은 메모리를 이용 (얕은 복사)
 *              복제 : 다른 메모리를 제작 (깊은 복사)
 *          = finalize(); : 소멸자 함수 (호출되면 메모리 해제)
 *          = equals(); : 객체 비교                     
 *       String : 문자열을 저장하고 관리하는 클래스 
 *         기능(메소드)
 *         = equals() : 문자열 비교할때 사용
 *           == 주소값을 비교
 *           로그인 처리, 상세보기, 아이디 중복. 비밀번호 비교...
 *         = startsWith : 시작문자열이 같은 경우
 *           => 오라클 : 'A%'
 *         = endsWith : 끝나는 문자열이 같은 경우
 *           => 오라클 : '%A'
 *         = contains : 포함된 문자열 (가장 많이 사용)
 *           => 오라클 : '%A%'
 *           => 추천
 *         = replace : 문자나 문자열을 변경할때
 *             211.238.242.101
 *                         102
 *                         103
 *                         104
 *                         ... 20
 *         = replaceAll : 문자나 문자열을 변경할때(정규식) => 문자열의 형태
 *           [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\
 *         = trim : 좌우 공백제거
 *         = split : 특정 단어별로 나눠서 저장 => String[]
 *           => StringTokenizer
 *         = valueOf : 모든 데이터형을 문자형으로 변경
 *         = length : 문자의 갯수
 *         = substring : 문자열을 자르는 경우에 사용
 *      StringBuffer , StringBuilder ...
 *      Wrapper : 기본형을 클래스
 *         Byte , Integer, Double, Boolean, Float, Long ...
 *      System 
 *      Math
 *      Thread 
 *      -------------------- java.lang 은 import 를 생략할 수 있다.
 *         
 *    2. java.util
 *       ***Date / Calendar 
 *       *** StringTokenizer
 *       Collection (자료구조) -> 메모리상에 있는 데이터를 쉽게 관리
 *            |
 *       -------------------------
 *       |            |          |
 *   **List          Map        Set  --> interface -> HashSet / TreeSet
 *       |            |
 * **ArrayList     **HashMap/HashTable
 *  LinkedList
 *  (Queue)
 *  Vector   
 *  (Stack)
 *    2-1. java.text
 *    3. java.io
 *    4. java.net
 *    5. java.sql
 *    ----------------- 기본 라이브러리
 *    6. javax.xml
 *    7. javax.sevlet.http
 *    8. 외부 라이브러리 ( 자바에서 지원하는 것이 아니라 업체)
 *       Open API => Jsoup, simple-json : mvnrepository.com
 *       org. ~
 *       com. ~
 *       
 *    --------------------- 1. DB (Mybatis, Hibernate(JPA))
 *                          2. XML, JSON(Vue, Ajax, React)
 *                          3. 프레임워크 : Spring / Spring-Boot / Struts
 *                          *** JSP(HTML)
 *                          
 *       A a = new A();
 *       System.out.println("a = "+a);
 *                                -- a.toString() 이 생략
 *                                
 *                          
 */
class A{
	int a = 10;
	int b = 20;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "a = "+a+", b = "+b;
	}
	
}
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		System.out.println("aa = "+aa.toString());
		System.out.println("aa = "+aa);
	}

}
