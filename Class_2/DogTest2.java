class Animall {
	public void eat() {
		System.out.println("������ �԰� �ֽ��ϴ�.");
	}
}

class Dogg extends Animall {
	public void eat() {
		//super.eat();
		System.out.println("�������� �԰� �ֽ��ϴ�.");
	}
}

public class DogTest2 {
	public static void main(String args[]) {
		Dogg d = new Dogg();
		d.eat();
	}
}
