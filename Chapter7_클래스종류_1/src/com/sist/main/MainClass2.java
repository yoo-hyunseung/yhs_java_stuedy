package com.sist.main;

class A{
	public A() {
		System.out.println("A() Call..."); // 상위 클래스의 생성자가 기본 출력
		                                   // 상위 클래스의 메모리를 할당하려면 기본생성자 (매개변수가 없는 것을 선언해야함)
	}
	public A(int a) {
		System.out.println("A() Call...");
	}
}
class B extends A{
	public B(){
		System.out.println("B() Call...");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		A aa = new B();
	}

}
