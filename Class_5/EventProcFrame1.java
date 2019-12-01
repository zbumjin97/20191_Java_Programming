import java.awt.event.*;
import javax.swing.*;

public class EventProcFrame1 extends JFrame implements ActionListener {
	private JButton button;
	private JLabel label;
	int counter = 0;
	/*public void actionPerformed(ActionEvent e)
	{
		counter++;
		label.setText("현재의 카운터값: " + counter);
	}*/
	public EventProcFrame1()
	{
		this.setSize(400,150);
		this.setTitle("이벤트 예제");
		JPanel panel = new JPanel();
		button = new JButton("증가");
		label = new JLabel("현재의 카운터값: "+ counter);
		//button.addActionListener(this);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				counter++;
				label.setText("현재의 카운터값: " + counter);
			}
		});
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		EventProcFrame1 f = new EventProcFrame1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
