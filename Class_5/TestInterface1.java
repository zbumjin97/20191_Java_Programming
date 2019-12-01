interface Drawable1
{
	void draw();
}

class Circle implements Drawable1
{
	int radius;
	public void draw()
	{
		System.out.println("Circle Draw");
	}
}

public class TestInterface1
{  
	public static void main(String args[])
	{  
		Drawable1 obj = new Circle();
		obj.draw();  
	}
}