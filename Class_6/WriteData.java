import java.io.*;

public class WriteData {
	public static void main(String args[]) throws IOException {
		File f = new File("scores.txt");
		if(f.exists()){
			System.out.println("File already exists");
			System.exit(0);			
		}
		PrintWriter output = new PrintWriter(f);
		output.print("컴퓨터 "); output.print("홍길동 "); output.println(90);
		output.print("컴퓨터 "); output.print("일지매 "); output.println(85);
		output.close();
	}
}
