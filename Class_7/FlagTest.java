class Blue extends Thread
{
	public void run()
	{
		while(true) System.out.println("청기 올려");
	}
}

class White extends Thread
{
	public void run()
	{
		while(true) System.out.println("백기 올려");
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
