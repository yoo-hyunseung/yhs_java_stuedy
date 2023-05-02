package com.sist.lib;
/*
 * 	   8장 => 예외처리
 *           => 목적 : 사전에 에러를 방지하는 프로그램을 제작
 *                    비정상 종료를 방지하고 정상상태 유지
 *           => 예외처리의 방법
 *              ------ 수정이 가능한 에러
 *               1) 상속도 -> 예외처리 방법에 순서 존재
 *                       Object
 *                         |
 *                      Throwable (Spring AOP)
 *                         |
 *                -------------------
 *                |                 |
 *              Error            Exception(예외처리의 최상위 클래스)
 *                                  |
 *                  CheckedException                    UnCheckedException
 *                  컴파일시에 예외처리여부 확인                예외처리 부분을 미확인  
 *                  => 예외처리를 반드시한다.                  => 필요시에만 작업
 *                                                        => 자주 오류나는 부분은 예외하는 것이 좋다.
 *                                                        => NumberFormatException
 *                                                           (사용자입력)
 *                                                       *** 에러 : 사용자 입력 / 프로그램 상수
 *                                                     => NullPointerException;
                          ----------------------------------------------
 *                        |                                            |
 *                    IOException : file명 /디렉토리                   실행시 에러(인터프리터)
 *                    ClassNotFoundException                         RuntimeException
 *                      => Class.forName("패키지명.클래스명");                 |
 *                      => 웹(MVC)                                     NullPointException
 *                    InterruptedException(쓰레드)                         String s;
 *                    MalforedURLException( ip. web , 네트워크)             s.replace();
 *                    SQLException(문법 -> 오라클)                       NumberFormatException
 *                                                                     Integer.parseInt(" 10");
 *                                                                     web
 *                                                                     --- 
 *                                                                     데이터 전송
 *                                                                     웹 주소?no=10띄어쓰기 중요
 *                                                                     ArrayIndexOutOfBoundException
 *                                                                     ClassCastException
 *           2) 예외처리의 종류
 *              ***= 예외복구 (프로그래머가 주로 사용)
 *              try{
 *                  정상적으로 수행하는 소스 코딩 
 *                  => 지금까지 코딩한 모든 내용
 *                  => 에러 발생시 catch로 이동
 *                  ----------------------- > 에러 밑에는 문장은 실행하지 않는다.
 *              }
 *              catch(예외처리 클래스){
 *                   try 수행시 에러가 발생할때 처리되는 문장
 *                   여러개를 사용할 수 있다.
 *                   => 순서가 존재 상속도
 *                   => 상속을 내리는 클래스가 처리한느 예외가 많다.
 *              }
 *              finally{
 *                   생략이 가능 
 *                   try, catch 상관없이 무조건 수행
 *                   => file 닫기
 *                   => 오라클 서버연결 해제
 *                   => 서버 연결 헤제
 *              }
 *              ***= 예외회피 : 예외 떠넘기기 ( 라이브러리 )
 *              => 사용법
 *                 메소드 선언 뒤에 예상되는 에러를 선언
 *                 => 메소드 호출시에 처리할 수 있게 만든다.
 *                    ====> 사용하는 프로그래머가 처리해서 시용
 *                    ====> 1) 선언
 *                          2) try ~ catch
 *                       예) public void method() throws 예외처리 클래스, , ...
 *                                                       ------------------ 순서가 없다.
 *                                                       메소드 호출시에 예상되는 에러 체크
 *                           === 메소드 호출
 *                           public void display() throws 예외처리클래스{
 *                             method();
 *                           }
 *                           public void display(){
 *                              try{}catch(){}
 *                           }
 *                           선언된 예외클래스가 많은경우  
 *                             => 1) 전체를 사용 catch를 여러개 사용
 *                             => 2) 전체를 포함 클래스로 통합
 *                                ------------------- > Exception / Throwable
 *                             예)
 *                               public vodi method() throws IOException, InterruptedException, SQLException{
 *                                
 *                               }
 *                               
 *                               호출 -> 3개를 다써야함 or 전체를 포함하는 클래스를 가져온다.
 *                               public void display(){
 *                                try{
 *                                
 *                                }catch(IOException){
 *                                
 *                                }
 *                                catch(InterruptedException){
 *                                
 *                                }
 *                                catch(SQLException){
 *                                
 *                                }
 *                               }
 *                          
 *              = 예외 임의 발생 : throw ( 테스트용으로 사용) => 배포                                                      
 *              = 사용자 정의 예외처리 : 거의 사용빈도가 없다.
 *                class MyException extends Exception;
 *                =>if 문
 *                
 *             프로그램상에서 제어가 안되는 경우가 많다.
 *               => 다른 프로그램과 연동
 *               => 브라우저 , 오라클 , 파일 읽기, 쓰기 
 *               => 프로그램 내부에 다른 프로그램을 동시에 동작
 *               => 자료구조(메모리관리);
 *               ----------------> 직접 만들어서 제공 (라이브러리)
 *               ----------------> 사용자 정의 클래스 + 라이르러리 => 조립
 *               
 *                                                                     
 *     9장/10장 -> 라이브러리        
 *     ------------------
 *     java.lang : 자바 프로그램의 기본 라이브러리 (가장 많이 사용)
 *                 => import 를 생략
 *        라이브러리 => 변수는 없다 / 메소드
 *        => Object
 *            ***=> Object clone() : 복제(prototype : Spring)
 *               새로운 메모리를 생성
 *            => equals() : 객체 비교(오버라이딩을 하기 전까지는 메모리 주소를 비교)
 *            ***=> toString() : 객체를 문자열화 (디폴트는 메모리 주소를 리턴)
 *            => finalize() : 소멸자(객체 메모리 해체 => 자동 호출)
 *        => String
 *            *** boolean startsWith();  시작 문자열 일치여부
 *              -> 검색기(Search Bar)
 *            boolean endsWith() : 마지막 문자열 일치여부
 *            boolean equals() :  문자열 일치여부 -> 로그인 처리, 아이디 중복여부...
 *            *** String은 char 배열이다 -> 인덱스 번호를 가지고 있다.
 *             -> int indexOf(String s), int indexOf(char c)
 *            *** int lastInexOf(String s), int lastIndexOf(char c)
 *            *** 문자의 갯수를 반환 int length() 
 *            정규식 -> 통계 분석 -> 추천시스템 , 문자 형식(패턴)을 만들어서 변경
 *            -> String replaceAll(String regex , String s);
 *            => 머신러닝, 딥러닝
 *            String나누기 -> String[] split(String regex)
 *            -> 패턴
 *            [가-힣] 한글 전체
 *            [A-Za-z] 영문 전체
 *            [0-9] 숫자 전체
 *            ==> 파일 입출력 (네트워크 프로젝트)
 *            ---------------- 크롤링
 *            String replace(String s , String s1)
 *            ------------------------------------
 *            String replace(char c1, char c2)
 *            *** 지정된 범위 문자열 반환 String substring(int s, int e); 마지막 인덱스는 포함하지 않는다.e-1 까지
 *            
 *            String toLowerCase() -> 오라클 (LOWER())
 *            String toUpperCase() -> 오라클 (UPPER())
 *            ***오라클은 대소문자를 구분하지 않는다.
 *              (실제 저장된 값은 대소문자를 구분한다.)
 *              
 *            String toString(); 문자열
 *            
 *            *** String valueOf(모든 데이터형);
 *                static 
 *            
 *            String trim(); 공백제거 좌우
 *            
 *            *** boolean contains(String s) : 검색시 사용
 *            
 *            char charAt(int index) 문자 반환
 *            
 *            String concat(String s1, String s2) , + ;
 *            
 *            format("%d %d....") 서식화된 메소드로 변경
 *             static 
 *            
 *        => StringBuffer : 문자열 결합 -> append();
 *        => Wrapper : 
 *           ---------
 *           기본데이터형을 사용하기 쉽게 기능을 부여 -> 클래스
 *           int -> Integer
 *           double -> Double
 *           long -> Long
 *           boolean -> Boolean
 *           ... -> 문자열을 해당 데이터형으로 변경할 때 주로 사용
 *               -> "10" -> 10;
 *               Integer.parseInt("10")
 *               Double.parseDouble("10.2");
 *               Boolean.parseBoolean("true");
 *               Long.parseLong("10L")
 *               => 제네릭 사용시
 *                  컬렉션 정수 저장
 *                  List<Integer> = new ArrayList<>();
 *                  -------------
 *                  List<Double> 제네릭 -> 항상 클래스형으로만 등록이 가능
 *               => 호환
 *                  Integer i = 10 => 오토박싱, 박싱
 *                  int i = new Integer(10) => 언박싱
 *                  
 *        => System :  gc()
 *        => Math : ceil(), round(), random()
 *     java.util
 *     ---------
 *        => 프로그램에서 많이 사용되는 유용한 클래스와 집합
 *        => 날짜 : Date, Calendar
 *                 Date -> 기능이 없다. -> 단지 날짜를 저장할 목적
 *                 Calendar는 Date에 없는 기능을 보완 -> 달력
 *                  => 날짜 설정
 *                     set(Calendar.YEAR,2023)...
 *                         -------- MONTH, DATE
 *                  => 설정된 날짜 읽기
 *                     get(Calendar.YEAR), MONTH , DATE
 *                  => 요일 읽기
 *                     get(Calendar.DAY_OF_WEEK)
 *                  => 월(month) -> 0부터 시작해야한다.
 *                     등록시에 month-1
 *                  => 요일 (week) -> 1부터 시작한다.
 *                     => 사용시에는 week-1
 *                     
 *        => 문자열 분해 
 *           StringTokenizer
 *            -> counterTokens() : 분해된 문자열의 갯수
 *            -> hasMoreTokens() : 데이터가 존재할때 까지 -> true
 *               while()을 주로 사용
 *            -> nextToken() : 실제 분해된 데이터 읽을 경우에 주로 사용
 *            -> 오라클 연동 / 네트워크 값을 전송
 *        => 자료구조 : 메모리에서 데이터를 쉽게 관리할 수 있게 만든 플랫
 *           ------ 컬렉션(데이터를 모아서 관리) -> 가변형 (크기를 결정하지 않음)
 *           ------ 관리 프로그램을 제작(사람, 영화 ...)
 *           ------ 표준화(모든 프로그래머가 동일하게 사용)
 *                  ---- 인터페이스 
 *                        Collection
 *                            |
 *                 -----------------------
 *                 |                     |
 *               List                   Set            Map -> 인터페이스 
 *                 |                     |              |
 *     -----------------------        ***HashSet        *** HashMap    -> 구현된 클래스
 *     |          |          |        TreeSet            Hashtable
 *  ***ArrayList Vector  LinkedList
 *           
 *           
 *           List : 순서가 존재 (인덱스 번호 0부터 시작) 중복 데이터 적용
 *                  오라클(데이터베이스) 연동시 주로 사용되는 클래스
 *                       --------- 메모리, 파일, RDBMS(관게형데이터베이스)
 *                           |           ------------ 영구적인 저장 장치
 *                          변수, 배열, 클래스 -> 메모리 -> 파일 -> 오라클 서버
 *                                                           구문(제약조건) key
 *           => ArrayList
 *           => 많이 사용: WEB => 데이터를 모아서 전송 할때(목록)
 *           => 주로 사용 기능(메소드)
 *              ***1) 데이터 추가 : add()
 *              2) 데이터 수정 : set();
 *              ***3) 저장된 데이터 읽기 : get();
 *              ***4) 저장 갯수 : size()
 *              ***5) 전체 삭제 : clear()
 *              6) 데이터 존재여부 : isEmpty();
 *              
 *           
 *           Set : 순서가 없다. 데이터 중복을 허용하지 않는다.
 *                 => List에서 중복된 데이터를 추출                                                
 *           => HashSet
 *           => 많이 사용: 네트워크에서 서버에 접속하는 클라이언트의 ip, port
 *           => WEB 채팅
 *           => 주로 사용 기능(메소드)
 *              ***1) 데이터 추가 : add()
 *              ***3) 저장된 데이터 읽기 : get();
 *              ***4) 저장 갯수 : size()
 *              ***5) 전체 삭제 : clear()
 *           
 *           Map : 순서가 없다. Key-Value값 두개를 동시에 저장
 *           => HashMap     
 *           => 많이 사용: WEB에서 지원하는 클래스 -> WEB
 *                       클래스를 여러개 모아서 관리(Spring, MyBatis)         
 *           => 주로 사용 기능(메소드)
 *              1) put() : 저장시에 사용
 *              2) get(key) : 저장된 데이터 읽기
 *       1) 기본 생성자를 사용하게 되면 모든 데이터형은 Object
 *          List list = new ArrayList();
 *          => 저장
 *             add(Object)
 *             Object get(int index)
 *          Map map = new HashMap();
 *             put(String s, Object o)
 *             Object get(key)
 *          Set set = new HashSet();    
 *             add(Object)
 *             Object get(int index)
 *             -> 관리하기 어렵다.
 *             -> Object가 추가 되면 모든 데이터형을 첨부
 *                => 데이터형이 섞여 있으면 관리가 어렵다. => for문 수행이 어렵다.
 *                => 같은 데이터형을 첨부하는 것이 편리하다.
 *                => Object리턴이면 반드시 형변환이 필요하다
 *                => 메소드에서 사용되는 모든 매개변수, 리턴형을 통일화(제네릭)
 *                => 형변환 할 필요가 없기 때문에 소스가 간결하다.
 *                => 표준화 시킬수 있다.
 *                => 클래스뒤에 <데이터형: 반드시 클래스형>
 *                예)
 *                    문자열
 *                    List<String> -> add(String s), String get(index)
 *                    정수
 *                    List<Integer> -> add(Integer i) , Integer get(index)
 *                                         --------     ------  int 가능 -> 오토박싱 
 *                    
 * -------------------------------- 
 *           
 *           
 *     java.text
 *         날짜 변경(출력 형식) : SimpleDateFormat()
 *           <fmt:formatDate>
 *           <fmt:formatNumber>
 *             년도 : yyyy
 *             월 : MM , M
 *             일 : dd , d
 *             시간 : hh , h
 *             분 : m, mm
 *             초 : ss, s
 *             ==> yyyy/MM/dd , yyyy-MM-dd
 *         
 *         숫자 : DecimalFormat ==> ##,###,###
 *         -----> 오라클 (TO_CHAR)
 *     java.io
 *     java.net
 *     java.sql
 */
public class 정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		try {
//			for(int i =1 ; i <= 3 ; i++) {
//				if(i == 2) {
//					System.out.println(i/0);
//				}
//				System.out.println("i = "+i);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("예외 발생");
//		}
		// 크롤링시에는 반드시 for문내부에 try문 위치
//		for(int i =1 ; i <=3 ; i++) {
//			try {
//				if(i == 2) {
//					System.out.println(i/0);
//				}
//				System.out.println("i = "+i);
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("예외발생");
//			}
//		}
		

	}

}
