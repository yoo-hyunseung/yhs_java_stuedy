import java.util.Scanner;

public class 문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("input score : ");
		int score = sc.nextInt();
		if(score >=60) {
			System.out.println("pass");
		}
		else {
			System.out.println("non pass");
		}
	}

}
