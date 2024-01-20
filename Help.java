package cgpa;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Help {
	public void helpView() {
		Commons commons = new Commons();
		JFrame frame= commons.frames();
		Font txt = new Font("", Font.BOLD, 18);
		
		//----------------BACK--------------------
		JLabel prev = commons.back(frame);
		frame.add(prev);
		//----------------------------------------
		
		//-------------INSTRUCTIONS-----------------
		JLabel i1 = new JLabel("-> SELECT THE CGPA GRADING SCALE.");
		i1.setBounds(50, 230, 650, 20);
		i1.setFont(txt);
		frame.add(i1);
		JLabel i2 = new JLabel("-> ENTER THE NUMBER THAT YOU WANT TO CONVERT.");
		i2.setBounds(50, 280, 650, 20);
		i2.setFont(txt);
		frame.add(i2);
		JLabel i3 = new JLabel("-> PRESS CALCULATE.");
		i3.setBounds(50, 330, 650, 20);
		i3.setFont(txt);
		frame.add(i3);
		JLabel i4 = new JLabel("-> RESULT WILL BE OBTAINED.");
		i4.setBounds(50, 380, 650, 20);
		i4.setFont(txt);
		frame.add(i4);
		//------------------------------------------
		
		frame.setVisible(true);
	}
}