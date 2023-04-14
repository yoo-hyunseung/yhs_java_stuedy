package com.sist.main;
/*
 *    초기화
 *    1. 디폴트 값
 *       int a => 0 , String s => null ...
 *       class A{
 *          int a;
 *       }
 *    2. 명시적인 초기화 : 직접 값을 설정
 *       class A {
 *          int a = 10;
 *       }
 *    3. 생성자 초기화
 *       class A{
 *           int a;
 *           A(){
 *             a = 100;
 *           }
 *       }
 *    4. 초기화 블록
 *       class A{
 *          int a;
 *          { // 블록만 열어 줌 생성자와 같이 쓰지 않는다.
 *             a = 100;
 *          }
 *       }
 *       
 *    순서 : 디폴트 => 명시적 => 초기블록 => 생성자
 *         int a=0 > a=10 > a=100 > a=1000
 */
/*class Student{
	int hakbun =10;
	String name;
	{
		hakbun = 100; // 연산처리 , 제어문 , 파일 읽기 ... 초기화 블록,생성자이용
	}
	Student(){
		hakbun = 1000;
	}
}*/
/* 
 *   class A{
 *     void a(){}
 *     void b(int a){}
 *   }
 */

class Student {
	int hakbun;
	String name;
	Student(){
		System.out.println("Student () Call ...");
		hakbun=1;
		name = "홍길동";
	}
	Student(int h, String n){
		hakbun = h;
		name = n;
	}
}

public class 생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println(s.hakbun);
		System.out.println(s.name);
		// 생성자 호출 new를 앞에 붙여서 호출한다.
		
		Student s1 = new Student(); // Student Call... 출력
		System.out.println(s1.hakbun);
		System.out.println(s1.name);
		
		Student s2 = new Student(2,"심청이");
		System.out.println(s2.hakbun);
		System.out.println(s2.name);
		
		Student s3 = new Student(3,"박문수");
		System.out.println(s3.hakbun);
		System.out.println(s3.name);
		
	}

}
