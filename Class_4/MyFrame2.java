import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame{
	public MyFrame2(){
		setTitle("BorderLayoutTest");
		setSize(300,150);
		setLayout(new BorderLayout());
		JButton b1 = new JButton("��ư1");
		JButton b2 = new JButton("��ư2");
		JButton b3 = new JButton("��ư3");
		JButton b4 = new JButton("��ư4");
		JButton b5 = new JButton("��ư5");
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
