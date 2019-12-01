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
		System.out.println("프린터로 원을 출력합니다.");
	}
	public void draw()
	{
		System.out.println("화면에 원을 그립니다.");
	}
	public static void main(String args[])
	{
		Circle1 obj = new Circle1();
		obj.print();
		obj.draw();
	}
}