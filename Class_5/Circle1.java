interface Printable
{
	void print();
}

interface Drawable2
{
	void draw();
}

public class Circle1 implements Printable, Drawable2
{
	public void print()
	{
		System.out.println("�����ͷ� ���� ����մϴ�.");
	}
	public void draw()
	{
		System.out.println("ȭ�鿡 ���� �׸��ϴ�.");
	}
	public static void main(String args[])
	{
		Circle1 obj = new Circle1();
		obj.print();
		obj.draw();
	}
}