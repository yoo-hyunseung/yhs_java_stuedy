package com.sist.exception;
/*
 *    예외처리 방법
 *    ----------
 *    1. 예외 복구 : try - catch - finally
 *    ---------------------------------------- 가장 많이 사용되는 예외처리
 *    2. 예외 회피 : throws
 *   ---------------------------------------- 라이브러리에 주로 있다.
 *    3. 임의 발생 : throw
 *    4. 사용자 정의 : 지원하지 않는 경우에 직접 제작(사용빈도는 거의 없다.)
 *       ------------------------ if 문을 주로 사용한다.
 *   
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class 예외처리_예외복구_7 extends JFrame implements ActionListener{
	private JTextField tf;
	private JButton b1,b2; // 부분적으로 예외처리
	private int com;
	public 예외처리_예외복구_7() { // 생성자 초기화 및 시작과 동시에 처리하는 내용
		tf = new JTextField(20);
		b1 = new JButton("시작");
		b2 = new JButton("종료");
		tf.setEnabled(false);
	    JPanel p = new JPanel();
	    p.add(tf);p.add(b1);p.add(b2);
	    add("Center",p);
	    setSize(390,150);
	    setVisible(true);
	    
	    b1.addActionListener(this);
	    // b1 을 클릭하면 => actionPerformed 호출한다 (이벤트 등록)
	    b2.addActionListener(this);
	    
	    // b2 을 클릭하면 => actionPerformed 호출한다 (이벤트 등록)
	    tf.addActionListener(this);
	    // tf에서 엔터를 누르면 => actionPerformed 호출한다 (이벤트 등록)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 예외처리_예외복구_7();

	}
	// 버튼 처리하는 메소드 : 정의 용도가 여러개이기 때문에 구현을 하지 못한다
	// 호출은 해준다 (자동 호출)-> 구현은 사용자에게 맡긴다.
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b2 ) { //b2 버튼을 클릭했다면
			System.exit(0);
		}
		else if(e.getSource() == b1) {
			com = (int)(Math.random()*100)+1;
			JOptionPane.showMessageDialog(this, "게임을 시작합니다.");
			tf.setEnabled(true);
			tf.requestFocus();
			b1.setEnabled(false);
		}
		else if(e.getSource()==tf) {
			String strNum = tf.getText(); // 사용자가 입력한 값을 가져 온다.
			if(strNum.trim().length()<1) { // 좌우의 공백을 제거 
				// 입력이 안된 경우
				JOptionPane.showMessageDialog(this, "1~100 사이에 정수 입력");// 알림창
				tf.requestFocus();// 알림창
				return;
			}
			// 입력이 된 상태
			int num = 0;
			try {
				num = Integer.parseInt(strNum);
				// String to int
				// int => String ( valueOf() )
			} catch (NumberFormatException e2) {
				// TODO: handle exception
				// 잘못된 입력이 오면 다시 복구
				JOptionPane.showMessageDialog(this, "정수만 입력이 가능합니다.");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			if(com > num) {
				JOptionPane.showMessageDialog(this, "입력보다 큰 값이 가능합니다.");
				tf.setText("");
				tf.requestFocus();
			}else if(com < num) {
				JOptionPane.showMessageDialog(this, "입력보다 작은 값이 가능합니다.");
				tf.setText("");
				tf.requestFocus();
			}else {
				JOptionPane.showMessageDialog(this, "Game Over! ! !");
				tf.setText("");
				tf.setEnabled(false); // 비활성화
				b1.setEnabled(true); // 활성화
			}
		}
		
		
	}

}
