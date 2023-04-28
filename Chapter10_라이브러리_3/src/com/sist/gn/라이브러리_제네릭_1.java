package com.sist.gn;
import java.util.*;
// A a=> A에 있는 데이터만
// A => a , B => a,b
// Object -> object , Sawon -> Object , Sawon
/*
 *   동물
 *    |
 *    인간 돼지 개 소 말 악어 
 */

class Sawon{
	// Object 상속
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	
	public Sawon(int sabun, String name, String dept, String job, int pay) {
		super();
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
}
// Sawon s = new Sawon() s.addr -> 사용불

class Human{
	public String name;
	public String addr;
}
public class 라이브러리_제네릭_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		hong. -> Sawon의 메소드에 접근할 수 없다. (상위 클래스에서 하위클래스로 접근 불가)
		// 상위클래스는 여러개 클래스를 묶을 때 사용한다 (인터페이스, 추상클래스)
		// 보통은 하위클래스로 메모리할당후 사용. (하위클래스는 상위클래스접근가능)
		List<Sawon> list = new ArrayList<>();
		list.add(new Sawon(1,"홍길동","개발부","대리",4500));//0
		list.add(new Sawon(2,"박문수","총무부","과장",5500));//1
		list.add(new Sawon(3,"이순신","기획부","사원",3500));//2
		list.add(new Sawon(4,"강감찬","자재부","부장",6500));//3
		list.add(new Sawon(5,"심청이","영업부","부장",6500));//4
		
		for(Sawon s : list) {
			System.out.println(s.getSabun()+". "+s.getName()+" "+s.getDept()
			+" "+s.getJob()+" "+s.getPay());
		}
		// remove  remove(2) ==> index가 자동으로 바뀜 -> 중간에 삭제시 속도저하
		// 삭제가 많은 건 LinkedList 적합
		// List -> 데이터 첨부 -> 데이터 읽기 -> 데이터 갯수
		// 수정, 삭제 -> 오라클에서 실행
		
		list.remove(2);
		System.out.println("============================");
		for(Sawon s : list) {
			System.out.println(s.getSabun()+". "+s.getName()+" "+s.getDept()
			+" "+s.getJob()+" "+s.getPay());
		}
		System.out.println("============================");
		System.out.println("현재 인원 : "+list.size());
		System.out.println("============================");
		
		Sawon sa = new Sawon(6,"춘향이","개발부","사원",3500);
		list.add(4,sa);
		for(Sawon s : list) {
			System.out.println(s.getSabun()+". "+s.getName()+" "+s.getDept()
			+" "+s.getJob()+" "+s.getPay());
		}
		System.out.println("=======================");
		list.clear();
		System.out.println("현재 인원 : "+list.size());
		
		/*
		 * 
		 *   add, size, get, clear -> 웹에서 사용
		 *   
		 *   JSP , Servlet, SpringFramework
		 *   -------------
		 *    
		 *   
		 */
	}

}