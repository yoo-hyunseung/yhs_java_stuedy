//가위 바위 보 게임
import java.util.Scanner;
/*
 * 		컴퓨터
 * 		  가위(0)   사용자
 * 				  가위(0) 0 =>same
 * 				  바위(1) -1 => user
 *                보(2) -2 => com
 *              
 * 	      바위(1)   
 *                가위(0) 1 =>com
 *                바위(1) 0  => same
 *                보(2) -1 => user
 *              
 * 		  보(2)
 *                가위(0) 2 =< user
 *                바위(1) 1 => com
 *                보(2)  0 => same
 *                
 *         비기는 경우 0
 *         사용자가 이기는 경우 -1,2
 *         컴퓨터가 이기는 경우 -2,1
 */
public class 반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int win = 0, lose = 0, same = 0;
		while(true) { // for(;;);
			System.out.print("가위(0), 바위(1), 보(2), 종료(9): ");
			//컴퓨터 난수 발생
			int com = (int)(Math.random()*3);
			int user = scan.nextInt();
			
			if(user ==9) {
				System.out.println("게임 종료!!");
				break; // while 문 종료
			}
		
			// 컴퓨터와 사용자의 가위바위보
			if(com ==0) {
				System.out.println("컴퓨터 : 가위");
			}
			else if(com ==1) {
				System.out.println("컴퓨터 : 바위");
			}
			else if(com ==2){
				System.out.println("컴퓨터 : 보");
			}
			if(user ==0) {
				System.out.println("컴퓨터 : 가위");
			}
			else if(user ==1) {
				System.out.println("컴퓨터 : 바위");
			}
			else if(user ==2){
				System.out.println("컴퓨터 : 보");
			}
			//결과값 출력
			switch(com -user) {
				case-1,2:
					System.out.println("user win");
					win++;
					break;
				case 1,-2:
					System.out.println("com win");
					lose++;
					break;
				case 0:
					System.out.println("same");
					same++;
					break;
			}
		}
		//while문 종료
		System.out.println("========result========");
		int total = same+win+lose;
		System.out.printf("%d전 %d승 %d패 %d무\n",total,win,lose,same);
	}

}
