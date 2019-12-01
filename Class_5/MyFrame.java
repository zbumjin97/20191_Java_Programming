import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame
{
	private JButton button1, button2;
	private JLabel label;
	int counter = 0;
	/*
	class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			counter++;
			label.setText("현재의 카운터값: " + counter);
		}
	}
	class MyListener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			counter--;
			label.setText("현재의 카운터값: " + counter);
		}
	}*/
	class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("증가"))
				counter++;
			else
				counter--;
			label.setText("현재의 카운터값: " + counter);
		}
	}
	public MyFrame()
	{
		setSize(400,150);
		setTitle("이벤트 예제");
		setLayout(new FlowLayout());
		button1 = new JButton("증가");
		button2 = new JButton("감소");
		label = new JLabel("현재의 카운터값: "+ counter);
		button1.addActionListener(new MyListener());
		button2.addActionListener(new MyListener());
		add(label,"Center");
		add(button1);
		add(button2);
		setVisible(true);
	}
	public static void main(String args[])
	{
		MyFrame t = new MyFrame();
	}
}