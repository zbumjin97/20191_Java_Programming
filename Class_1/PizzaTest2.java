class Pizza2{
	int radius;
	
	Pizza2(int r){
		radius = r;
	}
	//Pizza2 whosLargest(Pizza2 p1, Pizza2 p2){
	Pizza2 whosLargest(Pizza2 p2){
		//if(p1.radius>p2.radius)
		if(radius>p2.radius)	
			//return p1;
			return this;
		else
			return p2;
	}
}
public class PizzaTest2 {
	public static void main(String[] args){
		Pizza2 obj1= new Pizza2(14);
		Pizza2 obj2= new Pizza2(18);
		
		//Pizza2 largest = obj1.whosLargest(obj1,obj2);
		Pizza2 largest = obj1.whosLargest(obj2);
		System.out.println(largest.radius + "��ġ ���ڰ� �� ŭ.");
	}
}
