
// 중첩 ==> if ~ else
// 사칙연산 +, -, *, /
import java.util.Scanner;

public class 선택조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("두개의 정수를 입력(90 80) : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.print("연산자 입력(+,-,*,/) : ");
		char option = scan.next().charAt(0);
		if (option == '+' || option == '-' || option == '*' || option == '/') {
			if (option == '+') {
				System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
			}
			if (option == '-') {
				System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
			}
			if (option == '*') {
				System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
			}
			if (option == '/') {
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없다.");
				} else {
					System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
				}
			}
		} else {
			System.out.println("잘못된 연산자 입니다!!");
		}

	}

}
