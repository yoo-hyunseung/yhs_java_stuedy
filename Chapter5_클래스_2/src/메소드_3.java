// char를 한개 보내서 => 대문자 => 소문자 => boolean
import java.util.Scanner;
public class 메소드_3 {
	static String isAlpha(char c) {
		String result = "";
		if(c >='A' && c<='Z') {
			result ="대문자";
		}
		else if(c >='a' && c<='z') {
			result = "소문자";
		}
		else {
			result = "알파벳이 아닙니다.";
		}
		return result;
	}
	static void process() {
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳 입력 : ");
		String s= scan.next();
		char c = s.charAt(0); // 문자 한개를 읽어와서 char 로 변경
		/*
		 *  String s = "Hello";
		 *              01234 -> index 번호
		 *              => charAt(2); ==> l
		 */
		String result = isAlpha(c);
		System.out.println(c+"는 "+result);
		// 가급적이면 결과값이 여러개인 경우 => 문자열로 처리
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
