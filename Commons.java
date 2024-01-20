package cgpa;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Commons {
	public JFrame frames() {
		JFrame frame = new JFrame();
		frame.setSize(750, 500);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(Color.decode("#F4DF4E"));
		
		//---------------EXIT--------------------
		JLabel exit = new JLabel("X");
		exit.setBounds(710, 15, 25, 30);
		exit.setFont(new Font("", Font.BOLD, 25));
		exit.setForeground(Color.decode("#949398"));
		frame.add(exit);
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		//----------------------------------------
		
		//--------------LOGO----------------------
		JLabel cgpa = new JLabel("CGPA");
		cgpa.setBounds(0, 50, 750, 80);
		cgpa.setForeground(Color.decode("#949398"));
		cgpa.setFont(new Font("", Font.BOLD, 100));
		cgpa.setHorizontalAlignment(JLabel.CENTER);
		frame.add(cgpa);
		JLabel calc = new JLabel("CALCULATOR");
		calc.setBounds(0, 105, 750, 80);
		calc.setForeground(Color.decode("#949398"));
		calc.setFont(new Font("", Font.BOLD, 30));
		calc.setHorizontalAlignment(JLabel.CENTER);
		frame.add(calc);
		//------------------------------------------
		
		return frame;
	}
	
	//----------------BUTTON DESIGNS----------------------
	public JButton bdes(JButton button, int x, int y) {
		button.setBackground(Color.decode("#949398"));
		button.setForeground(Color.WHITE);
		button.setBounds(x, y, 400, 50);
		button.setFocusable(false);
		return button;
	}
	//------------------------------------------------------
	
	//-----------------BACK BUTTON---------------------------
	public JLabel back(JFrame frame) {
		JLabel prev = new JLabel("< BACK");
		prev.setBounds(25, 20, 90, 30);
		prev.setFont(new Font("", Font.BOLD, 25));
		prev.setForeground(Color.decode("#949398"));
		prev.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		return prev;
	}
	//--------------------------------------------------------
}