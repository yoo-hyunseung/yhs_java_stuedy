package com.sist.temp;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NetworkMain_2 extends JFrame { // client
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JButton b1,b2,b3,b4,b5;
	
	public NetworkMain_2() {
		mp = new MenuPanel();
		cp = new ControlPanel();
		tp = new TopPanel();
		
		setLayout(null); // Layout없이 직접 배치
		mp.setBounds(10,15,600,50); // (220 , 225)
		cp.setBounds(10,75,960,730);
		tp.setBounds(10,75,200,730);
		
		b1 = new JButton("홈");
		b2 = new JButton("음악검색");
		b3 = new JButton("채팅");
		b4 = new JButton("뉴스검색");
		b5 = new JButton("음악추천");
		mp.setLayout(new GridLayout(5,1,10,10));
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		mp.add(b5);
		// 추가
		
		
		add(mp);
		add(cp);
		add(tp);
		
		// 윈도우 크기
		setSize(1200,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
			// hifi , mcwin, mint, luna,acryl          ----- ---- 교체
//			UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		new NetworkMain();
	}

}
