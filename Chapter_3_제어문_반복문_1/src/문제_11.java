//11) 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
import java.util.Scanner;

public class 문제_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("input number");
		int n = sc.nextInt();
		int sum =0;
		for(int i =1; i <=n;i++) {
			sum +=i;
		}
		System.out.println("1 ~ "+n+" sum : "+sum);
	}

}
