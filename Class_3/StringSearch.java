
public class StringSearch {
	public static void main(String args[]){
		String s = "È«±æµ¿";
		int index = s.indexOf("È«");
		if(index == 0)
			System.out.println("È«¾¾ÀÔ´Ï´Ù.");
		else
			System.out.println("È«¾¾°¡ ¾Æ´Õ´Ï´Ù.");
	}
}
