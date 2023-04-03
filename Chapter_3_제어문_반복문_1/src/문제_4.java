import java.util.Scanner;

public class 문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("input year : ");
		int y = sc.nextInt();
		if((y%4==0 && y%100 !=0) || y%400==0) {
			System.out.println(y+"년도는 윤년입니다.");
		}
		else {
			System.out.println(y+"년도는 윤년이 아닙니다.");
		}
	}

}
