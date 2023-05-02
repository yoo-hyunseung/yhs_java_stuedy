package com.sist.io2;
/*
 *    데이터 연결 : 자바응용프로그램 
 *               ------------ .java
 *        |
 *     데이터 (변수 , 배열, 클래스 , 파일, 오라클)
 *           --------------- 메모리 (단점 -> 한번 사용하면 지워진다.)
 *           파일 : 영구적으로 저장 (보안에 취약 , 다른 파일과 연결성이 떨어진다.)
 *           -------------------------------
 *           Spring : Web 제어
 *           MyBatis : Mapper(데이터베이스 연결)
 *           -------------------------------          
 *      데이터 -> 읽기 / 쓰기
 *       |
 *       파일 / 오라클
 *       ---
 *        InputStream (Reader) / OutputStream(Writer)
 *           |            | 
 *           1 byte씩 읽기  2byte씩
 *           -----------  -------
 *               |          |
 *           업로드/다운로드()  | -> 한글이 포함된 파일 제어
 *           (zip, png...)    
 *           
 *           -> 읽기 / 쓰기 -> 동시에 수행이 불가하다. -> 단방향
 *             -> 파일 읽기 통로
 *             -> 파일 쓰기 통로
 *                        --- 데이터가 이동되는 통로 -> Stream(스트림)
 *       ----------------------------------------------------------
 *       
 *       전송 속도가 빠른 형태의 클래스 
 *       Buffered~~ 형태            
 *       ObjectInputStream / ObjectOutputStream 
 *       File 정리
 *              
 *       ----------------------------------------------------------
 *       
 *       read/readLine , write , close
 *                      
 *           
 */
public class IO_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
