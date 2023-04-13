/*
 *      기초
 *       = 변수 , 데이터형 
 *       = 연산자 , 제어문
 *       = 배열
 *      
 *    1. 구성요소
 *    2. 구성요소 사용법
 *    3. 접근범위
 *    4. 객체지향의 3대 요소
 *    5. 클래스의 종류
 *    6. 예외처리
 *    --------------------
 *    API -> 지정된 라이브러리 사용법
 *    
 */
class Student{
	int hakbun;
	String name;
	
	
	
}
public class 클래스의구성요소_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student();
		// hong => hakbon, name
		hong.hakbun = 1;
		hong.name ="홍길동";
		Student shim = hong;
		shim.hakbun = 2;
		shim.name = "심청이";
		System.out.println(hong.name);
		
	}

}
