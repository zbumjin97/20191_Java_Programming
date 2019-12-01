import java.io.*;

public class CopyFile1 {
	public static void main(String args[]) throws IOException{
		try(FileReader in = new FileReader("scores.txt");
				FileWriter out = new FileWriter("copy.txt")){
					int c;
					while((c = in.read()) != -1)
						out.write(c);
				}
	}
}
