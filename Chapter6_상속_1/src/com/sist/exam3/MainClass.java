package com.sist.exam3;
// A ==> a,b, name, print(), A()

class A{
	int a;
	int b;
	String name;
	static String adrr;
	public A(){
		/*
		 *  int a;
			int b;
			String name;
			static String adrr;	
			print()
			display()                --> 사용가능
		 */
	}
	
	public void print() {
		a=10;
		b = 1;
		name = "ㅇㄴㄹ";
		adrr = "ㅇㅇ";	
		print();
		display();
	}
	public static void display() {
	    
//		a=10;
//		b = 1;   ==사용불가 사용하려면 객체를 생성한 후에 사용해야한다. A aa = new A();
		         // 인스턴슨느 객체 생성후에 사용 가능하다
//		name = "ㅇㄴㄹ";
		adrr = "ㅇㅇ";	// static 은 static 만 사용가능
//		print();
		display();
		
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
