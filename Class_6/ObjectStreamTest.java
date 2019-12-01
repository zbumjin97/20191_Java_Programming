import java.io.*;
import java.util.Date;

public class ObjectStreamTest {
	public static void main(String args[]) throws IOException{
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(new FileOutputStream("object.dat"));
			out.writeObject(new Date());
			out.flush();
			in = new ObjectInputStream(new FileInputStream("object.dat"));
			Date d = (Date) in.readObject();
			System.out.println(d);
		} catch(ClassNotFoundException e){
			
		} finally {
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}
	}
}
