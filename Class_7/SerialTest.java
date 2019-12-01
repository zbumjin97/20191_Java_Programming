import java.io.*;
import java.util.*;

class Person implements Serializable
{
	private String name;
	private String s_No; //직렬화 대상 포함
	//private transient String s_No;//직렬화 대상에서 제외
	public int age;
	public Person(String name, String s_No, int age){
		this.name = name;
		this.s_No = s_No;
		this.age = age;
	}
	public String toString(){
		return  "("+name+","+s_No+","+age+")";
	}
}

public class SerialTest
{
	static final String info = "user.txt";
	public static void main(String[] args)
	{
		serial();
		Deserial();
	}
	public static void serial()
	{
		try {
			FileOutputStream fos = new FileOutputStream(info);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream out = new ObjectOutputStream(bos);

			Person p1 = new Person("홍길동", "861225", 22);
			Person p2 = new Person("일지매", "870101" ,21);
			ArrayList list = new ArrayList<>();
			list.add(p1);
			list.add(p2);
			
			out.writeObject(p1);
			out.writeObject(p2);
			out.writeObject(list);
			out.close();
			System.out.println("직렬화 완료");
		} catch(Exception e){ e.printStackTrace( ); }
	}
	  
	private static void Deserial()
	{
		try {
			FileInputStream fis = new FileInputStream(info);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);

			Person p1 = (Person)in.readObject();
			Person p2 = (Person)in.readObject();
			ArrayList list = (ArrayList)in.readObject();

			System.out.println(p1);
			System.out.println(p2);
			System.out.println("count = " + list.size());
			System.out.println(list);
			in.close();
		} catch(Exception e) { e.printStackTrace(); }
   }
}