import javax.swing.JFrame;

public class FrameTest2 {
	public static void main(String args[])
	{
		JFrame f1 = new JFrame("³ª");
		JFrame f2 = new JFrame("³Ê");
		int x1 = 30, x2 = 30;
		f1.setSize(300,200);
		f2.setSize(300, 200);
		f2.setVisible(false);
		f1.setLocation(x1, 20);
		f2.setLocation(x2, 230);
		f1.setVisible(true);
		f2.setVisible(true);
		for(int i = 0; i < 10; i++)
		{
			x1 = x1 + (int)(Math.random()*100);
			x2 = x2 + (int)(Math.random()*100);
			f1.setVisible(false);
			f2.setVisible(false);
			f1.setLocation(x1, 20);
			f2.setLocation(x2, 230);
			f1.setVisible(true);
			f2.setVisible(true);
		}
	}
}
