package com.sist.temp;

import java.awt.*;
import java.net.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.awt.event.*;
import com.sist.common.ImageChange;
import com.sist.inter.FindInterface;
import com.sist.manager.*;
public class FindPanel extends JPanel implements ActionListener,FindInterface{
	JTextField tf; // 검색어
	JButton b1;//버튼 search
	JButton b2,b3,b4,b5,b6,b7;
	JTable table;
	DefaultTableModel model;
	MusicSystem ms;
	public FindPanel() {
		// 초기화
		tf = new JTextField();
		b1 = new JButton("검색");
		
		b2 = new JButton("가요");
		b3 = new JButton("POP");
		b4 = new JButton("OST");
		b5 = new JButton("트롯");
		b6 = new JButton("JAZZ");
		b7 = new JButton("CLASSIC");
		
		ms = new MusicSystem();
		String[] col = {"","곡명","가수명","앨범"};
		Object[][] row = new Object[0][4];
		model = new DefaultTableModel(row,col) {
			// 익명클래스 -> 상속없이 생성자안에서 오버라이딩을 할때 사용
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass(); // 이미지 출력 
			}
			
		};
		table = new JTable(model);
		//
		table.setRowHeight(35);// //테이블의 폭을 넓게 해줌 길이 설정
		table.getTableHeader().setReorderingAllowed(false); //테이블바 값을 수정 못하게해줌
		JScrollPane js = new JScrollPane(table);
		
		// 배치 750 730
		setLayout(null);
		tf.setBounds(10, 15, 300, 30);
		b1.setBounds(315, 15, 100, 30);
		add(tf);add(b1);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,6,5,5));
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.setBounds(10, 55, 700, 35);
		js.setBounds(10,100,700,600);
		add(js);
		add(p);
		
		try {
			List<GenieMusicVO> list = ms.musicCategoriData(1);
			for(GenieMusicVO vo : list) {
				URL url = new URL("http:"+vo.getPoster());
				Image img = ImageChange.getImage(new ImageIcon(url), 30, 30);
				Object[] data = {
						new ImageIcon(img),
						vo.getTitle(),
						vo.getSinger(),
						vo.getAlbum()
				};
				model.addRow(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		tf.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b2) {
			findPrint(1);
		}else if(e.getSource() == b3) {
			findPrint(2);
		}else if(e.getSource() == b4) {
			findPrint(3);
		}else if(e.getSource() == b5) {
			findPrint(4);
		}else if(e.getSource() == b6) {
			findPrint(5);
		}else if(e.getSource() == b7) {
			findPrint(6);
		}else if(e.getSource() == b1 || e.getSource()==tf) {
			String title = tf.getText();
			if(title.length() <1) {
				JOptionPane.showMessageDialog(this, "검색어 입력");
				tf.requestFocus();
				return;
			}
			findPrint2(title);
		}
		
	}
	public void findPrint(int cno) {
		for(int i =model.getRowCount()-1 ; i >= 0; i--) {
			model.removeRow(i); // 0부터 지우면 한개가 남음 -> 반대로 지워야한다. 역순으로 지운다.
		}
		try {
			List<GenieMusicVO> list = ms.musicCategoriData(cno);
			for(GenieMusicVO vo : list) {
				URL url = new URL("http:"+vo.getPoster());
				Image img = ImageChange.getImage(new ImageIcon(url), 30, 30);
				Object[] data = {
						new ImageIcon(img),
						vo.getTitle(),
						vo.getSinger(),
						vo.getAlbum()
				};
				model.addRow(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void findPrint2(String title) {
		for(int i =model.getRowCount()-1 ; i >= 0; i--) {
			model.removeRow(i); // 0부터 지우면 한개가 남음 -> 반대로 지워야한다. 역순으로 지운다.
		}
		try {
			List<GenieMusicVO> list = ms.musicFindData(title);
			for(GenieMusicVO vo : list) {
				URL url = new URL("http:"+vo.getPoster());
				Image img = ImageChange.getImage(new ImageIcon(url), 30, 30);
				Object[] data = {
						new ImageIcon(img),
						vo.getTitle(),
						vo.getSinger(),
						vo.getAlbum()
				};
				model.addRow(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
