package com.sist.io2;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.*;
/*
 * 
 *          <table class="list-wrap">
   <caption>곡 리스트</caption>
   
   <tbody>
<tr class="list rank-1" songid="101268096">
    <td class="check"><input type="checkbox" class="select-check" title=" I AM ">
   </td><td class="number">1
       <span class="rank">
       <span class="rank-none">
       <span class="hide">유지</span></span></span>
   </td>
    <td><a href="#" class="cover" onclick="fnViewAlbumLayer(83665559); return false;" ontouchend="fnViewAlbumLayer(83665559); return false;"><span class="mask"></span><img onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/083/665/559/83665559_1681116738103_1_140x140.JPG/dims/resize/Q_80,0" alt="I AM"></a></td>
    <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo(101268096); return false;" ontouchend="fnViewSongInfo(101268096); return false;">곡 제목 정보 페이지</a></td>
      <td class="info">
           <a href="#" class="title ellipsis" title="I AM" onclick="fnPlaySong('101268096;','1'); return false;" ontouchend="fnPlaySong('101268096;','1'); return false;">
I AM</a>
            <a href="#" class="artist ellipsis" onclick="fnViewArtist(81271496); return false;" ontouchend="fnViewArtist(81271496); return false;">IVE (아이브)</a>           <div class="toggle-button-box" id="hide-button">
               <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('101268096'); artist_etc_layer._show(this);return false;" ontouchend="fnRelationArtistList('101268096'); artist_etc_layer._show(this);return false;">외</button>
               <dl class="list" id="RelationArtist_101268096">
               </dl>
           </div>
            <i class="bar">|</i>
            <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer(83665559); return false;" ontouchend="fnViewAlbumLayer(83665559); return false;">I've IVE</a>
        </td>
       <td class="btns"><a href="#" class="btn-basic btn-listen" title="재생" onclick="fnPlaySong('101268096;','1'); return false;" ontouchend="fnPlaySong('101268096;','1'); return false;">듣기</a></td>
       <td class="btns"><a href="#" class="btn-basic btn-add" title="추가" onclick="fnPlaySong('101268096;','3'); return false;" ontouchend="fnPlaySong('101268096;','3'); return false;">재생목록에 추가</a></td>
       <td class="btns"><button type="button" class="btn-basic btn-album " title="담기" songid=" 101268096 " id="add_my_album_101268096" onclick="fnAddMyAlbumForm('#add_my_album_101268096' , '101268096' ,0 , $(this).outerHeight()  );return false;" ontouchend="fnAddMyAlbumForm('#add_my_album_101268096' , '101268096',0,$(this).outerHeight());return false;">플레이리스트에 담기</button></td>
       <td class="btns"><a href="#" class="btn-basic btn-down" title="다운" onclick="fnDownSong('101268096');return false;" ontouchend="fnDownSong('101268096');return false;">다운로드</a></td>
<td class="btns">
       <div class="toggle-button-box lyr-mv" id="list-mv_101268096">
           <a href="#" class="btn btn-basic btn-mv" onclick="fnPlayMv('101268096','3'); return false;" ontouchend="fnPlayMv('101268096','3'); return false;" title="뮤비">뮤직비디오 보기</a>
       </div>
</td>
<td class="more">
   <div class="toggle-button-box">
       <button type="button" class="btn btn-basic btn-more">더보기</button>
       <ul class="list"> 
 */
public class DataCollectionManager {
	
	public static void main(String[] args) {
		List <GenieMusicVO> list = new ArrayList<GenieMusicVO>();
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("/Users/yuhyeonseung/Desktop/sist/java_datas/genie_music.txt");
			oos = new ObjectOutputStream(fos);
			// 사이트연결
			String urls[] = {
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0100",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0200",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0300",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0107",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0500",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0600"
					
			};
			int k = 1; // 고유번호
			for(int i = 0 ; i < urls.length;i++) {
				Document doc = Jsoup.connect(urls[i]).get();
				Elements title = doc.select("table.list-wrap td.info a.title");
				Elements singer = doc.select("table.list-wrap td.info a.artist");
				Elements album = doc.select("table.list-wrap td.info a.albumtitle");
				Elements poster = doc.select("table.list-wrap a.cover img");
				Elements etc = doc.select("table.list-wrap span.rank");
				/*
				 *  <a>값</a> -> text();
				 *  <img src="이미지 주소">  -> attr("src");
				 */
				for(int j = 0 ; j < title.size();j++) {
					System.out.println("고유번호 "+(k++));
					System.out.println("카테고리 번호 : "+(i+1));
					System.out.println(title.get(j).text());
					System.out.println(singer.get(j).text());
					System.out.println(album.get(j).text());
					System.out.println(poster.get(j).attr("src"));

					String ss = etc.get(j).text();
					String state = "";
					String id =""; // 등폭
					if(ss.contains("유지")) {
						state = "유지";
						id = "0";
					}
					else if(ss.contains("new")) {
						state = "NEW";
						id = "0";
					}
					// 4 상승
					else {
						state = ss.replaceAll("[0-9]","");
						id = ss.replaceAll("[가-힣]","");
					}
					System.out.println("상태 : "+state);
					System.out.println("등폭 : "+id);
					System.out.println("동영상 : "+youtubeKeyData(title.get(j).text()));
					System.out.println("=======================");
					GenieMusicVO vo = new GenieMusicVO();
					vo.setNo(k);
					vo.setCno(i+1);
					vo.setTitle(title.get(j).text());
					vo.setSinger(singer.get(j).text());
					vo.setAlbum(album.get(j).text());
					vo.setPoster(poster.get(j).attr("src"));
					vo.setState(state);
					vo.setIdcrement(Integer.parseInt(id));
					vo.setKey(youtubeKeyData(title.get(j).text()));
					list.add(vo);
				}
				oos.writeObject(list);
				System.out.println("저장완료");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	public static String youtubeKeyData(String title) {
		String key ="";
		try {
			String url = "https://www.youtube.com/results?search_query="+URLEncoder.encode(title,"UTF-8");
			Document doc = Jsoup.connect(url).get();
			String data = doc.toString();
			Pattern p = Pattern.compile("/watch\\?v=[^가-힝]+");
			Matcher m = p.matcher(data);
			while(m.find()) {
				String s = m.group();
				s = s.substring(s.indexOf("=")+1,s.indexOf("\""));
				// =6ZUIwj3FgUY\u0026pp=ygUESSBBTQ%3D%3D
				key =s;
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return key;
	}
}
