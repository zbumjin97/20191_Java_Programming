class BankAccount
{
	int balance;
	public BankAccount(int balance){
		this.balance = balance;
	}
	public int transfer(int amount, BankAccount OtherAccount)
	{
		this.balance -= amount;
		OtherAccount.balance += amount;
		return 0;
	}
	
}
public class HW5 {
	public static void main(String args[])
	{
		BankAccount ba1 = new BankAccount(10000);
		BankAccount ba2 = new BankAccount(0);
		System.out.println("myAccount1 : 현재 잔액은 " + ba1.balance + "입니다.");
		System.out.println("myAccount2 : 현재 잔액은 " + ba2.balance + "입니다.");
		System.out.println("transfer(1000)");
		ba1.transfer(1000, ba2);
		System.out.println("myAccount1 : 현재 잔액은 " + ba1.balance + "입니다.");
		System.out.println("myAccount2 : 현재 잔액은 " + ba2.balance + "입니다.");
	}
}
