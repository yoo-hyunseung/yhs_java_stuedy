package com.sist.lang;
//  delete , insert => 원본 변경
//  substring() => 원본이 변경이 없다.
public class 라이브러리_StringBuffer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("홍길동입니다");
		sb.delete(3, 6); // delete(int s, int e) => e => e-1
		System.out.println(sb.toString());
		sb.insert(3,"입니다");
		System.out.println(sb.toString());
		// delete , insert 는 자체로 변경 
		// substring은 자체 변경이 안됨 , (새로운 메모리에 저장)
		System.out.println(sb.substring(3));
	}

}
