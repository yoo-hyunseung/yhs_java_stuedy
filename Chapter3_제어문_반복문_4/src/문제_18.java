import java.util.Scanner;

public class 문제_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count =0;
		for(int i =0 ; i< 10 ;i++) {
			System.out.println("정수를 입력하세요:");
			int num = sc.nextInt();
			if(num%2 ==0)count++;
		}
		System.out.println("짝수의 갯수 : "+count);
	}

}
