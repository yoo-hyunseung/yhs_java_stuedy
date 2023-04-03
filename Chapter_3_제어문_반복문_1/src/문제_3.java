import java.util.Scanner;

public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("input number : ");
		int n = sc.nextInt();
		if(n <= 0) {
			System.out.println(-n);
		}
		else
			System.out.println(n);
	}

}
