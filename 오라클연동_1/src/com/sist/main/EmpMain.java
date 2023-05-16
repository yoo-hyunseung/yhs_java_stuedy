package com.sist.main;
import java.util.List;
import java.util.Scanner;

import com.sist.dao.*;
public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();
		while(true) {
			System.out.println("========= menu =========");
			System.out.println("1. 사원 목록");
			System.out.println("2. 사원 상세보기");
			System.out.println("3. 사원 찾기");
			System.out.println("9. 종료하기");
			System.out.println("========================");
			System.out.print("메뉴 입력: ");
			int menu = sc.nextInt();
			if(menu == 9) {
				System.out.println("프로그램 종료!!");
				break;
			}
			else if(menu == 1) {
				List<EmpVO> list = dao.empListData();
				for(EmpVO vo : list) {
					System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "+vo.getHiredate().toString()+" "+vo.getSal());
				}
			}
			else if(menu == 2) {
				List<Integer> list = dao.empGetEmpno();
				String s ="";
				for(int no : list) {
					s+=no+",";
				}
				s=s.substring(0,s.lastIndexOf(","));
				System.out.println(s);
				System.out.print("사번입력 : ");
				int empno = sc.nextInt();
				EmpVO vo = dao.empDetailData(empno);
				System.out.println(vo.getEname()+"사원 정보");
				System.out.println("사번"+vo.getEmpno());
				System.out.println("이름"+vo.getEname());
				System.out.println("직위"+vo.getJob());
				System.out.println("사수번호"+vo.getMgr());
				System.out.println("입사일"+vo.getHiredate().toString());
				System.out.println("월급"+vo.getSal());
				System.out.println("성과급"+vo.getComm());
				System.out.println("부서번호"+vo.getDeptno());
			}
			else if(menu == 3) {
				System.out.print("사원 이름입력:");
				String ename =sc.next();
				ename= ename.toUpperCase();
				List<EmpVO> list = dao.empFindData(ename);
				if(list.isEmpty()) {
					System.out.println("찾는 사원이 없습니다.");
				}
				else {
					for(EmpVO vo : list) {
						System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "+vo.getMgr()+" "
					+vo.getHiredate().toString()+" "+vo.getSal()+" "+vo.getComm()+" "+vo.getDeptno());
					}
				}
			}
		}
	}

}
