class Outer {
	private int num;
	
	class Inner {
		public void print() {
			System.out.println("����� ���� Ŭ�����Դϴ�.");
			System.out.println("num = " + num);
		}
	}
	void display() {
		Inner obj = new Inner();
		obj.print();
		System.out.println("num = " + num);
	}
}
public class InnerTest {
	public static void main(String args[])
	{
		Outer obj = new Outer();
		obj.display();
	}
}
