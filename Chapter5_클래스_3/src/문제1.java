import java.util.Arrays;
import java.util.Scanner;

/*
 * 	1. 정수를 입력 받아서 이진법을 출력하는 메소드 작성(3개의 메소드)
	정수 입력 
	이진법 처리
	출력 

	2. 임의의 정수를 배열로 생성해서 입력하고 정렬하는 프로그램 작성 
	
	3. 년도를 받아 윤년인지 판별하는 프로그램 작성
 */

/*
 *  
 *  
 */
public class 문제1 {
	static void process1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("0 ~ 32767 사이의 정수입력 : ");
		int num = scan.nextInt();
		String result ="";
//		result = Integer.toBinaryString(n);
		int [] binary = new int [16];
		int index = 15;
		while(true) {
			binary[index--] = (num%2);
			num = num/2;
			if(num == 0) {
				break;
			}
		}
		for(int i =0 ; i < binary.length;i++) {
			if(i%4 ==0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
		System.out.println();
	}
	static void process2() {
		int [] arr = new int[5];
		for(int i =0 ; i< arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0 ;i < arr.length-1 ; i++) {
			for(int j = i+1 ; j < arr.length;j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] =arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0 ;i < arr.length-1 ; i++) {
			for(int j = i+1 ; j < arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] =arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	static void process3() {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if((year%4 == 0 && year %100 !=0) || year%400 ==0) {
			System.out.println(year+"는 윤년입니다.");
		}
		else {
			System.out.println(year+"는 윤년이 아니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process1();
		process2();
		process3();
		
		
	}

}
