import java.util.Arrays;
import java.util.Scanner;
/*
 *    1. 난수 발생
 *    2. 사용자 입력
 *    ----------------- 메소드 1
 *    3. 비교
 *    4. 힌트
 *    ----------------- 메소드 2
 *    5. 종료여부
 */
public class 메소드조립법_3 {
	static void rand(int[]com) {
		for(int i = 0 ; i < 3 ;i++) {
			com[i] = (int)(Math.random()*9)+1;
			for(int j = 0 ; j< i ;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
	}
	static void input(int []user) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("세자리 정수 입력");
			int input = scan.nextInt();
			// 정상 입력 &&
			// 오류 ||  tip			
			if(input <100 || input >999) {
				System.out.println("잘못된 입력입니다. ");
				// while 문의 조건식으로 이동 => 처음부터 다시
				continue;
			}
			user[0]= input /100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			if(user[0] == user[1] ||user[1] == user[2]||user[0] == user[2]) {
				System.out.println("같은 숫자는 사용할수 없습니다.");
				// while 문의 조건식으로 이동 => 처음부터 다시
				continue;
			}
			else if(user[0] == 0 ||user[1] == 0||user[2] == 0) {
				System.out.println("0은 사용할수 없습니다.");
				// while 문의 조건식으로 이동 => 처음부터 다시
				continue;
			}
			else break;
		}
	}
	static int[] check(int []com, int []user) {
		int []answer = {0,0};
		for(int i = 0 ; i < 3; i++) { //com
			for(int j = 0 ; j < 3; j++) { // user
				if(com[i] == user[j]) {
					if(i==j)answer[0]++; //  같은 자리수면
					else answer[1]++; // 다른 자리수면
				}
			}
		}
		// 힌트
		System.out.printf("Input : %s, Result : %dS, %dB\n",Arrays.toString(user),answer[0],answer[1]);
		return answer;
	}
	static boolean quit(int answer[]) {

		if(answer[0]==3) {
			System.out.println("game over");
			return false;
		}
		else return true;
	}
	static void process() {
		int [] com = new int[3];
		int [] user = new int[3];
		int [] answer = new int[2];
		boolean b = true;
		rand(com);
		while(b) {
			input(user);
			answer =check(com, user);
			b = quit(answer);
		}
	}
	public static void main(String[] args) {
		process();
		// TODO Auto-generated method stub
		/*
		int [] com = new int[3];
		int [] user = new int[3];
		for(int i = 0 ; i < 3 ;i++) {
			com[i] = (int)(Math.random()*9)+1;
			for(int j = 0 ; j< i ;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(com));
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("세자리 정수 입력");
			int input = scan.nextInt();
			// 정상 입력 &&
			// 오류 ||  tip			
			if(input <100 || input >999) {
				System.out.println("잘못된 입력입니다. ");
				// while 문의 조건식으로 이동 => 처음부터 다시
				continue;
			}
			user[0]= input /100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			if(user[0] == user[1] ||user[1] == user[2]||user[0] == user[2]) {
				System.out.println("같은 숫자는 사용할수 없습니다.");
				// while 문의 조건식으로 이동 => 처음부터 다시
				continue;
			}
			if(user[0] == 0 ||user[1] == 0||user[2] == 0) {
				System.out.println("0은 사용할수 없습니다.");
				// while 문의 조건식으로 이동 => 처음부터 다시
				continue;
			}
			// 비교
			int s =0 , b = 0;
			// s = 같은 자리의 수가 동일, b = 다른 자리에 있는수가 동일
			for(int i = 0 ; i < 3; i++) { //com
				for(int j = 0 ; j < 3; j++) { // user
					if(com[i] == user[j]) {
						if(i==j)s++; //  같은 자리수면
						else b++; // 다른 자리수면
					}
				}
			}
			// 힌트
			System.out.printf("Input : %d, Result : %dS, %dB\n",input,s,b);
			
			// 종료
			if(s==3) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		*/
	}

}
