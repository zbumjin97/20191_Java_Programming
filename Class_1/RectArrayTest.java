class Rect{
	int width, height;
	
	public Rect(int w, int h){
		width=w;
		height=h;
	}
	double calcArea(){ return (double) width*height;}
}

public class RectArrayTest {
	public static void main(String[] args){
		Rect[] list;
		list = new Rect[5];
		
		for (int i=0; i<list.length;i++)
			list[i] = new Rect(i,i);
		
		for (int i=0; i<list.length;i++)
			System.out.println(i+"��° �簢���� ����"+list[i].calcArea());
	}
}
