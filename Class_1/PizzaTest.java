class Pizza
{
	private String toppings;
	static int count = 0;
	public Pizza(String toppings){
		this.toppings = toppings;
		count++;
	}
}
public class PizzaTest {
	public static void main(String args[])
	{
		Pizza p1 = new Pizza("Super Supreme");
		Pizza p2 = new Pizza("Cheese");
		Pizza p3 = new Pizza("pepperoni");
		int n = Pizza.count;
		System.out.println("���ݱ��� �Ǹŵ� ���� ���� = " + n);
	}
}
