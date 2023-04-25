package com.sist.lib;
// equals => Object 에서는 객체비교 , String 에서는 문자열비교

class Student2{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Student2(String name) {
		this.name = name;
	}
	//if(s1.equals(s2))
	// ((Student2)obj).name; 형변환
	// Object => 내부에 name 없어서 (Student2) 형변환 먼저시킨후에 name을 가져온다.
	// . 형변환 보다 우선순위이다.
	// 10+2*5
	// Object => equals 는 사용빈도가 높지않다. => 오버라이딩을 통해 사용해야한다.
	// 
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student2) {
			Student2 s = (Student2)obj;
			//((Student2)obj).name
			return name == s.name;
		}
		else
			return false;
	}
	public void print() {
		System.out.println("이름 : "+name);
	}
	/*
	 *  String s = "";
	 *  s.length();
	 *  "Hello".length(); 가능
	 */
}
public class 라이브러리_Object_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1 = new Student2("홍길동");
		Student2 s2 = new Student2("홍길동");
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		/*  s1 = com.sist.lib.Student2@7344699f
		 *	s2 = com.sist.lib.Student2@6b95977
		 * 
		 */
		// (객체 비교 == 주소값을 비교한다.) (equals 객체 가지고 있는 변수값 비교)
		if(s1 == s2) {
			System.out.println("s1과 s2은 같다.");
		}
		else {
			System.out.println("s1과 s2은 같지 않다.");
		}
		// 주소 비교 => default (주소값 비교)
		if(s1.equals(s2)) {
			System.out.println("s1과 s2은 같다.");
		}
		else {
			System.out.println("s1과 s2은 같지 않다.");
		}
		s1.print();
		
		new Student2("박문수").print();
	}

	

}
