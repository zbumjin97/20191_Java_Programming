import java.util.Scanner;

class Bus implements Runnable{
	private int num = 10;
	
	public void run(){
		synchronized(this){
			Scanner sc = new Scanner(System.in);
			System.out.println("------------------------------");
			System.out.println(Thread.currentThread().getName() + "�� ������.");
			System.out.print("������ �¼��� : " + getNumber() + " ��û�¼��� : ");
			int num0 = sc.nextInt();
			Balance(num0);
			System.out.println(Thread.currentThread().getName() + "�� �����ϴ�.");
			System.out.println("------------------------------");
		}
	}
	public void Balance(int num0){
		if(num - num0 >= 0){
			System.out.println(num0 + "�¼��� ����Ǿ���.");
			num -= num0;
		}
		else System.out.println("�Ұ����մϴ�.");
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
