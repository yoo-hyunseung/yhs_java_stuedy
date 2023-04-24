package com.sist.exception;
/*
 *      *** 예외를 수정하는 것이 아니다 => 에러발생한 소스를 건너뛴다.
 *      형식
 *      ---
 *         try{
 *             문장1
 *             문장2
 *             문장3
 *         }catch(예외처리 종류){
 *             문장4
 *             
 *         }
 *         문장5
 *         문장6
 *      
 *      ====> 문장1 => 문장2 => 문장3 => 문장5 => 문장6
 *      
 *      
 *      try{
 *             문장1
 *             문장2 ==> error 발생 => catch로 이동
 *             문장3
 *             try 안에서 에러 발생시 에러난 위치부터 try끝까지는 수행하지 않는다.
 *             ----------------------------------------------------
 *             catch로 이동 => catch문장을 수행한다.
 *         }catch(예외처리 종류){
 *             문장4
 *             
 *         }
 *         문장5
 *         문장6
 *     
 *     ====> 문장1 => 문장4 => 문장5 => 문장6     
 *      
 */

public class 예외처리_예외복구_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("문장1");
//		System.out.println("문장2");
//		System.out.println("문장3"+10/0); // 비정상 종료
//		System.out.println("문장4");
//		System.out.println("문장5");
		System.out.println("문장1");
		System.out.println("문장2");
		try {
			System.out.println("문장3");
			System.out.println("문장4"); // 정상수행이 가능
			int [] arr =new int[2];
			arr[2] = 100;
			System.out.println("문장5"+arr[2]); // 오류
			System.out.println("문장6");
			/////////////////////////// => catch 가 수행 된다.
			/////// 예외와 예외처리를 하는 클래스 매칭 => 예측
			/////// 멀티 catch 
		} catch (ArrayIndexOutOfBoundsException e) { // 에러처리시 0으로 나눌 경우에만 처리가 가능, 배열 에러는 잡지못함
			// TODO: handle exception
			System.out.println("문장6: 에러처리 완료");
		}
		System.out.println("문장7");
		System.out.println("프로그램 종료");
		
	}

}
