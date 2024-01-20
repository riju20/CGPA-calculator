package cgpa;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Conversions {
	
	int x = 0;
	
	public void conversionView(int i) {
		Commons commons = new Commons();
		JFrame frame = commons.frames();
		JButton b10 = new JButton("10.0");
		JButton b5 = new JButton("5.0");
		JButton b4 = new JButton("4.0");
		
		//----------------BACK--------------------
		JLabel prev = commons.back(frame);
		frame.add(prev);
		//----------------------------------------
		
		//---------------LABEL------------------
		JLabel grade = new JLabel("SELECT THE GRADING SCALE : ");
		grade.setBounds(30, 180, 300, 50);
		grade.setFont(new Font("", Font.BOLD, 15));
		grade.setForeground(Color.decode("#949398"));
		frame.add(grade);
		//--------------------------------------
		
		//----------------4------------------------
		commons.bdes(b4, 0, 0);
		b4.setBounds(50, 230, 183, 40);
		frame.add(b4);
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				x=4;
				b4.setBackground(Color.decode("#763A12"));
				b5.setBackground(Color.decode("#949398"));
				b10.setBackground(Color.decode("#949398"));
			}
		});
		//------------------------------------------
		
		//----------------5------------------------
		commons.bdes(b5, 0, 0);
		b5.setBounds(283, 230, 183, 40);
		frame.add(b5);
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				x=5;
				b5.setBackground(Color.decode("#763A12"));
				b4.setBackground(Color.decode("#949398"));
				b10.setBackground(Color.decode("#949398"));
			}
		});
		//------------------------------------------
		
		//----------------10------------------------
		commons.bdes(b10, 0, 0);
		b10.setBounds(516, 230, 183, 40);
		frame.add(b10);
		b10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				x=10;
				b10.setBackground(Color.decode("#763A12"));
				b4.setBackground(Color.decode("#949398"));
				b5.setBackground(Color.decode("#949398"));
			}
		});
		//------------------------------------------
		
		//-----------------INPUTLABEL-------------------
		JLabel enter = new JLabel("ENTER THE VALUE : ");
		enter.setBounds(30, 330, 200, 30);
		enter.setFont(new Font("", Font.BOLD, 15));
		enter.setForeground(Color.decode("#949398"));
		frame.add(enter);
		JTextField value = new JTextField();
		value.setBounds(50, 370, 183, 40);
		value.setBackground(Color.decode("#949398"));
		value.setForeground(Color.WHITE);
		value.setHorizontalAlignment(JLabel.CENTER);
		frame.add(value);
		//----------------------------------------------
		
		//----------------------RESULT--------------------
		JLabel result = new JLabel("RESULT : ");
		result.setBounds(496, 330, 200, 30);
		result.setFont(new Font("", Font.BOLD, 15));
		result.setForeground(Color.decode("#949398"));
		frame.add(result);
		JTextField res = new JTextField();
		res.setBounds(516, 370, 183, 40);
		res.setBackground(Color.decode("#949398"));
		res.setForeground(Color.WHITE);
		res.setFont(new Font("", Font.BOLD, 20));
		res.setEditable(false);
		res.setHorizontalAlignment(JLabel.CENTER);
		frame.add(res);
		//-------------------------------------------------
		
		//----------------WARNING----------------------
		JLabel warning = new JLabel();
		warning.setBounds(0, 430, 750, 30);
		warning.setHorizontalAlignment(JLabel.CENTER);
		warning.setForeground(Color.RED);
		warning.setFont(new Font("", Font.BOLD, 15));
		frame.add(warning);
		//---------------------------------------------
		
		//---------------CALCULATE----------------------
		JButton calc = new JButton("CALCULATE");
		commons.bdes(calc, 175, 340);
		calc.setBounds(283, 370, 183, 40);
		frame.add(calc);
		calc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float resValue;
				if(x==0)
					warning.setText("Select a grading scale!!!");
				else if(value.getText().equals(""))
					warning.setText("Enter Some Values!!!");
				else {
					warning.setText("");
					if(i==1) {
						if(Float.parseFloat(value.getText()) > 100 || Float.parseFloat(value.getText()) < 0)
							warning.setText("Value cannot be greater than 100% or less than 0%!!!");
						else {
							resValue = x*(Float.parseFloat(value.getText())/100);
							res.setText(resValue+"");
						}
					}
					else {
						if(Float.parseFloat(value.getText()) > x || Float.parseFloat(value.getText()) < 0)
							warning.setText("Value cannot be greater than "+ x +" or less than 0!!!");
						else {
							resValue = 100*(Float.parseFloat(value.getText())/x);
							res.setText(resValue+"%");
						}
					}
				}
			}
		});
		//----------------------------------------------
		
		frame.setVisible(true);
	}
}