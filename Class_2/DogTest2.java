class Animall {
	public void eat() {
		System.out.println("동물이 먹고 있습니다.");
	}
}

class Dogg extends Animall {
	public void eat() {
		//super.eat();
		System.out.println("강아지가 먹고 있습니다.");
	}
}

public class DogTest2 {
	public static void main(String args[]) {
		Dogg d = new Dogg();
		d.eat();
	}
}
