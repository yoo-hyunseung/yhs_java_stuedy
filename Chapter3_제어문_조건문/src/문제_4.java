import java.util.Scanner;

public class 문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 세개를 입력하세요 . ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int max, min, total;
		double avg;
		total = num1 + num2 + num3;
		avg = total/3.;
		if(num1 < num2 ) {
			if(num2 < num3) {
				max = num3;
				min = num1;
			}
			else {
				max = num2;
				if (num1 < num3) {
					min = num1;
				}
				else {
					min = num3;
				}
			}
		}
		else {//num1> num2
			if(num1 > num3) {
				max = num1;
				if(num2>num3) {
					min = num3;
				}
				else min = num2;
			}
			else {
				max = num3;
				min = num2;
			}
		}
		System.out.println("max = "+max + " min = "+ min);
		System.out.println("total = "+ total + " avg = "+avg);
	}

}
