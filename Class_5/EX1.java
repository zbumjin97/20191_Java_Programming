import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
	
public class EX1 extends JFrame
{
	private JButton button;
	class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			button.setText("��ħ�� ��ư�� ���������ϴ�.");
		}
	}
	public EX1()
	{
		setSize(400,150);
		setTitle("�̺�Ʈ ����");
		setLayout(new FlowLayout());
		button = new JButton("��ư�� �����ÿ�");
		button.addActionListener(new MyListener());
		add(button);
		setVisible(true);
	}
	public static void main(String args[])
	{
		EX1 t = new EX1();
	}
}
