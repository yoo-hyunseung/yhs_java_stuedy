package com.sist.io;
/*
 *      FileInputStream : 단위 byte (1byte 씩 읽어온다)
 *        => 한글포함된 데이터는 읽을 수 있는데 한글이 깨진다.
 *           ------------- FileReader
 *           .zip , .ppt , .png ...  업로드 / 다운로드
 *           -------------- 웹에서 자료실, 갤러리 게시판 만들기
 *           
 *        -> 주요메소드
 *           read() => 1byte => 리턴형 => int
 *           close() 닫기
 *        -> 생성자
 *          new FileInputStream(File file);
 *          new FileInputStream(String path);
 *           
 */
import java.io.*;
import java.util.*;
public class FileInputStream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 파일 읽기
			// System.in / System.out
			// 표준 입출력
			// 파일 읽기
			FileReader/*InputStream*/ fis = new FileReader("/Users/yuhyeonseung/Desktop/sist/javaDev/javaStudy/Chapter11_입출력_1/src/com/sist/io/InputOutputMain.java");
			// FileInputStream :한글은 2 byte라서 깨진다.  ~Reader를 사용해야 한다.
			// FileReader 2byte 안깨짐
			int i = 0; // 1개의 문자를 읽어 온다 -> 문자번호를 넘겨준다/
			// 문자 번호를 받는 변수
			// -1 은 더이상 읽을 데이터가 없을때 까지 = > EOF (End Of File)
			while((i = fis.read()) != -1) {
				System.out.print((char)i); 
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // exception
	}

}
