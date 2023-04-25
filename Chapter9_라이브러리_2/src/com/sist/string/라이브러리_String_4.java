package com.sist.string;

import java.util.Scanner;

// charAt(0)
// 코테;
// 문자열을 입력해서 좌우 대칭인지 확인
// aabb
public class 라이브러리_String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = "";
		while(true) {
			str = scan.next();
			System.out.print("input str :");
			if(str.length()%2 !=0) {
				System.out.println("문자 갯수가 짝수여야 합니다.");
				continue;
			}
			
			break;
		}
		System.out.println("str : "+str);
		boolean bCheck = true;
		int j = str.length()-1;
		for(int i =0 ; i<str.length()/2;i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				bCheck =false;
				break;
			}
			j--;
		}
		if(bCheck) {
			System.out.println("좌우 대칭입니다.");
		}
		else {
			System.out.println("좌우 대칭이 아닙니다.");
		}
		
		
	}

}
