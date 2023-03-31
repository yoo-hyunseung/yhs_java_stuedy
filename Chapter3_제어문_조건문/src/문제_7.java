import java.util.Scanner;
import java.text.*;
public class 문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("세개의 정수를 입력하세요 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int total = kor + eng + math;
		double avg = total/3.;
		int temp = (int)avg;
		System.out.println("총점은 : "+total);
		System.out.println("평균은 : "+avg);
		if(temp>=90 && temp <=100) {
			System.out.println("학점은 A 입니다.");
		}
		if(temp>=80 && temp <90) {
			System.out.println("학점은 B 입니다.");
		}
		if(temp>=70 && temp <80) {
			System.out.println("학점은 C 입니다.");
		}
		if(temp>=60 && temp <70) {
			System.out.println("학점은 D 입니다.");
		}
		if(temp < 60)
			System.out.println("학점은 F 입니다.");
		
		double[] limit = {50,60,70,80,90};
		String[] grade = {"F","D","C","B","A"};
		int score1[] = {100,95,88,52,78};
		ChoiceFormat form = new ChoiceFormat(limit,grade);
		for(int i = 0 ; i < score1.length ; i++) {
			System.out.println(score1[i]+ form.format(score1[i]));
		}
	}

}
