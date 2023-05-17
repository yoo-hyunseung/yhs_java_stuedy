package com.sist.dao;
import java.sql.*;
import java.util.*;
import java.io.*;
public class EmpDAO {
	// 1. 오라클연결
	private Connection conn;
	
	private PreparedStatement ps;
	
	private String driver, url, username, password;
	
	// 생성자로 드라이버를 등록한다.
	public EmpDAO() {
		try {
			FileReader fr = new FileReader("/Users/yuhyeonseung/Desktop/sist/javaDev/javaStudy/OrcleJoinProject/src/db.properties");
			Properties prop = new Properties();
			prop.load(fr); // 프로퍼티 로
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			fr.close();
			Class.forName(driver); // 드라이벌 로
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 2. 오라클 연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 3. 오라클 해제
	public void disConnection() {
		try {
			if(ps != null)ps.close();
			if(conn != null)conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public List<EmpVO> empListData(){
		List<EmpVO> list = new ArrayList<EmpVO>();
		
		try {
			// 오라클 연결 
			getConnection();
			
			String sql = "select empno,ename,job,hiredate,sal,emp.deptno"
					+ ",dname,loc,grade "
					+ "from emp,dept,salgrade "
					+ "where emp.deptno = dept.deptno "
					+ "and sal between losal and hisal "
					+ "order by sal desc";
			// 전송 
			ps = conn.prepareStatement(sql);
			
			// 결과값 받기
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				vo.setSal(rs.getInt(5));
				vo.setDeptno(rs.getInt(6));
				vo.getDvo().setDname(rs.getString(7));
				vo.getDvo().setLoc(rs.getString(8));
				vo.getSvo().setGrade(rs.getInt(9));
				list.add(vo);
			}
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disConnection();
		}
		return list;
	}
}
