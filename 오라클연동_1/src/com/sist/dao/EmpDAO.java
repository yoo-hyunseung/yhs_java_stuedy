package com.sist.dao;
// 오라클 연결 => 인터페이스 구현
// 인터페이스 => 서로 다른 프로그램을 연결할때 사용(리모콘)
// 자바 <============> 오라클 ==> 라이브러리(인터페이스로 만들어져 있다)
/*
 *  1. 드라이버 등록 => 소프트웨어 => 메모리 할당
 *                   Class.forName("oracle.jdbc.driver.OracleDriver");
 *                   각 업체에서 제공 => ojdbc8.jar
 *   
 *       10g,11g,12c,18c,21c
 *           ---     ---
 *           ojdbc6  ojdbc8.jar
 *  2. 오라클 연결 => conn hr/happy
 *     Connection => getConnection(URL,username,password)
 *  
 *  3. SQL문장 전송 (송수신)
 *     Statement => executeQuery(SQL)
 *     => 결과 값을 받는 클래스 ResultSet
 *     => ResultSet에 있는 데이터를 => List, VO
 *  
 *  4. resultSet.close();
 *  5. Statement.close();
 *  6. connection.close();
 *  
 *  
 *  ==> 자바 프로그램
 *      1) 네트워크 프로그램 (애플리케이션)
 *      2) 데이터베이스 프로그램 (웹 애플리케이션) ********
 *      가장 쉬운 프로그램 : 데이터베이스 프로그램
 *  ==> 모든 개발자가 통일한 코딩 : SQL
 *  
 *  
 *      
 */
import java.sql.*; // 컴파일 예외 => 예외처리가 필요하다.
import java.util.*;
public class EmpDAO {
	// 오라클 연결 객체
	private Connection conn;
	
	// 오라클 통신(SQL전송 , 결과값을 받는다.)
	private PreparedStatement ps;
	//------------------------------
	// 오라클 주소
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	// 드라이버 이름
	private final String DRIVER="oracle.jdbc.driver.OracleDriver";
	
	// username
	private final String USERNAME="hr";
	
	// password
	private final String PASSWORD = "1235";
	//------------------------------ 파일에 저장(보안)
	
	// 드라이버는 한번만 수행 (생성자)
	public EmpDAO() {
		try {
			Class.forName(DRIVER);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	// 오라클 연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			// 호출시 = conn hr/happy
			//SQL> conn hr/happy
//			       연결되었습니다.
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//오라클 해체
	public void disConnection() {
		try {
			if(ps!=null)ps.close();
			if(conn != null)conn.close();
			// 호출시 exit
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	/////////////////////////////////////// 오라클 연결시 필수 조건
	///////////////////////////////////////	클래스화
	/*           ---- 1차    ------- 2차 
	 *   JDBC == DBCP == ORM(MyBatis, JPA)
	 *   ---- 연습용                    --- 3차
	 *   요구사항(지원자격)
	 *   ------------- 1. 언어 (자바)
	 *                 2. 데이터베이스(오라클, MySQL)
	 *                 3. Front (Vue, React)
	 *                 4. 우대사항 (클라우드) => AWS
	 *                 ----------------- Full Stack
	 *                 
	 */
	// 기능 : 사용자 요청시에 데이터베이스 SQL 문장을 만들어서 오라클 연동
	// 1. 사용자가 사원 전체 목록 요청
	public List<EmpVO> empListData(){
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			// 정상 수행하는 문장
			// 1. 오라클 연결 ==> XE는 50명 까지만 접근하는 테스트서버
			getConnection();
			
			// 2. 사용자가 요청한 SQL문장을 제작
			String sql = "SELECT empno,ename,job,hiredate,sal "
					+ "FROM emp "
					+ "order by 1";
			
			// 3. 오라클 전송
			ps = conn.prepareStatement(sql);
			
			// 4. 오라클에 명려을 내린다.(SQL문장 실행후 결과값을 가지고 온다.)
			ResultSet rs = ps.executeQuery();
			/*
			 * rs
			 *    1        2       3        4         5  오라클은 0번 부터 시작
			 * -------------------------------------------
			 *  empno    ename    job    hiredate    sal
			 * -------------------------------------------
			 *  ssss           s    .. .. . . . . . .  ==> 위치 (rs.next()) 한줄씩 
			 * -------------------------------------------
			 * 
			 * -------------------------------------------
			 * 
			 * -------------------------------------------
			 * 
			 * -------------------------------------------
			 *                                         ==> 위치 (rs.previous())
			 * -------------------------------------------
			 */
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt(1)); // Integer.parseInt(rs.getString(1))
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getNString(3));
				vo.setHiredate(rs.getDate(4));
				vo.setSal(rs.getInt(5));
				list.add(vo);
			}
			rs.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			disConnection(); // 오라클 닫기
		}
		return list;
	}
	// 2. 상세보기 요청
	public EmpVO empDetailData(int empno) {
		EmpVO vo = new EmpVO();
		try {
			// 1. 오라클 연결
			getConnection();
			
			// 2. SQL 문장 만들기
			String sql = "SELECT * "
					+ "FROM emp "
					+ "WHERE empno="+empno; //매개변수로 값을 받는다.
			
			// 3. 오라클 전송
			ps = conn.prepareStatement(sql);
			
			// 4. 결과값 받기
			ResultSet rs = ps.executeQuery();
			
			// 5. rs의 데이터를 vo에 담는다.
			rs.next(); // 데이터가 메모리에 출력된 첫번째 줄에 커서 이동 1행만 출력 while 돌릴필요 없다.
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getNString(2));
			vo.setJob(rs.getString(3));
			vo.setMgr(rs.getInt(4));
			vo.setHiredate(rs.getDate(5));
			vo.setSal(rs.getInt(6));
			vo.setComm(rs.getInt(7));
			vo.setDeptno(rs.getInt(8));
			rs.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(); // 오류확인
		}finally {
			disConnection();
		}
		return vo;
	}
	// 2-1 사번읽기 
	public List<Integer> empGetEmpno(){
		List<Integer>list =new ArrayList<Integer>();
		try {
			// 1. 연결
			getConnection();
			
			// SQL문장
			String sql = "SELECT DISTINCT empno "
					+ "FROM emp";
			// SQL 문장 전송
			ps = conn.prepareStatement(sql);
			
			// 결과값 받기
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				list.add(rs.getInt(1));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			disConnection();
		}
		return list;
	}
	// 3. 검색
	public List<EmpVO> empFindData(String ename) {
		List <EmpVO> list = new ArrayList<EmpVO>();
		try {
			// connection
			getConnection();
			String sql = "SELECT * FROM emp WHERE ename LIKE '%"+ename+"%'";
			// sql 
//			String sql1 = "SELECT * FROM emp WHERE ename LIKE '%'||?||'%'";
			// sql 보내기
			ps = conn.prepareStatement(sql);
//			ps.setString(1, ename);
			// 데이터 받기
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getNString(2));
				vo.setJob(rs.getString(3));
				vo.setMgr(rs.getInt(4));
				vo.setHiredate(rs.getDate(5));
				vo.setSal(rs.getInt(6));
				vo.setComm(rs.getInt(7));
				vo.setDeptno(rs.getInt(8));
				list.add(vo);
			}
			rs.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return list;
	}
}














