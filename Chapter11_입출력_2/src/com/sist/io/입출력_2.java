package com.sist.io;

import java.util.*;
import java.io.*;
// 파일 읽기 
// FileInputStream(1byte) / FileReader(2byte)
// 한글이 포함 --> 반드시 2바이트씩 읽어야한다. -> 한글 깨짐 방지
public class 입출력_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader = null;
		
		try {
			reader = new FileReader("/Users/yuhyeonseung/Desktop/sist/javaDev/movie.txt");
			//8192
			BufferedReader in = new BufferedReader(reader);
			// 네트워크 통신에도 많이 사용
			int i = 0;
			// int read() -> 글자의 ACS 코드를 읽어온다. (정수)
			// A -> read() => 65
			// int read(byte[],int,int) => 읽은 바이트수 
			long start = System.currentTimeMillis();
			/*while((i=in.read())!=-1) {
				// -1 => 읽은 데이터가 없는 경우 => 전체데이터 읽은 경우
				System.out.print((char)i);
			}*/
			while(true) {
				String data = in.readLine();
				if(data==null)
					break;
				System.out.println(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("읽은 시간 : "+(end-start));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
				
			}
		}
	}

}
