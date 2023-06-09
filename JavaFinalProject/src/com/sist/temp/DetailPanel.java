package com.sist.temp;
import java.util.*;
import com.sist.manager.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// IO 파일 처리 부분을 중점으로 봐야함 -> 데이터 수집...
// url 처리
// 이벤트 처리 -> 자바 (인터페이스) -> 자바스크립트 
// ActionListener -> onClick
// 제네릭, 객체지향 ES6 ==> ES8

// 버튼 메뉴 텍스트 필드 => ActionListener
// JLabel , 테이블 -> MouseListener;
public class DetailPanel extends JPanel implements ActionListener{
	JLabel imgLa;
	JLabel la1,la2,la3,la4,la5;
	JButton b1,b2;
	JLabel titleLa, singerLa,albumLa,stateLa,crementLa,keyLa;
	ControlPanel cp;
	public DetailPanel(ControlPanel cp) {
		this.cp = cp;
		// 초기화 , 시작과 동시에 구현
		// 웹 -> 데이터베이스 설정 , 자동 로그인 ...
		imgLa = new JLabel();
		la1 = new JLabel("제목");
		la2 = new JLabel("가수명");
		la3 = new JLabel("앨범명");
		la4 = new JLabel("상태");
		la5 = new JLabel("등폭");
		b1 = new JButton("동영상");
		b2 = new JButton("목록");
		titleLa = new JLabel("");
		singerLa = new JLabel("");
		albumLa = new JLabel("");
		stateLa = new JLabel("");
		crementLa = new JLabel("");
		keyLa = new JLabel("");
		
		// 배치 
		setLayout(null);
		imgLa.setBounds(100, 15, 530, 350);
		
		la1.setBounds(100, 375, 60, 40);
		titleLa.setBounds(165, 375, 300, 40);
		
		la2.setBounds(100, 425, 60, 40);
		singerLa.setBounds(165, 425, 300, 40);
		
		la3.setBounds(100, 475, 60, 40);
		albumLa.setBounds(165, 475, 300, 40);
		
		la4.setBounds(100, 525, 60, 40);
		stateLa.setBounds(165, 525, 300, 40);
		
		la5.setBounds(100, 575, 60, 40);
		crementLa.setBounds(165, 575, 300, 40);
		
		keyLa.setBounds(100, 625, 300, 40);
		keyLa.setVisible(false);
		
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(100, 670, 365, 40);
		
		// 윈도우에 추가
		add(imgLa);
		add(la1);add(titleLa);
		add(la2);add(singerLa);
		add(la3);add(albumLa);
		add(la4);add(stateLa);
		add(la5);add(crementLa);
		add(keyLa);
		add(p);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
				
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1) {
			///Applications/Safari.app
			///Applications/Google Chrome.app
			try {
				Runtime.getRuntime().exec("Applications/Safari.app "+"http://youtube.com/embed/"
			+keyLa.getText());
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		else if(e.getSource() == b2) {
			cp.card.show(cp, "home");
		}
	}
}
