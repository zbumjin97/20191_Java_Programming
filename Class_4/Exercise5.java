import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exercise5 extends JFrame{
	public Exercise5(){
		super("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(4, 5));
		for(int i = 0; i < 20; i++){
			String text = Integer.toString(i);
			JButton button = new JButton(text);
			int R = (int)(Math.random()*256);
			int G = (int)(Math.random()*256);
			int B = (int)(Math.random()*256);
			Color color = new Color(R,G,B);
			button.setBackground(color);
			contentPane.add(button);
		}
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String args[]){
		new Exercise5();
	}
}
