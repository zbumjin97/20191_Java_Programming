class Blue2 implements Runnable
{
	public void run()
	{    
		while(true)
			System.out.println("û�� �÷�");  
	}
}
class White2 implements Runnable {
      public void run()
      {
    	  while(true)
    		  System.out.println("��� �÷�");
      }
}
public class FlagTest2 {
	public static void main(String[] args)
	{
	    White2 w = new White2();
	    Blue2 b = new Blue2();
	    Thread t1 = new Thread(w);
	    Thread t2 = new Thread(b); 
  	    t1.start();
  	    t2.start();
	} 
}
