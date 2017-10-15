package works;

import java.awt.*;
import javax.swing.*;

class frame6 extends JFrame {
	JPanel p = new JPanel();
	JLabel[] labels = new JLabel[40];
public frame6() {
		p.setLayout(null);
		p.setBackground(Color.YELLOW);
		for (int i = 0; i < 40; i++) {
			labels[i] = new JLabel("" + i);
			int x = (int) (480 * Math.random());
			int y = (int) (280 * Math.random());
			labels[i].setForeground(Color.GREEN);
			labels[i].setLocation(x, y);
			labels[i].setSize(20, 20);
			p.add(labels[i]);
		}
		setSize(500, 300);
		add(p);
		setVisible(true);
	}
}


public class randomValues {
	public static void main(String args[]){
		frame6 f = new frame6();
	}
}
