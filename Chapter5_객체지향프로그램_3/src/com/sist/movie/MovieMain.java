package com.sist.movie;
import java.util.Scanner;
public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieSystem ms = new MovieSystem();
		Scanner scan = new Scanner(System.in);
		while(true) {
			int menu = ms.menu();
			if(menu == 9) {
				System.out.println("프로그램 종료");
				break;
			}
			if(menu ==1 || menu == 2 || menu ==3) {
				Movie[] movie = ms.movieListData(menu);
				int i = 1;
				for(Movie m : movie) {
					System.out.println(i+". "+m.title);
					i++;
				}
			}
			if(menu ==4) {
				System.out.print("input number : ");
				int n = scan.nextInt();
				Movie movie = ms.movieDetailData(n);
				System.out.println("title : "+movie.title);
				System.out.println("director : "+movie.director);
				System.out.println("time : "+movie.time);
				System.out.println("genre : "+movie.genre);
				String story = movie.story;
				story =story.replace("&lt;", "<");
				story =story.replace("&gt;", ">");
				System.out.println("story : "+story);
			}
			
			
		}
	}

}
