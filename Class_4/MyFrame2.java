import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame{
	public MyFrame2(){
		setTitle("BorderLayoutTest");
		setSize(300,150);
		setLayout(new BorderLayout());
		JButton b1 = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");
		JButton b3 = new JButton("버튼3");
		JButton b4 = new JButton("버튼4");
		JButton b5 = new JButton("버튼5");
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);
		setVisible(true);		
	}
	public static void main(String argv[]){
		MyFrame2 f = new MyFrame2();
	}
}
