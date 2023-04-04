import java.util.Scanner;

public class 문제_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = 0;
		int mul =1;
		while(true) {
			System.out.print("input num2 : ");
			num2 = sc.nextInt();
			if(num1 > num2)continue;
			break;
		}
		for(int i = num1 ; i <= num2;i++) {
			mul *=i;
		}
		System.out.println(mul);
	}

}
