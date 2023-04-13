package com.sist.main;
import java.util.Scanner;
public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		MusicSystem ms = new MusicSystem();
		ms.init();
		while(true) {
			int menu = ms.menu();
			if(menu == 9) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu == 1) {
				Music[] mm = ms.musicListData();
				for(int i =0 ; i < mm.length ; i++) {
					System.out.println(i+1+". "+mm[i].title);
				}
				System.out.println("================================");
			}
			else if(menu == 2) {
				System.out.print("제목을 입력 :");
				String s = scan.next();
				Music[] mm = ms.musicFindData(s);
				for(int i =0 ; i < mm.length ; i++) {
					System.out.println(i+1+". "+mm[i].title);
				}
				System.out.println("================================");
			}
			else if(menu == 3) {
				System.out.println("input number : ");
				int no = scan.nextInt();
				Music mm = ms.detailData(no);
				System.out.println("title : "+mm.title);
				System.out.println("singer : "+mm.singer);
				System.out.println("album : "+mm.album);
				System.out.println("state : "+mm.state);
				System.out.println("modify : "+mm.modify);
				String ss = mm.state;
				if(ss.equals("유지")){
					ss ="-";
				}
				else if(ss.equals("하강")) {
					ss="↓"+mm.modify;
				}
				else {
					ss="↑"+mm.modify;
				}
				System.out.println("등폭 : "+ss);
				
			}
			

				
		}
	}

}
