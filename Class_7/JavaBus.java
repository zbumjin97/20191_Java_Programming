import java.util.Scanner;

class Bus implements Runnable{
	private int num = 10;
	
	public void run(){
		synchronized(this){
			Scanner sc = new Scanner(System.in);
			System.out.println("------------------------------");
			System.out.println(Thread.currentThread().getName() + "가 들어왔음.");
			System.out.print("가능한 좌석수 : " + getNumber() + " 요청좌석수 : ");
			int num0 = sc.nextInt();
			Balance(num0);
			System.out.println(Thread.currentThread().getName() + "가 나갑니다.");
			System.out.println("------------------------------");
		}
	}
	public void Balance(int num0){
		if(num - num0 >= 0){
			System.out.println(num0 + "좌석이 예약되었음.");
			num -= num0;
		}
		else System.out.println("불가능합니다.");
	}
	public int getNumber(){
		return num;
	}
}

public class JavaBus {
	public static void main(String[] args) {
		Bus bus = new Bus();
		Thread t1 = new Thread(bus, "Thread-0");
		Thread t2 = new Thread(bus, "Thread-1"); 
		Thread t3 = new Thread(bus, "Thread-2"); 
		t1.start(); 
		t2.start(); 
		t3.start(); 
	}
}
