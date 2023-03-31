
/*
 * 
 */
// 	한개의 정수를 받아서 60이상이면 합격, 불합격
import java.util.Scanner;

public class 선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력: ");
		int num = scan.nextInt();

		// 요청 => 처리
		if (num >= 60) {
			System.out.println(num + " 는 합격입니다.");
		} else {
			System.out.println(num + " 는 불합격입니다.");
		}
	}

}
