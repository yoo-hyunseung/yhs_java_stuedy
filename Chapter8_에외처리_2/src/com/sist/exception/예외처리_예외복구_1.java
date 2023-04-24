package com.sist.exception;
/*
 * 267 page
 *     
 *     
 *     try : 정상실행하는 코딩
 *     catch : 예외가 발생시에 복구하는 과정 (여러개 사용이 가능 -> 순서) -> 계층구조
 *     ---------------------------------------------------------------
 *     예외처리 => 소스상에서 수정이 가는한 에러 (가벼운에러) 
 *     -----   사전에 에러를 방지하는 프로그램
 *              비정상 종료를 방지하고 정상 종료가 가능하게 만드는 목적
 *                    계층구조(상속도)
 *                    ------
 *                    
 *                    Object : 모든 클래스의 상위 클래스(모든 클래스는 Object 상속을 받는다.
 *                    
 *                    Throwable  : 에러의 최상위 클래스
 *                     |
 *       ----------------------------              
 *    Error                      Exception : 처리가 가능
 * ---------                       |         0으로 나누는 경우, 정수 변환의 문제, 형변환, 파일명 에러, 
 *      |                          |        웹에서 ip url이 다른 경우
 *      |                          |         객체가 null일 때 주소에 접근하는 경우
 *      |                          |        
 *      |                          |
 *    처리가 불가능                Exception : 예외처리 최상위 클래스
 *    -> 메모리 부족
 *    -> 윈도우 종료
 *                   ---------------------------------
 *                   |                               |
 *               CheckException(존재 X)        UnCheckException(존재 X) 필요시에만 사용 컴파일시에 확인 x
 *                   |                               |
 *           컴파일시에 반드시 예외처리를 했는지        RuntimeException
 *            반드시 예외처리                            |
 *                                             NumberFormatException
 *                                             
 *                        Exception
 *                            |
 *         --------------------------------------------------------
 *         1) CheckedException
 *                   |
 *                => IOException : 파일 입출력. 메모리 입출력, 네트워크 입출력
 *                  (java.io)
 *                  
 *                => SQLException : 오라클 연결 (오라클이 인식하는 언어 : SQL)
 *                   JDBC ==> DBCP => ORM => (Mybatis, JPA)    
 *                => MalformedURLException ; IP/WEB URL
 *                   java.net
 *                   
 *                => ClassNotFoundException : 클래스이름으로 메모리 할당 = > 클래스명, 패키지명, 틀리견우에러
 *                   = 스프링에서 주로 사용하느 기술 (리플렉션)
 *                                             ----- priavte 까지 접근이 가능
 *                 A a = new A(); Class.forName("A"); 메모리할당이가능 <- 리플렉션
 *                 
 *                => InterruptedException : 쓰레드 (한개의 프로세스 안에어 여러개의 프로그램을 동시에 사용) 충돌
 *                => java.lang / java.util => 예외처리와 관련이 없다.
 *                => 예외처리는 필수 : 정상상태를 유지  => 견고한 프로그램
 *        2) UnCheckedException : 예외처리는 필요한 경우에만 사용
 *                    Exception 
 *                       |
 *                    RuntimeException : 실행시 (인터프리터) => 사용자 입력, 프로그램 실수
 *                       |
 *                    NumberFormatException : 정수변환에서 에러
 *                       => Wrapper : 기본형을 사용하기 쉽게 클래스형으로 제작
 *                                    ----- > boolean = Boolean
 *                                            int = Integer
 *                                            double = Double...
 *                                   Integer.parseInt(" 10"); => 윈도우, web(문자열만 사용)
 *                                    웹에서 전송된 데이터를 받는 경우 
 *                                    ------------------------
 *                                    String getParameter() => 정수로 넘어오지 않는다.
 *                                    
 *                                    Jsoup : 데이터 수집 (String)
 *                     ArrayIndexOutOfBoundsException : 배열 범위 초과
 *                     ------------------------------  컬렉션
 *                     ArithmeticException : 0 으로 나눌 경우
 *                     NullPointerException : 객체나 배열의 주소가 없는 경우
 *                        A a; , int[] arr ;  ==> null
 *                        ---- A a = new A();
 *                     ClassCastException : 클래스 형변환이 잘못된 경우
 *                     class A
 *                     class B extends A
 *                     B b = (B)new A(); error ClassCastException
 *                     ------------------------------------------
 *                     A a = new B();
 *                     B b = (B)a;  정상 형변환
 *        
 *                     
 *        예외처리의 기본 ( 267 page )
 *        try ~ catch
 *        ------------
 *        (형식)
 *             try{
 *                   정상수행이 가능한 코딩 => 지금까지 소스가 들어간다.
 *              
 *             }catch(예외처리 종류 설정){
 *                 수행과정에서 오류 발생시 처리되는 부분
 *             
 *             }             
 *           ------------------------------------------------------
 *                    
 *                        
 *                     
 *                  try ~ catch -> 소스 전체 처리 : 종료
 *                                -----------
 *                                
 *                                부분처리  : 제외
 *                       
 *                    
 *                
  
 *                                             
 *                                             
 */
public class 예외처리_예외복구_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			for(int i = 0  ; i < 10 ; i++) {
				try {
					int j = (int)(Math.random()*3);//0,1,2
					int k = i/j;
					System.out.println("k = "+k);
				}catch(Exception e) {
					System.out.println("0으로 나눌 수 없다.");
				}
			}

			// TODO: handle exception
			

		
	}

}
