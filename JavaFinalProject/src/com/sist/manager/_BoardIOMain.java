package com.sist.manager;
import java.io.*;
import java.util.*;
public class _BoardIOMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("/Users/yuhyeonseung/Desktop/sist/java_datas/board.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos); // 직렬화 시켜야한다.
			List<BoardVO> list = new ArrayList<BoardVO>();
			BoardVO vo = new BoardVO();
			vo.setNo(1);
			vo.setName("hong");
			vo.setSubject("파일 입출력을 이용한 게시판 만들기");
			vo.setContent("파일 입출력을 이용한 게시판 만들기");
			vo.setRegdate(new Date());
			vo.setPwd("1234");
			vo.setHit(0);
			list.add(vo);
			oos.writeObject(list);
			System.out.println("saved!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
