package com.sist.temp;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sist.common.ImageChange;
import com.sist.inter.HomeInterface;
import com.sist.manager.GenieMusicVO;
import com.sist.manager.MusicSystem;

import java.util.*;
import java.net.*;

public class HomePanel extends JPanel implements HomeInterface, MouseListener{
	PosterCard[] pcs = new PosterCard [20];
	JPanel pan = new JPanel();
	JButton b1,b2;
	JLabel pageLa;
	ControlPanel cp;
	MusicSystem ms = new MusicSystem();
	public HomePanel(ControlPanel cp) {
		this.cp=cp;
		b1 = new JButton("pre");
		b2 = new JButton("next");
		pageLa = new JLabel("0page / 0pages");
		setLayout(null);
		pan.setLayout(new GridLayout(4,5,5,5));
		
		
		pan.setBounds(10, 15, 730, 700);
		add(pan);
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		p.add(pageLa);
		p.setBounds(10, 720, 730, 35);
		add(p);
	}
	public void cardPrint(List<GenieMusicVO>list) {
		int i =0 ;
		for(GenieMusicVO vo : list) {
			pcs[i] = new PosterCard(vo);
			pan.add(pcs[i]);
			i++;
		}
		for(int j=0 ; j < pcs.length;j++) {
//			??
			pcs[j].addMouseListener(this);
		}
	}
	public void cardInit(List<GenieMusicVO>list) {
//		for(int i =0 ; i < list.size(); i++) {
//			pcs[i].poLa.setIcon(null);
//			pcs[i].tLa.setText("");
//		}
		pan.removeAll(); // 모든 데이터 제거
		pan.validate(); // Panel 재배치
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i =0 ; i < pcs.length;i++) {
			if(e.getSource() == pcs[i]) {
//				JOptionPane.sh
				String title = pcs[i].tLa.getText();
//				JOptionPane.showMessageDialog(this, title);
				GenieMusicVO vo = ms.musicDetailData(title);
				try {
					URL url = new URL("http:"+vo.getPoster());
					Image img = ImageChange.getImage(new ImageIcon(url),530,350);
					cp.dp.imgLa.setIcon(new ImageIcon(img));
					cp.dp.titleLa.setText(vo.getTitle());
					cp.dp.singerLa.setText(vo.getSinger());
					cp.dp.albumLa.setText(vo.getAlbum());
					cp.dp.stateLa.setText(vo.getState());
					cp.dp.crementLa.setText(vo.getIdcrement()==0 ? "":String.valueOf(vo.getIdcrement()));
					cp.dp.keyLa.setText(vo.getKey());
					cp.card.show(cp, "detail");
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
