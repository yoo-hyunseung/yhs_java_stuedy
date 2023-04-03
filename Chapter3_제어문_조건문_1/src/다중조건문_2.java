/*
 * 
 */
//성적 계산 => Rank, 정렬 ...
// 세개의 정수를 받아서 평균을 구해서 => 등급 출력
// 다중 조건문 사용
/*
 * 		90>=
 * 		80>=
 * 		70>=
 * 		60>=
 * 		--------else
 */
import java.util.Scanner;
public class 다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// System.in -> 키보드 입력값 -> 입력값을 받아서 메모리에 저장해주는 역할
		// 정수 : nextInt() , 실수 : nextDouble() , nextBoolean()
		// next() : 문자열 , char는 존재하지 않는다.
		// Scanner는 도스에서만 사용이 가능
		System.out.print("3개의 정수를 입력 : (10, 20, 30)");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		int avg =(int)(kor+eng+math)/3;
		
		System.out.println("국어점수: "+kor);
		System.out.println("영어점수: "+eng);
		System.out.println("수학점수: "+math);
		
		System.out.println("총점 : "+(kor+eng+math));
		System.out.printf("평균 : %.2f\n",(kor+eng+math)/3.);
		
		//학점계산
		char score = 'F'; // default 
		if(avg >=90) {
			score = 'A';
		}
		else if(avg>=80) {
			score = 'B';
		}
		else if(avg>=80) {
			score = 'C';
		}
		else if(avg>=80) {
			score = 'D';
		}
//		else// 생략가능
		System.out.println("학점 : "+score);
		
	}

}
