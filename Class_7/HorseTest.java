class Horse implements Runnable
{
	private int horse_num;
	public Horse(int horse_num){
		this.horse_num = horse_num;
	}
	public void run(){
		for(int i = 1; i <= 5; i++){
			long sleepTime = (long)(Math.random()* 800);
			System.out.println(horse_num + "번 말 " + sleepTime + "만큼 sleep..");
			try{
				Thread.sleep(sleepTime);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(horse_num + "번 말 " + 100*i + "미터 도착");
		}
		System.out.println(horse_num + "번 말 " + "결승선 도착");
	}
}
public class HorseTest {
	public static void main(String args[])
	{
		Thread t1 = new Thread(new Horse(1));
		Thread t2 = new Thread(new Horse(2));
		Thread t3 = new Thread(new Horse(3));
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main() 종료...");
		
	}
}
