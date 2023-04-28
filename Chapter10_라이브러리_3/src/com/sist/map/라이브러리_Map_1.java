package com.sist.map;
import java.util.*;
/*
 *     Map => 인터페이스
 *      |
 *   ------------
 *   |          |
 * Hashtable    HashMap(*******) 
 * 특징)
 *      => 두개를 동시에 저장(key, value)
 *         (단 key는 중복할 수 없다.)
 *         ("id","hong")
 *         ("id","shim") ==> X key가 중복
 *         ------------- id 값을 가지고 온다 shim -- 덮어쓰기됨
 *         ("id1","hong")
 *         ("id2","shim") ==> 0
 *      => 사용처 : 웹에서 제공하는 모든 클래스는 (Map형식)
 *         HTTPServletRequest
 *             request.setAttribute("key","value");
 *         HTTPServletResponse
 *         HTTPSession
 *         Cookies
 *      => 스프링, Mybatis => Map형식
 *         ----  ------- SQL ("all" , "SELECT * FROM emp")
 *         클래스 등록    
 *         ("a",new A())
 *         
 *      => 저장 / 읽기
 *         저장 : put("key" , "값")
 *         읽기 : get(key)
 *         ---------------------------- JSON , Properties
 *         => 데이터는 구분자를 필요로한다.
 *                   ------
 *                   ArrayList -> index
 *                   Set       -> 중복없이
 *                   Map       -> Key
 *                   오라클     -> Primary Key
 *                 ------------------------------
 *                    영화    : 영화번호
 *                    뮤직    : 뮤직번호
 *                    맛집    : 맛집번호
 *                    게시판   : 게시판 번호
 *                    회원관리  : ID
 *                 ------------------------------  정형화된 데이터
 *                 비정형화 => 빅데이터 => 정형화 
 *                                    ----- 통계 / 확률 -> 딥러닝
 *                    
 *                    
 *                    
 *                    
 *         
 *         
 */   
public class 라이브러리_Map_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		// 데이터 저장
		map.put("id", "admin");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남성");
		map.put("age", "25");
		map.put("password", "4567"); // key 가 출력되면 덮어쓴다.
		// 데이터 출력
		/*System.out.println("id : "+map.get("id"));
		System.out.println("password : "+map.get("password"));
		System.out.println("name : "+map.get("name"));
		System.out.println("sex : "+map.get("sex"));
		System.out.println("age : "+map.get("age"));*/
		Set set = map.keySet(); // key 전체를 모아서 관리
//		System.out.println(set);
		for(Object obj : set) {
			String key = (String)obj;
			System.out.println(key+" : "+map.get(key));
		}
		/*
		 *    주요 메소드
		 *     clear() : 전체 삭제
		 *     get() : 실제 데이터 값 읽을 때
		 *     put() : 데이터를 추가
		 *     isEmpty() : 데이터 유무를 확인
		 *     size() : 저장된 갯수확인
		 *     values() : 실제 저장된 값 전체
		 *     
		 * 
		 */
		
		for(Object o : map.values()) {
			System.out.println(o);
		}
	}

}
