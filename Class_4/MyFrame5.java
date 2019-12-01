import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame5 extends JFrame{
	public MyFrame5(){
		JPanel panel = new JPanel();
		panel.setBackground(Color.orange);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.cyan);
		JButton b1 = new JButton("Button 1");
		b1.setBackground(Color.yellow);
		JButton b2 = new JButton("Button 2");
		b2.setBackground(Color.green);
		panel.add(b1);
		panel2.add(b2);
		add(panel);
		add(panel2);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String argv[]){
		MyFrame5 f = new MyFrame5();
	}
}
