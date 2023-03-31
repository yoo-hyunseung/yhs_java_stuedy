import java.util.Scanner;

public class 문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int n = sc.nextInt();
		if(n < 0) {
			System.out.println(n+" 는 음수입니다.");
		}
		else {
			System.out.println(n+" 는 양수입니다.");
		}
	}

}
