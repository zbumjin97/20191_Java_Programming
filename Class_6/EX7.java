import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class EX7 {
	public static void main(String args[]) throws Exception{
		File f = new File("EX7.txt");
		
		if(f.exists()){
			System.out.println("File already exists");
			System.exit(0);			
		}
		PrintWriter output = new PrintWriter(f);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt(); output.print(number + " ");
		String Name = sc.next(); output.print(Name + " ");
		String phone = sc.next(); output.print(phone + " ");
		String email = sc.next(); output.print(email);
		output.println();
		
		int number2 = sc.nextInt(); output.print(number2 + " ");
		String Name2 = sc.next(); output.print(Name2 + " ");
		String phone2 = sc.next(); output.print(phone2 + " ");
		String email2 = sc.next(); output.print(email2);
		output.close();
		
		System.out.print("번호를 입력하시오: ");
		int c = sc.nextInt();
		sc.close(); 
		Scanner input = new Scanner(f);
		if(c == number) System.out.println(phone);
		else if(c == number2) System.out.println(phone2);
		input.close();
		
		
	}
}
