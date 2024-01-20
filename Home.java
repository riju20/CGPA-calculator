package cgpa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Home {
	public void homeView() {
		Commons commons = new Commons();
		JFrame frame = commons.frames();
		
		//-----------PERCENTTOCGPA-------------------
		JButton ptoc = new JButton("PERCENTAGE TO CGPA");
		commons.bdes(ptoc, 175, 220);
		frame.add(ptoc);
		ptoc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Conversions conv = new Conversions();
				conv.conversionView(1);
			}
		});
		//-------------------------------------------
		
		//-------------CGPATOPERCENT---------------------
		JButton ctop = new JButton("CGPA TO PERCENTAGE");
		commons.bdes(ctop, 175, 310);
		frame.add(ctop);
		ctop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Conversions conv = new Conversions();
				conv.conversionView(2);
			}
		});
		//-----------------------------------------------
		
		//----------------HELP---------------------------
		JButton help = new JButton("HELP");
		commons.bdes(help, 175, 400);
		frame.add(help);
		help.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Help helpwindow = new Help();
				helpwindow.helpView();
			}
		});
		//-----------------------------------------------
		
		frame.setVisible(true);
	}
}