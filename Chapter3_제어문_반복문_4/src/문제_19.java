import java.util.Scanner;

public class 문제_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count3 =0;
		int count5 =0;
		for(int i =0 ; i< 10 ;i++) {
			System.out.println("정수를 입력하세요:");
			int num = sc.nextInt();
			if(num%3 ==0)count3++;
			if(num%5 == 0)count5++;
		}
		System.out.println("3의 배수의 갯수: "+count3);
		System.out.println("5의 배수의 갯수: "+count5);
	}

}
