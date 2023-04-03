import java.util.Scanner;

public class 문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("input number");
		int n = sc.nextInt();
		if(n %3 == 0) {
			System.out.println(n+" 는 3의 배수입니다.");
		}
		else {
			System.out.println(n+" 는 3의 배수가 아닙니다.");
		}
	}

}
