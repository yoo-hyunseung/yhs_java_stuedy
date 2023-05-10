package com.sist.temp;

import java.awt.Color;

import javax.swing.*;

import com.sist.manager.NaverNewsManager;
import com.sist.manager.NewsVO;

import java.awt.event.*;
import java.awt.*;
import java.util.List;
import java.util.*;
public class NewsPanel extends JPanel implements ActionListener{
	NewsCard[] cards = new NewsCard[5];
	JTextField tf;
	JButton b;
	JPanel pan;
	public NewsPanel() {
		// 초기화
		tf = new JTextField();
		b = new JButton("search");
		for(int i =0 ; i < cards.length;i++) {
			cards[i] = new NewsCard();
		}
		pan = new JPanel();
		pan.setLayout(new GridLayout(5,1,5,5));
		setLayout(null);
		
		// 배치
		tf.setBounds(10, 15, 250, 30);
		b.setBounds(265, 15, 100, 30);
		pan.setBounds(10, 55, 720, 650);
		add(tf);
		add(b);
		add(pan);
		
		// regist
		tf.addActionListener(this);
		b.addActionListener(this);
		
		newsPrint("뮤직");
	}
	public void newsPrint(String fd) {
		List<NewsVO> list = NaverNewsManager.newsSearchData(fd);
		int i = 0;
		for(NewsVO vo : list) {
			cards[i].titleLa.setText(vo.getTitle());
			cards[i].contentTa.setText(vo.getContent());
			cards[i].dateLa.setText(vo.getDate());
			pan.add(cards[i]);
			i++;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf || e.getSource() ==b) {
			String fd = tf.getText();
			// web 유효성 검사 필수
			if(fd.length() < 1) {
				JOptionPane.showMessageDialog(this, "input keyword");
				tf.requestFocus();
				return;
			}
			newsPrint(fd);
		}
		
	}
}
