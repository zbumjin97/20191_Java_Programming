import java.util.Scanner;
import java.util.StringTokenizer;

public class HW4 {
	public static void main(String args[]){
		System.out.print("���ڿ��� �Է��Ͻÿ�: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(s, " ");
		int i = st.countTokens();
		while(st.hasMoreTokens()){
			System.out.print(st.nextToken() + ",");
		}
		System.out.println();
		System.out.println("��� " + i + "���� �ܾ �ֽ��ϴ�.");
	}
}
