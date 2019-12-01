import java.util.Scanner;

class Account {
	private int regNumber;
	private String name;
	private int balance;
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	public int getBalance(){return balance;}
	public void setBalance(int balance){this.balance = balance;}
	public void deposit(int balance){this.balance += balance;}
}

public class AccountTest{
	public static void main(String args[])
	{
		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("�̸��� " + obj.getName() + "���� �ܰ�� " + obj.getBalance() + "�Դϴ�.");
		Scanner ii = new Scanner(System.in);
		System.out.println("�Ա��� �ݾ� : ");
		int in = ii.nextInt();
		obj.deposit(in);
		System.out.println("���� �ܰ�� " + obj.getBalance() + "�Դϴ�.");
	}
}
