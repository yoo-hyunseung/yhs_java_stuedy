package com.sist.exception;
/* 
 *    임의발생 : 테스트목적
 *    ----------------- 배포전(배포 : 상용화)
 *    형식)
 *        throw new 예외처리생성자()
 *        
 *    
 */
public class 예외처리_임의발생_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			if(a%2 == 0) {
				System.out.println("임의로 예외발생");
				throw new NumberFormatException("정수 변환이 안됨");
				// throw -> 사용자 정의 예외처리에 주로 사용한다.
				
				// ==> catch 로 이동 => 소스코딩을 할 수 없다.
				// -> System.out.println(); error
				// getMessage 변경 -> 생성자 매개변수 이용
				/*
				 *  class NumberFormatException extends Exception{
  		  		 *      private String message = "default 문자열"; -> For input string: " 10"
  		  		 *      public NumberFormatException(){}
  		  		 *      public NumberFormatException(String message){
  		  		 *           this.message = message;
  		  		 *      }
  		  		 *      getter / setter
 				 *  }
				 */
//				Integer.parseInt(" 10");
				
			}
		} catch (ClassCastException e) {
			// TODO: handle exception
			System.out.println(e.getMessage()); // 생성자에서 메세지를 바꿔줄 수 있다.
			// 에러확인 --> 에러 부분을 수정
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("NumberFormatException : "+e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		

	}

}
