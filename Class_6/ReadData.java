import java.io.File;
import java.util.Scanner;

public class ReadData {
	public static void main(String args[]) throws Exception{
		File f = new File("scores.txt");
		Scanner input = new Scanner(f);
		while(input.hasNext()){
			String subject = input.next();
			String Name = input.next();
			int score = input.nextInt();
			System.out.println(subject + " " + Name + " " + score);
		}
		input.close();
	}
}
