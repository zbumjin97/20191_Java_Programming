abstract class Shape {
	private int x, y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw();
}

class Rectangle extends Shape {
	private int width, height;
	public void draw() {
		System.out.println("�簢�� �׸��� �޼ҵ�");
	}
}

class Circle2 extends Shape {
	private int radius;
	public void draw() {
		System.out.println("�� �׸��� �޼ҵ�");
	}
}

public class ShapeTest {
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		Circle2 c = new Circle2();
		r.draw();
		c.draw();
	}
}
