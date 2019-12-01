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
		System.out.println("이름은 " + obj.getName() + "통장 잔고는 " + obj.getBalance() + "입니다.");
		Scanner ii = new Scanner(System.in);
		System.out.println("입금할 금액 : ");
		int in = ii.nextInt();
		obj.deposit(in);
		System.out.println("통장 잔고는 " + obj.getBalance() + "입니다.");
	}
}
