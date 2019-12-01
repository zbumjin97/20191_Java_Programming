class Circle2 {
	int radius;
	public Circle2(int radius) {
		this.radius = radius;
	}
	public boolean equals(Circle2 c1) {
		if(radius == c1.radius) return true;
		else return false;
	}
}

class Rectangle {
	int height, width;
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	public boolean equals(Rectangle r1) {
		if(height == r1.height && width == r1.width) return true;
		else return false;
	}
}

public class CircleTest2 {
	public static void main(String args[]) {
		Circle2 obj1 = new Circle2(10);
		Circle2 obj2 = new Circle2(10);
		if(obj1.equals(obj2)) System.out.println("2���� ���� �����ϴ�.");
		else System.out.println("2���� ���� ���� �ʽ��ϴ�.");
		Rectangle obj3 = new Rectangle(20,30);
		Rectangle obj4 = new Rectangle(20,30);
		if(obj3.equals(obj4)) System.out.println("2���� �簢���� �����ϴ�.");
		else System.out.println("2���� �簢���� ���� �ʽ��ϴ�.");
	}
}
