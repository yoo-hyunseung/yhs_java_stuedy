package com.sist.lib;
import java.util.*;

public class 라이브러리_Set_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"홍길동","이순신","강감찬","심청이","춘향이","이산"
				,"을지문덕","박문수","이순신","강감찬","심청이"};
		
		// ArrayList 로 변환  .asList();
		// 중복을 허용한다.
		List list = Arrays.asList(names);
		System.out.println(list);
		
		// 중복을 제거한다
		Set set = new HashSet();
		set.addAll(list);
		System.out.println(set); // 중복제거시 set으로 이동후 list로 온다.
		// 제거된 데이터를 다시 받는다. => 장바구니...
		List list2 = new ArrayList(); 
		list2.addAll(set);
		System.out.println(list2);
		
		
	}

}
