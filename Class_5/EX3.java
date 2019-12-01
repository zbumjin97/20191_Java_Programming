import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class EX3 extends JFrame {
	private JButton button;
	private JTextField field1, field2, field3;
	int mile;
	public EX3() {
		setSize(400, 500);
		setTitle("Mile->Km");
		ButtonListener listener = new ButtonListener();
		JPanel panel = new JPanel();
		panel.add(new JLabel("마일을 입력하시오."));
		field1 = new JTextField(4);
		field1.addActionListener(listener);;
		panel.add(field1);
		
		panel.add(new JLabel("->"));
		field3 = new JTextField(4);
		field3.add(field1);
		field2 = new JTextField(15);
		field2.setEditable(false);;
		panel.add(field2);
		add(panel);
		setVisible(true);
		button = new JButton("변환");
		button.addActionListener(listener);
		panel.add(button);
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==button){
				String a = field1.getText();
				String b = field2.getText();
				mile = Integer.parseInt(a);
				field2.setText(double)mile*1.609344+"Km");
				}
			}
		}
		public static void main(String[]args){
			EX3 f = new EX3();
	}
}
