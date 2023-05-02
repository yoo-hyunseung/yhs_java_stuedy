package com.sist.io;

import java.io.*;
import java.util.*;
public class FileOutputStream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 파일 지정
			File file = new File("/Users/yuhyeonseung/Desktop/sist/java_datas/school.txt");
			
			//없는 파일 경우 체크
			if(!file.exists()) {
				file.createNewFile(); // 파일을 만들어라 명령
			}
			// 파일이 존재할 때 사용해야한다.
			FileOutputStream fos = new FileOutputStream(file);
			String msg = "안녕하세요 지금은 파일입출력하고 있습니다.\r\n";
			fos.write(msg.getBytes());
			// String to byte[] => getBytes();
			fos.close();
			System.out.println("saved");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
