//while 주로 사용되는 곳
import java.io.*;
public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 0;
			FileReader fr = new FileReader("/Users/yuhyeonseung/Desktop/sist/javaDev/javaStudy/Chapter3_제어문_반복분_2/src/반복문_3.java");
			while((i = fr.read())!=-1){// -1 파일종료
				System.out.print((char)i);
				// 네트워크로 파일 전송이 가능
			}
		}catch(Exception ex) {}
	}

}
