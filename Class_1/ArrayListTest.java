import java.util.ArrayList;

class Person{
	String name;
	String tel;
	
	public Person(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}

public class ArrayListTest {
	public static void main(String[] args){
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("ȫ�浿","01012345678"));
		list.add(new Person("������","01012345679"));
		list.add(new Person("���ڿ�","01012345680"));
		list.add(new Person("�迵��","01012345681"));
		
		for (Person obj : list)
			System.out.println("(" +obj.name+ "," +obj.tel + ")");
		
	}
}
