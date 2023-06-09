import java.util.Arrays;
import java.util.Scanner;

/*
 *    클래스 구성요소
 *    ----------------
 *    변수 : 프로그램 종료시 까지 유지하는 변수 (전역변수, 멤버변수)
 *          메소드안에서 사용되는 변수(지역변수)
 *          기본형 / 참조형
 *          ----
 *          정수 : int , long
 *          실수 : double
 *          논리형 : boolean
 *          참조형 : => 데이터가 여러개(메모리 주소를 이용해서 연결)
 *                     배열 1차원 ---- 같은 크기의 데이터형
 *                     클래스 -- 다른 크기의 데이터형(*******)
 *    ----------------
 *    생성자 : 변수에 초기화 , 클래스를 메모리에 저장시에 사용
 *    ----------------
 *    메소드 : 기능을 수행 , 다른 클래스와 연결(메세지)
 *           --------- 연산자 / 제어문 (명령문)
 *                      명령문의 집합
 *                      => 1. 다른 클래스와 통신
 *                      => 2. 재사용 목적
 *                            ----
 *                             기능을 최소화(한개의 기능만 수행)
 *                             예)
 *                                회원
 *                                = 회원가입
 *                                = 회원수정
 *                                = 회원탈퇴
 *                                = 로그인
 *                                = 로그아웃
 *                                = 아이디 찾기
 *                                = 비밀번호 찾기
 *                                ==> 객체지향(수정, 추가)
 *                                ==> 우편번호검색, 아이디 중복
 *                                
 *                                게시판
 *                                = 글쓰기
 *                                = 목록
 *                                = 상세보기
 *                                = 수정
 *                                = 삭제
 *                                = 검색
 *                                --------- 묻고 답하기
 *                                = 답변하기 
 *                                --------- 댓글
 *                                = 댓글
 *                                --------- 갤러리 게시판
 *                                --------- 후기 게시판
 *                                
 *    -------------------------------------------------
 *    메소드 형식
 */
public class 메소드_1 {
	// 사용자가 원하는 갯수만큼 난수 발생(1~100)
	// 사용자 => 갯수 (매개변수)
	// 리턴값 => 배
	static int[] rand(int count) {
		int [] arr = new int[count];
		for(int i =0 ; i < count ; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("난수 갯수 입력 :");
		int count = scan.nextInt();
		int [] arr = rand(count);
		// 다른 메소드 호출 (메소드명(매개변수값)) => 자신의 클래스
		// 다른 클래스에서 호출 클래스명.메소드명(매개변수값)
//		                  -----------------------
		System.out.println(Arrays.toString(arr));
	}

}
