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
			label.setText("������ ī���Ͱ�: " + counter);
		}
	}
	class MyListener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			counter--;
			label.setText("������ ī���Ͱ�: " + counter);
		}
	}*/
	class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("����"))
				counter++;
			else
				counter--;
			label.setText("������ ī���Ͱ�: " + counter);
		}
	}
	public MyFrame()
	{
		setSize(400,150);
		setTitle("�̺�Ʈ ����");
		setLayout(new FlowLayout());
		button1 = new JButton("����");
		button2 = new JButton("����");
		label = new JLabel("������ ī���Ͱ�: "+ counter);
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