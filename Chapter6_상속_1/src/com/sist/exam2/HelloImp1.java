package com.sist.exam2;

public class HelloImp1 implements Hello{
	@Override
	public void sayHello(String name) {
		System.out.println(name+"hello!");
	}
}
