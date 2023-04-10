import java.util.Scanner;

public class 문제_4 {
	static void printNum() {
		for(int i =1; i <= 10 ;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	static int sum() {
		int sum = 0;
		for(int i = 1 ; i<=10; i++) {
			sum+=i;
		}
		return sum;
	}
	static int sum1(int n) {
		int sum =0;
		for(int i = 1; i <=n;i++) {
			sum+=i;
		}
		return sum;
	}
	static double div(int a, int b) {
		return a/(double)b;
	}
	
	static void process() {
		Scanner sc = new Scanner(System.in);
		printNum();
		
		System.out.println("1 ~ 10 sum is "+sum());
		System.out.print("input num : ");
		int n = sc.nextInt();
		System.out.println("1 ~ n sum is "+sum1(n));
		System.out.print("input num1 : ");
		int num1 = sc.nextInt();
		System.out.print("input num2 : ");
		int num2 = sc.nextInt();
		if(num2 !=0) {
			System.out.printf("%d / %d  = %.2f\n",num1,num2,div(num1,num2));
		}
		else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
	}

}
