/*
 * 		피연산자 / 연산자
 * 		------ 연산대상
 * 
 * 		피연산자 1개 : 단항연산자
 * 		a++
 * 		피연산자 2개 : 이항연산자
 * 		10 + 20
 * 		피연산자 3개 : 삼항연산자
 * 
 * 		1. 단항연산자
 * 			= 증감연산자 ( ++ , -- )  한개 증가 / 한개 감소 ==> 반복문에서 자주사용
 * 				int a = 10;
 * 				a++;
 * 				=>9
 * 			= 부정연산자(boolean만 사용가능) ! => 턴
 * 				boolean	b = true;
 * 				!b
 * 				=> false
 * 				==> 예약가능한 날
 * 			= 형변환연산자 (데이터형)
 * 				(int)10.5 => 소수점 제거 10 
 * 				(char)65 => 'A'
 * ------------------------------------------(downcasting)강제형변환
 * 				(int)'A' => 65
 * 				(double)10 => 10.0
 * ------------------------------------------(upcasting)자동형변환
 * 				자료형이 작은거로 다운캐스팅, 올라가는거는 업캐스팅
 * 			= 반전연산자 (양수를 음수로 변경) 음수표현 ~
 * 			
 * 			10.5 + 10 = 20.5 ==> 데이터형이 동일할때 연산가능
 * 			 	   --
 * 				   10.5 ==> 20.5
 * 
 * 			int 이하는 데이터형은 연산시에 결과값이 int다.
 *			---------byte/short/char
 *
 *			int + double = double
 *			char + long = long
 *			int + long = long
 *			long + double = double
 *
 *			byte + char -> int
 * 			
 * 			1. 단항연산자
 * 				++ : 1개 증가
 * 				-- : 1개 감소
 * 				
 * 				형식 
 * 				 = 전치연산자 : 먼저 증가 / 감소
 * 					++a
 * 				 = 후치연산자 : 나중에 증가 / 감소
 * 					a--
 * 				int a = 10;
 * 				int b = ++a;
 *                   -- -- 
 *                       1
 *                    2 ================> a = 11, b = 11
 * 				int a = 10;
 * 				int b = a++;
 *                   --  --
 *                   1   ===============> a = 11, b = 10
 *                       2
 *                       
 *              int a = 10
 *              int b = a++ + a++;
 *                      10    11
 *              int b = ++a + ++a;
 *                      11    12
 *              int b = ++a + a++;
 *              
 *              int b = a++ + ++a;
 *               
 *              
 *              int a = 10;
 *              int b = a++ + a++ + ++a + a++;
 *                      10    11    13    13 ==> 47 a => 14
 *                      
 *              int a = 10;
 *              int b = ++a + ++a + ++a + ++a;
 *              
 *              
 *              int a = 10;
 *              int b = a-- + a-- + --a;
 *              
 *          2. 부정연산자 (!) => true / false
 *          	!true => false;
 *          	!false => true;
 *          
 *          3. 형변환연산자
 *          	10.5 + 10.5 ==> 21.0
 *          	(int)10.5 + (int)10.5 = 20
 *          	---------   ---------
 *                 10     +    10     = 20
 *              (int)(10.5 + 10.5) => 21
 *              
 *              
 *              double d = 10 ==>10.0
 *              
 *              int a = 'A' ==>65
 *              ---------------------------
 *              int a = (double)10.5 ==> 10
 *              
 *              ==> int 이하 데이터형은 연산시 -> int
 *                  -------- byte, short, char 
 *                  char + double => double
 *                  char + byte => int
 *                  char + char => int
 *                  
 *              ==> char는 연산이 되면 정수로 바뀐다.
 *              
 *         이항연산자
 *         --------
 *         		산술연산자 : + , - , * , / , %
 *         		  => +, - , *  : 데이터형
 *         		  => +
 *         			산술연산, 문자열 결합
 *                => /
 *                	정수/정수 => 정수 ==> 10/3 = 3;
 *                	정수/실수 => 실수 ==> 10/3.0 = 3.3333....
 *                	0으로 나누면 오류가 발생
 *                => %
 *                	10%2 = 0;
 *                	11%2 = 1; 
 *                  ---------
 *                  5%2 = 1;
 *                  * -5%2 = -1
 *                  5%-2 =1;
 *                  * -5%-2 = -1
 *                  ---------- 부호는 왼쪽편을 따라간다.
 *           *****  +  10+9 = 19
 *           		+ 문자열 결합
 *           		"7" + 77 = "777";
 *           		7 + "7" + 7 = "777"
 *           		------
 *           		  "77"
 *           			-------
 *           			"777"
 *           		7+7+"7" = "147"
 *           
 *            		7+ "7" + 7 + 7 = "7777"
 *            
 *            		7 + "7" + (7 + 7) = "7714"
 *          	   
 *                  
 *                  
 */
public class 연산자의종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = (int)(Math.random()*100)+1;
//		              =================
//		               0.0 ~ 0.99
//		         ===
//		                                ==
		System.out.println(a);
		
		System.out.println(10/3);
		
//		byte b = 10;
//		char c = 'A';
//		int a = b+c;
//		System.out.println(a);
		
//		byte b = 10;
//		char c = 20;
//		int d = b+c; // error int 형으로 받아야함
//		
//			
//		System.out.println(~100);
			
//		int a = 10;
//		int b = a-- + a-- + --a;
//		System.out.println("a = "+a);
//		System.out.println("b = "+b);
		
		boolean bCheck = false;
		System.out.println(bCheck);
		System.out.println(!bCheck);
		
		
	}

}
