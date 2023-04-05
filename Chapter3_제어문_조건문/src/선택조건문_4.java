import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

//BBdC1rl5sKY
public class 선택조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
//			System.out.print("검색어입력: ");
//			String fd = scan.next();
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title =doc.select("tr.list a.title");
			Elements singer = doc.select("tr.list a.artist");
//			for(int i =0 ; i < title.size() ; i++) {
//				String s = title.get(i).text();
//				if(s.contains(fd)) {
//					System.out.println(title.get(i).text()+ " "+singer.get(i).text());
//				}
//			}
//			runtime.exec("open" + " /Applications/Google Chrome.app"+"https://youtube.com/embed/BBdC1rl5sKY");
			Runtime.getRuntime().exec("open /Applications/Google Chrome.app/"+" https://youtube.com/embed/BBdC1rl5sKY");//맥 터미널 명령어를 알아야 함
//			Runtime.getRuntime().exec("open -a \"Google Chrome.app\"");
			
		}catch(Exception ex) {
		}
	}

}
