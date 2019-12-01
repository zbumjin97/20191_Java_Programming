
public class TokenTest {
	public static void main(String args[]){
		String[] tokens = "2019-05-03".split("-");
		for(String token : tokens) {
			System.out.println(token);
		}
		System.out.println(tokens[0]+"년");
		System.out.println(tokens[1]+"월");
		System.out.println(tokens[2]+"일");
		
		//StringBuffer s = new StringBuffer("Happiness depends upon ourselves");
		StringBuffer sb = new StringBuffer("10+20=");
		sb.append(10+20);
		sb.insert(0, "수식 ");
		System.out.println(sb);
	}
}
