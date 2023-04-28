package com.sist.map;
import java.util.*;
class A{
	public void execute() {
		System.out.println("A:execute() Call");
	}
}
class B{
	public void execute() {
		System.out.println("B:execute() Call");
	}
}
class C{
	public void execute() {
		System.out.println("C:execute() Call");
	}
}
// Spring => 클래스 관리자 (게임,, 웹 ,, 등등)
class Container{
	Map map = new HashMap();
	// singleton 싱글톤 패턴 -> 메모리 누수현상을 방지(한개의 객체로 재사용)
	// 클래스 관리시 자주사용 한다.
	public Container(){
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
		
	}
	public Object getBean(String key) {
		return map.get(key);
	}
}
public class 라이브러리_Map_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container c=  new Container();
		A aa = (A)c.getBean("a"); // return Object 이므로 형변환 해줘야함
		aa.execute();
		
		A bb =(A)c.getBean("a");
		bb.execute();
		
		System.out.println("aa ="+aa);
		System.out.println("bb ="+bb);
	}

}
