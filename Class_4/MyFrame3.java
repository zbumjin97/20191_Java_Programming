import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame3 extends JFrame{
	public MyFrame3(){
		setTitle("FlowLayoutTest");
		setSize(300,150);
		setLayout(new FlowLayout());
		add(new JButton("버튼1"));
		add(new JButton("버튼2"));
		add(new JButton("버튼3"));
		add(new JButton("버튼4"));
		add(new JButton("버튼5"));
		setVisible(true);		
	}
	public static void main(String argv[]){
		MyFrame3 f = new MyFrame3();
	}
}
