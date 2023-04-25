package com.sist.string;
// concat : 문자를 결합
// String s1 = "Hello ";
// String s2 = "Java";
// s1.concat(s2) ==> "Hello Java"
/*
 *   ===> concat ===> MySQL LIKE 문장을 만들 때
 *        WHERE name LIKE CONCAT('%', '홍', '%')
 *   (오라클)     WHERE name LIKE '%'||'홍'||'%'
 *   
 *   
 *   endsWith() : 끝나는 문자열이 같은 경우에 사용
 *  boolean endsWith(String str)
 *  String concat(String s)
 *       
 *      equalsIgnoreCase() : 대소문자 구분 없이
 *      ------------------- 
 *      equals -> 대소문자 구분 ->아이디 비밀번호 equalsIgnoreCase() : 대소문자 구분 없이
 *       
 *      indexOf(); -> 앞에서 부터 위치 확인 
 *      lastIndexOf() -> 뒤에서 부터 위치 확인 
 *      
 *      startsWith() -> 시작문자열이 같은 경우 -> 서제스트 
 *      substring() -> 원하는 문자열자를때
 *      trim()-> 공백제거
 *      split() -> 특정 문자기준으로 분리하는 경우
 *      contains() -> 포함여부
 *      valueOf() -> 모든 데이터형을 문자열로 변환
 *      
 * 
 */
public class 라이브러리_String_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s1 = "Hello ";
		String s2 = "Java!!";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		
		if(s2.endsWith("!!")) {
			System.out.println("!!자로 끝난다.");	
		}
		else {
			System.out.println("!!자로 안끝난다.");	
		}*/
		
		// equals -> 대소문자 구분 ->아이디 비밀번호 equalsIgnoreCase() : 대소문자 구분 없이
		String [] data = {"JAVA","java","Java","JAva","JAVa","jaVA","javA"};
		for(String s : data) {
			if(s.equals("java")) {
				System.out.print(s+" ");
			}
		}
		// equals 는 대소문자를 구분해서 비교
				// 원형 : boolean equals(String s)
				// 라이브러리 - > 1) 기능, 2) 리턴형, 3) 매개변수, 4) 사용처
		System.out.println("\n=======equalsIgnoreCase()========");
		for(String s : data) {
			if(s.equalsIgnoreCase("java")) {
				System.out.print(s+" ");
			}
		}
		// equals 는 대소문자 구분 하지 않는다.
		// 원형 boolean equalsIgnoreCase(String s)
		// 사용처 : 검색, 영문이름, 영문으로 된 데이터를 찾는 경우
		// 한글 : equals 를 사용
		// 한글 -> 자음으로 찾기 => 사용자 정의 (자바, 오라클)
		System.out.println("============ length() ============");
		String[] data2 = {"apple",
				  "avocado" ,
				  "banana",
				  "blackberry",
				  "blueberry",
				  "cherry tomato",
				  "cherry", 
				  "coconut", 
				  "grape",
				  "kiwi", 
				  "lemon",
				  "lime", 
				  "mango", 
				 "melon", 
				  "orange", 
				  "papaya",
				  "peach",
				  "pear",
				  "persimmon",
				  "pineapple",
				  "plum",
				  "strawberry",
				  "tangerine",
				  "tomato",
				 "watermelon"};
		//각 과일명의 문자길이를 출력
		for(String s : data2) {
			System.out.println(s+":"+s.length());
		}
		System.out.println("======================");
		System.out.println("가장 긴 이름의 과명을 출력하시오.");
		int max = 0;
		int index =0;
		for(int i =0 ;i < data2.length;i++) {
			if(max < data2[i].length()) {
				max = data2[i].length();
				index = i;
			}
			
		}
		System.out.println(data2[index]);
		
		// length() : 문자갯수
		// 원형 : int length()
		// 사용처 => 문자 제한이 있는 경우, 비밀번호
		// 오라클 => VARCHAR2(10)
		
		System.out.println("======== startsWith() ==========");
		// 원형 : boolean startsWith(String s)
		// 사용처 : 자동 완성 (검색기) , 쿠키 검
		for(String s : data2) {
			if(s.startsWith("w")) {
				System.out.println(s);
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
				
			}
		}
		System.out.println("======== trim() ========");
		// trim() : 좌우의 공백을 제거
		// 원형 : String trim()
		// 사용처 : 로그인, 회원가입, 검색 ...
		// 사용자가 입력시에 => space
		// String id = "admin" => " admin"
		String id = "admin";
		if(id.equals(" admin")) {
			System.out.println("같은 아이디입니다.");
		}
		else {
			System.out.println("다른 아이디입니다.");
		}
		System.out.println("========= contains() =========");
		for(String s : data2) {
			if(s.contains("a")) {
				System.out.println(s);
			}
		}
		// contains는 포함 문자열을 찾을 경우
		// 원형 : boolean contains(String s)
		// 사용처 : 검색, 추천
		// 추천 => 네이버 블로그, 카페 => 포함된 영화명 ...
		System.out.println("======== valueOf() =======");
		// valueOf : String 에서 유일한 static메소드
		// 모든 데이터형을 문자열로 변환
		// 원형 : static String valueOf((type)) => 오버로딩된 상태
		// 사용처 : 자바에서 윈도우 전송, 네트워크 전송, 웹(String만 인식)
		System.out.println(String.valueOf(10)+String.valueOf(30));
		// "10" + "30"
		
		System.out.println("=========== substring() ==========");
		// substring()자른다. , indexOf()찾아서, lastIndexOf()
		String ss = "http://localhost:8080/JSPProject/main/main.do";
		String res = ss.substring(ss.lastIndexOf("/")+1);
		System.out.println(res);
		ss = ss.substring(ss.indexOf("//")+2);// localhost:8080/JSPProject/main/main.do
		System.out.println("ss = "+ss);
		ss = ss.substring(0,ss.indexOf("/"));// localhost:8080
		System.out.println("ss = "+ss);
//		res = ss.substring(ss.indexOf("//")+1,ss.lastIndexOf("/"));
		System.out.println(res);
		ss = "서울특별시 용산구 소월로2길 27 지번 서울시 용산구 후암동 445-8";
		res = ss.substring(0,ss.indexOf("지"));
		System.out.println(res.trim());
//		res = ss.substring(ss.lastIndexOf("서울"));
		res = ss.substring(ss.indexOf("지")+2);
		System.out.println(res.trim());
		// substring() : 문자열을 자를때
		// 오버로딩
		// substring(int s) 시작부터 맨 마지막 까지 => s 번째 부터 마지막 까지 cut
		// substring(int s, int e) -> s부터 e-1 까지 cut
		// 원형 String substring(int s)
		// 원형 String substring(int s, int e)
		// 사용처 : URL 주소제어, 주소제어 , 문자열이 긴 경우 뒤 생략(...) -> css가 깨짐
		ss = "홍길동,이순신,강감찬,박문수,을지문덕,심청이,춘향이";
		String[] names = ss.split(",");
		// 특수문자열로 잘라서 배열에 저장 ...
		// 원형 : String[] split(String regexp)
		// 구분이 되어 있는 문자열이 있는 경우 분리 ....
		// 
		for(String name : names) {
			System.out.println(name);
		}
		ss ="히로시마 스타일"
				+ " 16,000원"
				+ "오사카 스타일"
				+ " 16,000원"
				+ "모단야키"
				+ " 17,000원"
				+ "돈페이야키"
				+ " 16,000원"
				+ "야키소바"
				+ " 16,000원";
		String [] menus = ss.split("원");
		for(String menu : menus) {
			System.out.println(menu+"원");
		}
		
		ss ="red?blue?green?black?white?yello";
		String [] colors = ss.split("\\?"); // | 는 정규식에서 사용하는 기호
		// |, ?, ., +, *, ^ ...  기호로 사용하려면 \\를 붙여야한다.
		for(String color : colors) {
			System.out.println(color);
		}
		System.out.println("=========== replace() ==========");
		// replace() : 문자/문자열을 변경할 때 사용
		// 원형 : String replace(char old, char new)
		// 오버로딩 String replace(String old, String new)
		ss = "https://mp-seoul-image-production-s3.mangoplate.com/756210_1667892732041968.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";
		// 오라클에 저장 ==> & (Scanner) 
		res = ss.replace("&","#");
		System.out.println(res);
		System.out.println(res.replace("#", "&"));
		// 데이터 수집 => html를 제거 ...
		
		
	}

}
