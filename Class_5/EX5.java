import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EX5 extends JFrame{
	private JLabel label1, label2;
	TextField tfld, tfld2, tfld3;
	private JButton button;
	class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String a = tfld.getText();
			String b = tfld2.getText();
			tfld3.setText("이자는 연 " + (int)(Integer.parseInt(a) * Double.parseDouble(b)) / 100 + "만원입니다.");
		}
	}
	public EX5()
	{
		setTitle("이자 계산기");
		label1 = new JLabel("원금을 입력하시오");
		label2 = new JLabel("이율을 입력하시오");
		tfld = new TextField(10);
		tfld2 = new TextField(10);
		tfld3 = new TextField(20);
		tfld3.setEditable(false);
		button = new JButton("변환");
		button.addActionListener(new MyListener());
		setLayout(new FlowLayout());
		add(label1);
		add(tfld);
		add(label2);
		add(tfld2);
		add(button);
		add(tfld3);
		setSize(450,300);
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		EX5 f = new EX5();
	}
}
