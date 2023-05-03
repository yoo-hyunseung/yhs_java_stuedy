package com.sist.io;
// BufferedReader
// BufferedWriter
import java.io.*;

public class 입출력_4 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter out = new FileWriter("/Users/yuhyeonseung/Desktop/sist/java_datas/movie_1.txt");
		// 자동으로 지정된 파일을 생성 없으면 만들고, 있으면 덮어쓰기
		// 추가 : append() 기능 => 경로뒤에 ,true 추가하면된다.
		FileReader in = new FileReader("/Users/yuhyeonseung/Desktop/sist/javaDev/movie.txt");
		// 기반스트림
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		while(true) {
			String data = br.readLine();
			if(data == null) {
				break;
			}
			bw.write(data+"\n");
		}
		System.out.println("읽기 쓰기 완ㄹ료");
		in.close();
		out.close();
	}

}
