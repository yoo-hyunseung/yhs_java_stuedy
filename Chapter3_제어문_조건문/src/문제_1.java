import java.util.Scanner;

public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.");
		int n = sc.nextInt();
		if(n >=50) {
			System.out.println(n+"은 50 이상입니다.");
		}
		else {
			System.out.println(n+"은 50 이하입니다.");
		}
	}

}
