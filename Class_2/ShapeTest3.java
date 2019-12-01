import java.util.*;

abstract class Shape3 {
	public abstract void area(int x, int y);
	//public void kkk() {this.x;}
}

class Rectangle3 extends Shape3 {
	private int width, height;
	public void area(int w, int h) {
		width = w;
		height = h;
		System.out.println("사각형 면적 : " + width*height);
	}
}

class Circle4 extends Shape3 {
	private int radius;
	public void area(int r, int not) {
		radius = r;
		System.out.println("원 면적 : " + Math.pow(radius,2)*Math.PI);
	}
}

public class ShapeTest3 {
	public static void main(String args[]) {
		Rectangle3 r = new Rectangle3();
		Circle4 c = new Circle4();
		r.area(2,3);
		c.area(5);
	}
}
