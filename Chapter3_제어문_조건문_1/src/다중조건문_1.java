/*
 *		다중 조건문 : 조건이 맞는 문장을 수행하고 종료(한 개 문장만 수행)
 *					=> 여러 개를 수행 : 단일 조건문을 사용해야 한다.
 *		예) 1 ~ 100 까지 숫자중 3의 배수 5의 배수, 7의 배수의 합을 출력한다.
 *							----------------------- 단일 3개 사용
 *							15
 *		형식)
 *			if(조건문){
 *				true 일때 수행하는 문장 => 종료
 *					false
 *					  ↓
 *			}
 *			else if(조건문){
 *				
 *			}
 *			else (생략가능){
 *				해당 조건이 없는 경우에 처리되는 문장
 *			}
 *			사칙연산 (+,-,*,/) == > %
 */
// 사칙연산 처리
import java.util.Scanner;
public class 다중조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("1번째 정수 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("2번째 정수 입력 : ");
		int num2 = scan.nextInt();
		System.out.print("연산자 입력(+ - * /)");
		char op = scan.next().charAt(0); // 문자열중에 첫번쨰에 있는 문자를 추출
		// +-*/ => charAt(i) => 자바의 단점 : char는 받을 수 없다.(문자열)
		// 경우  +, - , *, / 다른 문자 입력시 (else)
		
		if(op =='+') {
			System.out.printf("%d + %d = %d",num1,num2,num1+num2);
		}
		else if(op == '-') {
			System.out.printf("%d - %d = %d",num1,num2,num1-num2);
		}
		else if(op =='*') {
			System.out.printf("%d * %d = %d",num1,num2,num1*num2);
		}
		else if(op == '/') {
			if(num2 ==0) {
				System.out.println("0으로 나눌수 없다.!!");
			}
			else {
				System.out.printf("%d / %d = %.2f",num1,num2,num1/(double)num2);
			}
				
		}else {
			System.out.println("잘못된 연산자입니다.!!!");
		}
		
	}

}
