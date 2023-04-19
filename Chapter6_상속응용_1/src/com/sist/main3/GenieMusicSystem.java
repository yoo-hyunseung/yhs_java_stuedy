package com.sist.main3;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusicSystem {
	protected Music[] musics = new Music[50]; // 모든 사람에게 공유 -> 멜론 / 지니 2개 이므로 static 은 사용할수 없다.
	// 멜론에서도 상속 받아야 하기 때문에 protected(*), default, public(메모리상에서 접근이가능하기떄문에 안됨)
	// private 상속후 접근이 불가하다. -> getter / setter -> 값을 넣는게아니라 다시 새로운 메모리로 해야 하기 때문(X)
	protected String title = "지니뮤직 Top50";
	// 1. 초기화
	/*
	 *   인스턴스 블록
	 *   static 블록 (********) 자동호출
	 *  ------------------- 자동 호출
	 *   생성자(****) 불러와야함
	 *   
	 *   예외처리
	 *   ------
	 *     |
	 *    에러 => 소스상에서 처리할 수 없는 심각한 에러
	 *           메모리 공간이 부족
	 *    예외 => 수정이 가능한 에러
	 *        => 예외 복구 / 예외 회피
	 *        => 비정상 종료를 방지하고 정상 수행이 가능하게...
	 *        => IO , Network ,Thread , Web
	 *           --   -------  ------   ---
	 *                         충돌      -> 404 , 500 , 403, 412 400...
	 *                IP/URL 에러
	 *           파일 경로명 파일명
	 *        => 에러
	 *           사용자 입력
	 *           프로그래머의 실수
	 *    
	 */
		{  // 인스턴스 블럭
//		try {
//			
//		}catch(Exception ex) {
//			
//		}
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			// 문서 저장 공간 => HTML 
//			System.out.println(doc.toString());
			/*
			 *   HTML => tag <> => Markup language
			 *   <a>값</a>
			 *   Element => tag
			 *   Elements => 같은 태그 여러개를 모아둔 것
			 */
			// 노래명  시작 위치 : <table class="list-wrap">
			// 구분자 -> 모든 태그 class(중복가능) / id(중복불가)
			// class => .   id => # (table#list-wrap)
			Elements title = doc.select("table.list-wrap td.info a.title");
//			System.out.println(title);
			// 가수명
			Elements singer = doc.select("table.list-wrap td.info a.artist");
//			System.out.println(singer);
			
			// 앨범
			Elements album = doc.select("table.list-wrap td.info a.albumtitle");
//			System.out.println(album);
			
			Elements etc = doc.select("table.list-wrap td.number span");
//			System.out.println(etc);
			
			for(int i =0 ; i < title.size() ; i++) {
				/*
				System.out.println("순위 : "+(i+1));
				System.out.println("노래명 : "+title.get(i).text());
				System.out.println("가수 : "+singer.get(i).text());
				System.out.println("앨범 : "+album.get(i).text());
				*/
				String s = etc.get(i).text();
				String state = "";
				String val ="";
				if(s.equals("유지")) {
					state = "유지";
					val = "0";
				}
				// 2상승
				else {
					state = s.replaceAll("[0-9]",""); //0-9 를 공백으로 바꿔라 -> 상승만 남음
					val = s.replaceAll("[가-힝]",""); // 한글을 숫자로 바꿔라 -> 숫자만 남음
					/*
					 *   split
					 *   replaceAll
					 *    -------------- 정규식 (한글형태, 숫자형태 , -> 패턴)
					 *    [0-9] => 숫자전체
					 *    [가-힣] => 한글전체
					 *    [A-Za-z]=> 알파벳 전체
					 */
				}
//				System.out.println("상태 : "+state);
//				System.out.println("등폭 : "+val);
//				System.out.println("------------------------");
						//text() 태그사이의 값을 가져온다.
				
				musics[i] = new Music();
				musics[i].setRank(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
				musics[i].setState(state);
				musics[i].setIdcrement(val);
			
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	    GenieMusicSystem g = new GenieMusicSystem();
	    Music [] aa = g.musicFind("사", 1);
	    for(Music a : aa) {
	    	System.out.println(a.getTitle());
	    	
	    }
	   
	}
	// 2. 기능 (어떤 기능) ==> 메소드
	public Music[] musicAllData() {
		return musics;
	}
	// 2-1. 목록 출력 => type 1-> title , 2-> singer 3-> album ....
	public Music[] musicFind(String fd,int type) {
		int i =0;
		for(Music m : musics) {
			boolean bCheck = false;
			if(type == 1) {
				bCheck = m.getTitle().contains(fd);
				if(bCheck==true) {
					i++;
				}
			}
			else {
				bCheck = m.getSinger().contains(fd);
				if(bCheck==true) {
					i++;
				}
			}
		}
		Music[] mm = new Music[i];
		i =0;
		/*
		 *  A a = new A();
		 *  A b = a; 주소값을 대입
		 */
		for(Music m : musics) {
			boolean bCheck = false;
			if(type == 1) {
				bCheck = m.getTitle().contains(fd);
				
			}
			else {
				bCheck = m.getSinger().contains(fd);
				
			}
			if(bCheck) {
//				mm[i] = new Music();
				mm[i] = m;
				i++;
			}
		}
		
		return mm;
	}
	/*
	 * 결과값을 전송 : 리턴형 -> 대부분 값을 전송한다. 클라이언트 웹브라우저에 전송
	 * 
	 * 자체 출력 : void  --> 서버에서 출력
	 * 
	 */
	// 2-2. 검색
	
}
