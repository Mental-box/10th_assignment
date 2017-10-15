package works;

import java.awt.*;

import javax.swing.*;

public class GUItest extends JFrame{
	public GUItest(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300,200);
		setLocation((screenSize.width-300)/2,(screenSize.height-200)/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		Image img = kit.getImage("icon.gif");
		setIconImage(img);
		setLayout(new FlowLayout());
		JButton button = new JButton("¹öÆ°");
		this.add(button);
		setVisible(true);
	}
	public static void main(String args[]){
		GUItest g = new GUItest();
	}
}
