package com.sist.main2;
// Object 는 모든 클래스의 상위 클래스(모든 클래스는 Object상속을 받는다 = 최상위 클래스)
/*
 *    class A (extends Object)
 *    class B extends A
 *       
 *     Object
 *       |
 *       A
 *       |
 *       B
 *     
 *     Object o = new A();
 *     Object O = new B(); 가능
 *     Object[] a = {10, " " , 'A',10.2 ...}; 모든 데이터형 이 섞여서 받을수 있다.
 */
public class Container {
	public Object getBean(int no) {
		Object o = null;
		if(no == 1) {
			o = new A();
		}
		else if(no == 2) {
			o = new B();
		}
		else if(no == 3) {
			o = new C();
		}
		else if(no == 4) {
			o = new D();
			
		}
		else if(no == 5) {
			o = new E();
		}
		return o;
	}
}
