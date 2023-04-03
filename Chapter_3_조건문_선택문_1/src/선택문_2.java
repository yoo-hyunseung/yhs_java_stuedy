import java.util.Scanner;

//성적 계산
//  case 3,4,5: case 3: case 4: case 5:
public class 선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("3개의 정수 입력:(10 20 30)");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int avg = (kor+eng+math)/3;
		
		char score = 'A';
		switch(avg/10) {
			case 10, 9:
				score = 'A';
				break;
			case 8:
				score ='B';
				break;
			case 7:
				score = 'C';
				break;
			case 6:
				score = 'D';
				break;
			default :
				score = 'F';
		}
		System.out.println("학점은 : "+score);
	}

}
