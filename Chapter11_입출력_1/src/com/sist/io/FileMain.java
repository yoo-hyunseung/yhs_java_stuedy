package com.sist.io;
import java.io.*;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			/*// File 설정
			File file = new File("/Users/yuhyeonseung/Desktop/sist/javaDev/school.txt");
			// File 존재여부
			if(!file.exists()) {
				file.createNewFile();
			}
			System.out.println("파일 만들기 성공...");*/
			/*File dir = new File("/Users/yuhyeonseung/Desktop/sist/java_datas");
			if(!dir.exists()) {
				dir.mkdir();
				System.out.println("폴더 만들기 성공...");*/
			
//			} 
			File dir = new File("/Users/yuhyeonseung/Desktop/sist/javaDev/");
			File[] files = dir.listFiles();
			for(File f : files) {
				if(f.isFile()) {
					System.out.println(f.getName()+" "+f.length());
				}
				else if(f.isDirectory()) {
					System.out.println(f.getName()+" DIR");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
	}

}
