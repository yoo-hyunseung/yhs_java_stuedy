package com.sist.exception;

import java.io.IOException;
import java.sql.SQLException;

// 예외 떠맡기기 , 예외회피 ...
// => 메소드를 읽는다. => JVM에 이런 예외가 발생할 수 있다(알려만 주는 것) -> 예외선언
// => 메소드 호출시에 반드시 직접, 선언
// => RuntimeException => 생략이 가능 (예외처리를 안해줘도 된다)
/*
 * 
 *      상위 클래스를 이용해서 전체를 처리가 가능하다.
 *        Throwable (Exception / Error)
 *            |
 *     -------------------------------
 *     |                             | 
 *   Error                       Exception
 *    (X)                            |
 *                         Check          UnCheck
 *                         ----------------------
 *                         |                    |
 *                      IOException         RuntimeException
 *                      SQLException            |
 *                      ..                 --------------------------    
 *                      ..                 |
 *                                    NumberFormatException ,,,, Array..
 *                                    
 *                                     
 *              void method() throws RuntimeException
 *              *** void method() throws Exception
 *              void method() throws NumberFormatException, ClassCastException..
 *              *** void mehtod() throws IOException
 *              ***void method() throws SQLException, NumberFormatException
 *              
 *              Checked 는 반드시 예외처리를 해야함
 *              
 *              
 */

public class 예외처리_예외회피_1 {
	public static void methods() throws Exception{
		// 예외처리 대상
	}
	public static void method1()throws Exception{ // 간접처리 (JVM이 처리)
		methods();
	}
	public static void method2() {
		try {
			methods();
		} catch (Throwable e) { //예외처리 클래스가 같거나 커야한다. Throwable > Exception > IOException
			// TODO: handle exception
		}
	}
	public static void method3() throws IOException,SQLException,ClassNotFoundException {
		
	}
	public static void method4() throws IOException,SQLException,ClassNotFoundException{
		method3();
	}
	public static void method5() throws Exception{//예외처리 클래스가 같거나 커야한다. Throwable > Exception > IOException
		method3();
	}
	public static void method6() throws Throwable{//예외처리 클래스가 같거나 커야한다. Throwable > Exception > IOException
		method3();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
