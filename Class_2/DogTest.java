class Animal {
	void eat() {
		System.out.println("�԰� ����");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("�۸� ¢�� ����");
	}
}

public class DogTest {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}
