//임의의 정수 10를 받아서 최대값/ 최소값 구하기

import java.util.*;
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[20];
		//초기화
		for(int i = 0 ; i < arr.length; i ++) {
			arr[i] =(int)(Math.random()*100)+1;
		}
		
		// 1. 일반 for
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		//2. for-each => 배열, 컬렉션 => 데이터가 여러개 모아서 관리할때 사용
		/*
		 * for(int a : arr) 데이터형 일치 : 배열이름
		 *     
		 */
		// 출력용으로 사용 => 웹(브라우저) 
		for(int a : arr) { // Vue.js React
			System.out.print(a+ " ");
		}
		System.out.println();
		
		
		// 최대값 . 최소값
		int max = arr[0];
		int min = arr[0];
		for(int i = 0 ;i < arr.length;i++) {
			if(max < arr[i])max=arr[i];
			if(min > arr[i])min = arr[i];
		}
		System.out.println("max = "+ max + ", xmin = "+min);
	}

}
