package com.sist.io;

import java.util.*;
import java.io.*;
public class Object_inputOutput_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream in = new FileInputStream("/Users/yuhyeonseung/Desktop/sist/java_datas/sawon.txt");
		ObjectInputStream ois = new ObjectInputStream(in);
		
		// 객체 단위로 값을 읽어온다
		List <Sawon> list = (List<Sawon>)ois.readObject();
		for(Sawon s : list) {
			System.out.println(s.getSabun()+" "+s.getName()+" "+s.getDept()+" "+s.getJob()+" "+s.getPay());
		}
	}

}
