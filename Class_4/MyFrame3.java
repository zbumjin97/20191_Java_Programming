import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame3 extends JFrame{
	public MyFrame3(){
		setTitle("FlowLayoutTest");
		setSize(300,150);
		setLayout(new FlowLayout());
		add(new JButton("��ư1"));
		add(new JButton("��ư2"));
		add(new JButton("��ư3"));
		add(new JButton("��ư4"));
		add(new JButton("��ư5"));
		setVisible(true);		
	}
	public static void main(String argv[]){
		MyFrame3 f = new MyFrame3();
	}
}
