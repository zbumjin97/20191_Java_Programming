import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame{
	private JButton b1, b2;
	public MyFrame4(){
		setTitle("Absolute Position Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,150);
		setLayout(null); // 지정한 위치
		b1 = new JButton("Button #1");
		add(b1);
		b1.setLocation(10,30);
		b1.setSize(90,20);
		b2 = new JButton("Button #2");
		add(b2);
		b2.setLocation(100,30);
		b2.setSize(90,20);
		setVisible(true);
	}
	public static void main(String args[]){
		MyFrame4 f = new MyFrame4();
	}
}
