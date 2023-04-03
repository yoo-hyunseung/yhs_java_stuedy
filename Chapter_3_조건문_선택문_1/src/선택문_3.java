/*
 * 		1. if ~ else if : 다중 조건문과 switch는 유사한 제어문	
 * 		   - if~else if : 범위가 있는 경우
 * 		   - switch : 한 개가 선택될 경우(웹에서는 많이 사용하지 않는다)
 *		2. switch에서 문법 사용
 *			= switch에서 처리할 수 있는 데이터형(char, int String)
 *			= case 값:
 *				   ---
 *
 *			= 종료시에는 break;
 *			= default : 생략가능
 *			= 여러개를 같은 문장으로 처리시에는 
 *			  case 10:
 *			  case 9:
 *			  case 8:
 *				처리문장 => no ==10 || no ==9 || no ==8
 */
public class 선택문_3 {
	public static void main(String[]args) {
		int month = (int)(Math.random()*15)+1;
		System.out.println("months = "+month);
		switch(month) {
			case 3,4,5:
				System.out.println("spring");
				break;
			case 6,7,8:
				System.out.println("summer");
				break;
			case 1: case 2: case 12:
				System.out.println("winter");
				break;
			case 9: case 10: case 11:
				System.out.println("fall");
				break;
			default:
				System.out.println("해당 계절이 없습니다.");
				
		}
	}
}
