import java.io.*;
import java.util.Scanner;

public class ByteStreamLab {
	public static void main (String args[]) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �̸��� �Է��Ͻÿ�.: ");
		String inputFileName = scan.next();
		System.out.print("���� ���� �̸��� �Է��Ͻÿ�.: ");
		String outputFileName = scan.next();
		try(InputStream inputStream = new FileInputStream(inputFileName);
				OutputStream outputStream = new FileOutputStream(outputFileName)){
			int c;
			while((c = inputStream.read()) != -1)
				outputStream.write(c);
		}
		System.out.println(inputFileName + "��" + outputFileName + "�� �����Ͽ����ϴ�.");
	}
}
