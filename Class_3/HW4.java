import java.util.Scanner;
import java.util.StringTokenizer;

public class HW4 {
	public static void main(String args[]){
		System.out.print("문자열을 입력하시요: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(s, " ");
		int i = st.countTokens();
		while(st.hasMoreTokens()){
			System.out.print(st.nextToken() + ",");
		}
		System.out.println();
		System.out.println("모두 " + i + "개의 단어가 있습니다.");
	}
}
