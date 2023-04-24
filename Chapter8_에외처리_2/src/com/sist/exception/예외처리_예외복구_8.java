package com.sist.exception;

import java.io.*;
// CheckedException
public class 예외처리_예외복구_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
//		FileReader fr = null; // 지역변수의 일종
//		
//		try {
//			fr = new FileReader("/Users/yuhyeonseung/Desktop/sist/javaDev/javaStudy/Chapter8_에외처리_2/src/com/sist/exception/예외처리_예외복구_2.java");
//			while((i=fr.read())!=-1) {
//				System.out.print((char)i);
//			}
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				fr.close();
//			} catch (IOException e2) {
//				// TODO: handle exception
//			}
//		}
		// resource-with => fr을 자동으로 닫는다 (finally를 사용하지 않는다.)
		try (FileReader fr = new FileReader("/Users/yuhyeonseung/Desktop/sist/javaDev/javaStudy/Chapter8_에외처리_2/src/com/sist/exception/예외처리_예외복구_2.java")) {
			i = 0;
			while((i=fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
