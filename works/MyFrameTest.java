package works;

import java.awt.FlowLayout;
import javax.swing.*;

class MyFrame3 extends JFrame{
	JPanel p1;
  	public MyFrame3() {
		setSize(300, 200);
		setTitle("My Frame");
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		for (int i = 0; i < 10; i++)
			p1.add(new JButton("Button" + i));
		add(p1);
		setVisible(true);
	}
}

public class MyFrameTest extends JFrame{
	public static void main(String args[]){
		MyFrame3 f = new MyFrame3();
	}	
}
