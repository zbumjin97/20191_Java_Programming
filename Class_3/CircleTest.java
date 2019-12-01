class Circle {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public String toString() {
		return "Circle(r = " + radius + ")";
	} // overwriting
}
public class CircleTest {
	public static void main(String args[]) {
		Circle obj1 = new Circle(10);
		Circle obj2 = new Circle(20);
		System.out.println(obj1.toString());
		System.out.println(obj2);
	}
}
