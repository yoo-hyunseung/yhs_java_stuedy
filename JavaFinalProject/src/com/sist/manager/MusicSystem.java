package com.sist.manager;
import java.io.*;
import java.util.*;

import com.sist.manager.GenieMusicVO;
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
	
	public List<GenieMusicVO> musicCategoriData(int cno) {
		List<GenieMusicVO> mList =
				new ArrayList<>();
		for(GenieMusicVO vo : list) {
			if(vo.getCno()==cno) {
				System.out.println(vo.getNo()+" "+vo.getTitle());
				mList.add(vo);
			}
		}
		return mList;
	}
	public List<GenieMusicVO> musicFindData(String title){
		List<GenieMusicVO> mList = new ArrayList<>();
		for(GenieMusicVO vo : list) {
			if(vo.getTitle().contains(title)) {
				mList.add(vo);
			}
		}
		return mList;
	}
	// 뮤직 데이터 20개 씩 나눠서 전송
	public List<GenieMusicVO> musicListData(int page){
		List<GenieMusicVO> gList = new ArrayList<>();
		int j=0;
		int rowSize = 20;
		int start = (page-1)*rowSize;
		/*
		 *  1page => 0 ~19
		 *  2page => 20 ~ 29;
		 */
		for(int i =0 ; i < list.size();i++) {
			if(j<rowSize && i >=start) {
				gList.add(list.get(i));
				j++;
			}
		}
		return gList;
	}
	public int musicTotalPage() {
		return (int)(Math.ceil(list.size()/20.0));
	}
	public GenieMusicVO musicDetailData(String title) {
		GenieMusicVO vo = new GenieMusicVO();
		for(GenieMusicVO gvo : list) {
			if(gvo.getTitle().equals(title)) {
				vo = gvo;
				break;
			}
		}
		return vo;
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
