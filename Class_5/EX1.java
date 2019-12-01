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
			button.setText("마침내 버튼이 눌려졌습니다.");
		}
	}
	public EX1()
	{
		setSize(400,150);
		setTitle("이벤트 예제");
		setLayout(new FlowLayout());
		button = new JButton("버튼을 누르시오");
		button.addActionListener(new MyListener());
		add(button);
		setVisible(true);
	}
	public static void main(String args[])
	{
		EX1 t = new EX1();
	}
}
