import java.util.Scanner;

public class DivideByZero {
	public static void main(String args[]){
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("������: ");
		x = sc.nextInt();
		System.out.print("����: ");
		y = sc.nextInt();
		int result = x / y;
		System.out.println("������ ���: " + result);
	}
}
