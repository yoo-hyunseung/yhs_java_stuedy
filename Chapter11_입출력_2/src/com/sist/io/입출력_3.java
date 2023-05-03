package com.sist.io;
// 파일쓰기
import java.io.*;
public class 입출력_3 {
	public static void main(String[]args) {
		FileWriter out = null;
		//BufferedWriter
		FileReader in = null;
		// BufferedReader 
		try {
			// 1. 파일 만들기
			// 2. 
			File file = new File("/Users/yuhyeonseung/Desktop/sist/java_datas/movie.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			// 팡일ㄹ읽기
			// 생성된 파일쓰기
			in = new FileReader("/Users/yuhyeonseung/Desktop/sist/javaDev/movie.txt");
			out = new FileWriter(file); // 경로,변수 둘다가능
			int i = 0;
			while((i=in.read())!=-1) {
				out.write(i);
			}
			System.out.println("읽기 쓰기 완료");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
