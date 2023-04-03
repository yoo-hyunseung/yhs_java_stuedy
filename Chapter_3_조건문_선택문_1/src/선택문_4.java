import java.util.Scanner;

/*
 * 	중첩 switch
 * 		if중첩
 * 		if(){
 * 			if(){
 * 				
 * 			}
 * 		}
 * 		// 특별한 경우가 아니면 거의 사용빈도가 없다.
 * 		switch(){
 * 			case 값:
 * 			switch(){
 * 			}
 * 		}
 */
// 가위 바위 보
/*
 * 		가위
 * 		  가위
 * 		  바위
 * 		  보
 * 		바위
 * 		  가위
 * 		  바위
 * 		  보
 * 		보
 * 		  가위
 * 		  바위
 * 	      보
 * 
 */

public class 선택문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터가 먼저 가위바위보를 설정
		int com = (int)(Math.random()*3);//0(가위),1(바위),2(보);
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("0(가위),1(바위),2(보) 입력: ");
		int user = sc.nextInt();
		// 비교(처리) -> 결과값을 출력
		// 변수 설정 => 변수에 대한 처리 => 결과값을 출력
		switch(com) {
			case 0:
				System.out.println("컴퓨터 : 가위");
				break;
				// break 밑에는 소스 코딩이 있는 경우에 오류 발생
			case 1:
				System.out.println("컴퓨터 : 바위");
				break;
			case 2:
				System.out.println("컴퓨터 : 보");
				break;
		}
		
		switch(user) {
		case 0:
			System.out.println("player : 가위");
			break;
			// break 밑에는 소스 코딩이 있는 경우에 오류 발생
		case 1:
			System.out.println("player : 바위");
			break;
		case 2:
			System.out.println("player : 보");
			break;
		}
		switch(com) {
			case 0:
				switch(user) {
					case 0:
						System.out.println("비겼다!");
						break;
					case 1:
						System.out.println("player win!");
						break;
					case 2:
						System.out.println("computer win!");
						break;
				}
				break;
			case 1:
				switch(user) {
				case 0:
					System.out.println("computer win!");
					break;
				case 1:
					System.out.println("draw!");
					break;
				case 2:
					System.out.println("player win!");
					break;
			}
				break;
			case 2:
				switch(user) {
				case 0:
					System.out.println("player win!");
					break;
				case 1:
					System.out.println("computer win!");
					break;
				case 2:
					System.out.println("draww!");
					break;
			}
				break;
				
		}
	// 변수 설정 = > 변수에 대한 처리(연산자제어문 	
	}

}
