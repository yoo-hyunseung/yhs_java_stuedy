// 계산기 제작
import java.util.Scanner;
public class 메소드_2 {

	// +
	static int plus(int a, int b) {
		return a+b;
	}
	// -
	static int minus(int a, int b) {
		return a-b;
	}
	// *
	static int gop(int a, int b) {
		return a*b;
	}
	// /
	static String div(int a, int b) {
		String res = "";
		if(b==0) {
			res = "0으로 나눌 수 없습니다.";
		}
		else {
//			res = String.valueOf(a/b);
			res = a+"/"+b+"="+a/(double)b;
		}
		return res;
	}
	static void process() {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int a = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b = scan.nextInt();
		
		System.out.print("연산자 입력(+ - * /) : ");
		String op = scan.next();
		int res=0;
		switch(op) {
			case "+":
				res = plus(a,b);
				System.out.printf("%d + %d = %d",a,b,res);
				break;
			case "-":
				res = minus(a,b);
				System.out.printf("%d - %d = %d",a,b,res);
				break;
			case "*":
				res = gop(a,b);
				System.out.printf("%d * %d = %d",a,b,res);
				break;
			case "/":
				String res1 = div(a,b);
				System.out.println(res1);
				break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
