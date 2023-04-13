package com.sist.main;
// import com.sist.main.클래스구성요소_1; 
// import com.sist.main.*; 
// import java.util.*;
// 클래스 분리
/*
 *    클래스 
 *      = 데이터형
 *      = 액션(동작) => 메소드
 *    --------------------
 *    
 *    1) 데이터형
 *    2) 데이터처리
 *    3) 조립 -> main -> 메인보드
 */
class Student{
	int hakbun;
	String name;
	String sex;
	int kor;
	int eng;
	int math;
}
class StudentSystem{
//	int getHakbun() {
//		return 10;
//	}
//	String getName() {
//		return "홍길동";
//	}
//	String getSex(){
//		return "남성";
//	}
//	int getKor() {
//		return 90;
//	}
//	int getEng() {
//		return 80;
//	}
//	int getMath() {
//		return 78;
//	}
	Student getData() {
		Student s = new Student();
		s.hakbun = 2;
		s.name = "심청이";
		s.sex = "여자";
		s.kor = 90;
		s.eng = 90;
		s.math = 100;
		return s;
//	}
}
public class 클래스구성요소_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student();
		StudentSystem ss = new StudentSystem();
//		hong.hakbun = ss.getHakbun();
//		hong.name = ss.getName();
//		hong.sex = ss.getSex();
//		hong.kor = ss.getKor();
//		hong.eng = ss.getEng();
//		hong.math = ss.getMath();
		
//		Student shim = new Student();
//		shim = ss.getData();
		Student shim = ss.getData();
	}

}}
