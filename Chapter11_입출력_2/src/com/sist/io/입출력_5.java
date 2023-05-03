package com.sist.io;
import java.io.*;
import java.net.*;
/*
		         URLConnection -> url.connection()
		               |
		   --------------------------
		   |                        |
		 HttpURLConnection       HttpsURLConnection
		 
		 
		 class A
		 class B extends A
		 B b = new A(); -> error
		 B b = (B)a  형변환 시켜야함 상위클래스가 리턴되기 때문에 형변환 해줘야함
 */
public class 입출력_5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		URL url = new URL("https://www.10000recipe.com/recipe/list.html");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		if(conn != null) { 
			// 브라우저는 -> 1byte씩 전송
			// 1byte -> 2byte로 변환 ->conn.getInputStream
			// InputStreamReader
			
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			while(true) {
				String data = in.readLine();
				if(data == null) {
					break;
				}
				System.out.println(data);
			}
			in.close();
			conn.disconnect();
		}
		
	}

}
