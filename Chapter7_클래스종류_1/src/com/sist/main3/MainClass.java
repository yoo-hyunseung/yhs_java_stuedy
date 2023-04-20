package com.sist.main3;
/*
 * 
 *    인터페이스 간의 상속
 *    interface A
 *    interface B extends A
 *    
 *    
 *    interface A{
 *        void aaa();
 *    }
 *    interface A extends B{
 *        void bbb();
 *        // void aaa();
 *    }
 *    
 *    class C implements B{
 *         public void aaa(){};
 *         public void bbb(){};
 *    }
 */
interface A{
	
}
interface B extends A{  // B < A
	
}
class C implements B{  // C < B => interface 도 클래스와 동일 => 구분(클래스는 단일상속, 인터페이스는 다중상속
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new C();
		B b = new C();
		C c = new C(); // 여러개를 상속 받을때는 한번에 처리하는 것이 편하다.
		
//		if(c instanceof A) { // c객체는 A보다 작다. => c 객체는 A에 포함 C < A
//			System.out.println("OK1");
//		}
//		if(c instanceof B) { // c객체는 B에 포함 C < B
//			System.out.println("OK2");
//		}
//		if(b instanceof A) {// b객체는 A에 포함 B < A
//			System.out.println("OK3");
//		}
//		if(a instanceof C) { //  true  A <= C 
//			System.out.println("OK4");
//		}
//		if(a instanceof B) {
//			System.out.println("OK5");
//		}
		
		
		String s = "";
		StringBuffer sb = new StringBuffer();
		Object o = new Object();
		if(s instanceof Object) {  //String < Object
			System.out.println("OK1");
		}
		if(sb instanceof Object) { //StringBuffer < Object
			System.out.println("OK2");
		}
		if(o instanceof String) { // Object < String
			System.out.println("OK3");
		}
		// instanceof => 객체의 크기
		// 오른쪽 클래스가 크거나 같으면 => true
//		if(s instanceof StringBuffer) => 오류 ***(상속, 포함관계가 아닌 경우는 크기를 잴 수 없다.)
	}

}
