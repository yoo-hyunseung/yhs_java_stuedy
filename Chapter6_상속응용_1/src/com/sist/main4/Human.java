package com.sist.main4;

public class Human {
	private String name; // 인스턴스 변수인 경우 따로따로 메모리 할당
//	static {
//		name = "홍길동";
//	}
	public String getData() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
