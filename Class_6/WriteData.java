import java.io.*;

public class WriteData {
	public static void main(String args[]) throws IOException {
		File f = new File("scores.txt");
		if(f.exists()){
			System.out.println("File already exists");
			System.exit(0);			
		}
		PrintWriter output = new PrintWriter(f);
		output.print("��ǻ�� "); output.print("ȫ�浿 "); output.println(90);
		output.print("��ǻ�� "); output.print("������ "); output.println(85);
		output.close();
	}
}
