package 윈도우;

import javax.swing.JFrame;
import javax.tools.Tool;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class 나의윈도우 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setTitle("나의 윈도우 프로그램");
		
		JButton btnNewButton = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton.setForeground(new Color(0, 0, 205));
		btnNewButton.setBackground(new Color(0, 191, 255));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uB098\uB294 \uC704\uBC84\uD2BC");
		btnNewButton_1.setBackground(new Color(128, 0, 128));
		btnNewButton_1.setForeground(new Color(175, 238, 238));
		f.getContentPane().add(btnNewButton_1, BorderLayout.NORTH);
		
		JButton button = new JButton("\uC544\uB798\uBC84\uD2BC");
		button.setBackground(new Color(0, 128, 0));
		button.setForeground(new Color(25, 25, 112));
		f.getContentPane().add(button, BorderLayout.SOUTH);
		f.setVisible(true);
		
		
	}

}
