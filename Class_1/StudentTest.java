class Student{
	String name;//Ŭ���� ����
	int no; //Ŭ���� ����
	static int cnt;
	
	public Student (String name, int no){
		this.name=name; this.no=no;
		cnt++;
	}
	
	public void print(){
		System.out.println(name+", "+ no);
	}
	
	public static void Count() {
		System.out.println("�ο����� "+cnt + "��");
		//name, no�� ���� Ŭ���� ������ ����� �� ����. static ����(cnt)�� ��� ����, ���������� ��밡��
	}
}
public class StudentTest {
	public static void main(String[] args){
		Student s1= new Student ("ȫ�浿", 201901);
		Student s2= new Student ("������", 201903);
		
		s1.print();
		s2.print();
		Student.Count();//Ŭ�����̸�.�޼ҵ�
		
		//System.out.println("\n"+s1.name+s1.no);
		//System.out.println(s2.name+s2.no);
		//System.out.println("�л� ���� "+Student.cnt+"��");
	}
}
