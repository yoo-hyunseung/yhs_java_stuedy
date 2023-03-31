import java.util.Scanner;

public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("학년과 점수를 입력하세요 : ");
		int sClass = sc.nextInt();
		int score = sc.nextInt();
		if(sClass == 4) {
			if(score >=70 && score <=100) {
				System.out.println("합격입니다.");
			}
			else{
				if(score <0 || score > 100)
					System.out.println("점수가 올바르지 않습니다.");
				else
					System.out.println("불합격입니다.");
			}
		}
		else {
			if(score >=60 && score <=100) {
				System.out.println("합격입니다.");
			}
			else{
				if(score <0 || score > 100)
					System.out.println("점수가 올바르지 않습니다.");
				else
					System.out.println("불합격입니다.");
			}
		}
	}

}
