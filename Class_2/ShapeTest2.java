class Shape2 {
	protected int x, y;
	public void draw() {
		System.out.println("Shape Draw");
	}
}
class Rectangle2 extends Shape {
	private int width, height;
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}
class Triangle extends Shape {
	private int base, height;
	public void draw() {
		System.out.println("Triangle Draw");
	}
}
class Circle3 extends Shape {
	private int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}
}
public class ShapeTest2 {
	public static void main(String args[]) {
		Shape2 s1 = new Shape2();
		Shape s2 = new Rectangle2();
		s1.draw();
		s2.draw();
		s1.x = 0;
		s1.y = 0;
	}
}
