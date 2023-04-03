import java.util.Scanner;

//15)	Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
//십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.

/*
 * 	외부 라이브러리 org, com으로 끝남 
 * 	
 */

public class 문제_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("input number");
		int n = sc.nextInt();
		if(n %11 ==0) {
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
	}

}
