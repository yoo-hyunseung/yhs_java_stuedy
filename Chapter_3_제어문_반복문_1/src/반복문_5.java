// 사용자의 입력을 받아서 구구단 하나를 출력 ->3단 출력
import java.util.Scanner;
public class 반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력하세요 : ");
		int n = sc.nextInt();
		for(int i=1 ; i <=9 ; i++) {
			System.out.printf("%d * %d = %d\n",n,i,n*i);
		}
	}

}
