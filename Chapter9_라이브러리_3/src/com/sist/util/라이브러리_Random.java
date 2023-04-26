package com.sist.util;
/*
 *     java.util --> 프로그램 개발시 유용하게 사용할 수 있는 클래스의 집합
 *     => 반드시 import를 사용한다.(import java.util.*) 
 *     => java.lang , java.util , java.io , java.io java.text
 *        ---------------------------------------------------
 *        java.util
 *        ---------
 *            |
 *          1) Random : 난수 발생 
 *          *** 2) Date/Calendar : 날짜 / 시간
 *          *** 3) StringTokenizer : 문자 분리 (split)
 *          *** 4) Collection (매우 중요)
 *                 |
 *      -----------------------
 *      |          |          |
 *     List       Set        Map
 *      |          |          |
 *   ArrayList   HashSet    HastMap
 *     
 *     List : 순서가 존재, 데이터 허용 => 데이터베이스
 *     Set : 순서가 없다, 데이터 중복을 허용하지 않는다 => 장르 ...
 *     Map : 순서가 없다, 저장시에 Key-Value 키,값을 동시에 저장한다. => 클래스관리 
 *     ----------------------------------------------------
 *     
 *     Arrays => 배열을 제어하는 기능
 *     ------ 배열 데이터 툴력 toString()
 *     ------ sort() : 정렬하는 기능
 *     ------ asList() : 배열을 ArrayList로 변경
 *     
 *     Random = nextInt() => int범위
 *              nextInt(5) => 0~4에서 나옴 범위지정가능
 *              
 */
import java.util.*;
public class 라이브러리_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Random r = new Random();
		int a = r.nextInt(100)+1;//1 ~ 100;
		// 0 ~ 99
		System.out.println(a);*/
		int [] numbers = new int[10];
		Random r = new Random();
		for(int i =0 ; i < 10 ; i++) {
			numbers[i] = r.nextInt(100)+1;
		}
		System.out.println("============= 정렬전 =============");
		System.out.println(Arrays.toString(numbers));
		System.out.println("============= 정렬후(ASC) =============");
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("============= 정렬후(DESC) =============");
		for(int i =numbers.length-1 ; i >=0 ;i--) {
			System.out.print(numbers[i]+" ");
		}
	}

}
