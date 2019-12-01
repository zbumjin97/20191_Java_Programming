class Student{
	String name;//클래스 변수
	int no; //클래스 변수
	static int cnt;
	
	public Student (String name, int no){
		this.name=name; this.no=no;
		cnt++;
	}
	
	public void print(){
		System.out.println(name+", "+ no);
	}
	
	public static void Count() {
		System.out.println("인원수는 "+cnt + "명");
		//name, no와 같은 클래스 변수는 사용할 수 없다. static 변수(cnt)만 사용 가능, 지역변수만 사용가능
	}
}
public class StudentTest {
	public static void main(String[] args){
		Student s1= new Student ("홍길동", 201901);
		Student s2= new Student ("일지매", 201903);
		
		s1.print();
		s2.print();
		Student.Count();//클래스이름.메소드
		
		//System.out.println("\n"+s1.name+s1.no);
		//System.out.println(s2.name+s2.no);
		//System.out.println("학생 수는 "+Student.cnt+"명");
	}
}
