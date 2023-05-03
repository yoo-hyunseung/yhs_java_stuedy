package com.sist.io2;
import java.io.*;
import java.util.*;
public class MusicSystem {
	// 데이터 읽기
	private static List<GenieMusicVO> list = new ArrayList<GenieMusicVO>();
	
	static {
		// 초기화블럭
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("/Users/yuhyeonseung/Desktop/sist/java_datas/genie_music.txt");
			ois = new ObjectInputStream(fis); // 객체 단위로 값을 가져온다.
			list = (List<GenieMusicVO>)ois.readObject();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public void musicCategoriData(int cno) {
		for(GenieMusicVO vo : list) {
			if(vo.getCno()==cno) {
				System.out.println(vo.getNo()+" "+vo.getTitle());
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		MusicSystem ms = new MusicSystem();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("가요(1), POP(2), OST(3), 트롯(4), JAZZ(5), CLASSIC(6)");
			String cno = in.readLine();
			ms.musicCategoriData(Integer.parseInt(cno));
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}
	
}
