class Blue extends Thread
{
	public void run()
	{
		while(true) System.out.println("û�� �÷�");
	}
}

class White extends Thread
{
	public void run()
	{
		while(true) System.out.println("��� �÷�");
	}
}

public class FlagTest {
	public static void main(String args[])
	{
		White w = new White();
		Blue b = new Blue();
		b.start();
		w.start();
	}
}
