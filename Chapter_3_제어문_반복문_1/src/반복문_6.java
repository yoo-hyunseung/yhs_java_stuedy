import java.util.Scanner;

// updown game
/*
 * 		컴퓨터가 난수를 발생 1~100
 * 		=> 사용자 입력	
 *      => 입력시에 힌트
 *      => for문 횟수 ? 
 *      	=> 무한루프 for(;;)
 *      
 */
public class 반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = (int)(Math.random()*100)+1;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		for(;;) { // 무한 루프는 정지시점을 정해놔야함
			System.out.print("1~100 사이의 정수를 입력: ");
			int user = sc.nextInt();
			
			if(user <=100 && user >=1) {
				//힌트
				count++;
				if(com > user) {
					System.out.println("UP");
				}
				else if(com < user) {
					System.out.println("DOWN");
				}
				else {
					System.out.println("GAME OVER");
					System.out.println("입력횟수 : "+count);
					System.exit(0);
				}
			}
			else {
				System.out.println("잘못된 입력입니다. !!");
			}
		}
		
	}

}
