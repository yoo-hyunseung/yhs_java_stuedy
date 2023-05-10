package com.sist.temp;

import java.awt.Color;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import com.sist.inter.ChatInterface;
//750,730 : size
public class ChatPanel extends JPanel implements ChatInterface{
	JTextPane pane;
	JTextField tf;
	JButton b1,b2; // message, info
	JTable table; // 화면 UI
	DefaultTableModel model; //데이터 관리
	JComboBox<String> box;
	/*
	 *   화면관리 / 데이터관리를 따로 하는 프로그램
	 *   ------   --------
	 *     view   Model ==> 연결(controller)
	 *     MVC(Spring)
	 */
	public ChatPanel() {
		// 초기화
		pane = new JTextPane();
		pane.setEditable(false);
		JScrollPane js1 = new JScrollPane(pane);
		tf = new JTextField();
		box = new JComboBox<String>();
		
		// red => 알림 , 
		
		box.addItem("black");
		box.addItem("blue");
		box.addItem("red");
		box.addItem("yellow");
		box.addItem("green");
		box.addItem("orange");
		box.addItem("cyan");
		// 테이블
		String[] col = {"아이디", "이름", "성별"};
		String [][] row = new String[0][3];
		
		model = new DefaultTableModel(row, col) {
            // 익명클래스 -> 상속 없이 오버라이딩 가능 -> 이미 클래스가 상속을 받은 경우 사용할수 있다.
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		table = new JTable(model);
		JScrollPane js2 = new JScrollPane(table);
		b1 = new JButton("쪽지보내기");
		b2 = new JButton("정보보기");
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2); // 정보보기
		// 배치
		setLayout(null);
		js1.setBounds(10,15,550,600);
		tf.setBounds(10, 620, 380, 30);
		box.setBounds(395, 620, 115, 30);
		js2.setBounds(570,15,210,250); // 테이블
		p.setBounds(570,270,230,35);; // 버튼 2개
		add(p);
		add(js1);
		add(js2);
		b1.setEnabled(false); // 비활성화
		b2.setEnabled(false);
//		String [] data = {"hong","홍길동","남자"};
//		model.addRow(data);
		
		add(tf);add(box);
		// 이벤트
		
	}
	public void initStyle() {
		Style blue=pane.addStyle("blue", null);
		StyleConstants.setForeground(blue, Color.blue);
		
		Style yellow=pane.addStyle("yellow", null);
		StyleConstants.setForeground(yellow, Color.yellow);
		
		Style green=pane.addStyle("green", null);
		StyleConstants.setForeground(green, Color.green);
		
		Style pink=pane.addStyle("pink", null);
		StyleConstants.setForeground(pink, Color.pink);
		
		Style cyan=pane.addStyle("cyan", null);
		StyleConstants.setForeground(cyan, Color.cyan);
		
		Style orange=pane.addStyle("orange", null);
		StyleConstants.setForeground(orange, Color.orange);
		
		Style red=pane.addStyle("red", null);
		StyleConstants.setForeground(red, Color.red);
	}
	public void append(String msg, String color) {
		try {
			Document doc = pane.getDocument();
			doc.insertString(doc.getLength(), msg+"\n", pane.getStyle(color));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}
