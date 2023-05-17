package com.sist.main;
import com.sist.dao.*;
import java.util.*;
public class EmpClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDAO dao = new EmpDAO();
		List<EmpVO> list = dao.empListData();
		for(EmpVO vo : list) {
			System.out.println(
							vo.getEmpno()+" "+
							vo.getEname()+" "+
							vo.getJob()+" "+
							vo.getHiredate().toString()+" "+
							vo.getSal()+" "+
							vo.getDeptno()+" "+
							vo.getDvo().getDname()+" "+
							vo.getDvo().getLoc()+" "+
							vo.getSvo().getGrade()
					);
		}
	}

}
