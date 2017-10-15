package works;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class cal2 extends JFrame{
	private int result=0,input=0;
	private char c=' ';
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = { 
			"Backspace", "", "", "CE", "C",
			"7", "8", "9", "/", "sqrt",
			"4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x",
			"0", "+/-", ".", "+", "=",};
	public cal2() {
		tField = new JTextField(35);
		panel = new JPanel();
		tField.setText("0.");
		tField.setEnabled(true);
  
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		int index = 0;
		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if( cols >= 3 )
					buttons[index].setForeground(Color.red);
				else 
					buttons[index].setForeground(Color.blue);
				if(rows>0&&cols<3)buttons[index].addActionListener(new numListener());
				buttons[index].setBackground(Color.yellow);
				panel.add(buttons[index]);
				index++;
			}
		}
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();

	}
	private class numListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String actionCommand = e.getActionCommand();
			if(c==' ')result=0;
			input = input*10 + Integer.parseInt(actionCommand);
			tField.setText(""+input);
		}
	}
	public static void main(String args[]) {
		cal2 s = new cal2();
	}

}

