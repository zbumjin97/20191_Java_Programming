import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame(){
		setSize(300,200);
		setLocation(200,300);
		setTitle("MyFrame");
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.yellow);
		JButton button1 = new JButton("확인");
		JButton button2 = new JButton("취소");
		this.add(button1);
		this.add(button2);
		JButton button = new JButton("버튼");
		setVisible(true);
		
	}
	public static void main(String args[]){
		MyFrame f = new MyFrame();
	}
}
