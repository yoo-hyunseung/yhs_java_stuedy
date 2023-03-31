import java.util.Scanner;

// 세개의 정수를 입력 받아서 총점 / 평균 / 학점 
public class 조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		System.out.print("정수를 입력하세요(80 90 70): ");
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();

		// 결과 값을 출력
		int total = kor + eng + math;
		double avg = total / 3.;
		// 학점
		int temp = (int) avg;
		char score = ' ';

		if (temp >= 90 && temp <= 100)
			score = 'A'; // 독립적인 문장 => 모든 if을 수행한다.
		if (temp >= 80 && temp < 90)
			score = 'B';
		if (temp >= 70 && temp < 80)
			score = 'C';
		if (temp >= 60 && temp < 70)
			score = 'D';
		if (temp < 60)
			score = 'F';

		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n: ", avg);
		System.out.println("학점 : " + score);

	}

}
