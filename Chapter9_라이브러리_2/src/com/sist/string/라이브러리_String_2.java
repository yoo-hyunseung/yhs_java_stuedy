package com.sist.string;
import java.io.*;
public class 라이브러리_String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			long start = System.currentTimeMillis();
			FileReader fr = new FileReader("/Users/yuhyeonseung/Desktop/sist/javaDev/movie.txt");
			int i =0; // 문자 읽기 -> int로 읽는다.
			StringBuffer data = new StringBuffer();
			while((i = fr.read())!=-1) {// EOF file의 
				data.append((char)i);
			}
			long end = System.currentTimeMillis();
			
			fr.close();
			System.out.println(data.toString());
			System.out.println("걸린시간 : "+(end-start));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace(); // 에러 메세지 확인
//			System.out.println(e.getMessage());
		}
	}

}
