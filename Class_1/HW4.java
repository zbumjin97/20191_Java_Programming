class Plane {
	private String company;
	private String model;
	private int maxnumber;
	static int planes;
	public Plane (String company, String model, int maxnumber){
		this.company = company;
		this.model = model;
		this.maxnumber = maxnumber;
		planes++;
	}
	public String getModel(){
		return model;
	}
	public int getMaxnumber(){
		return maxnumber;
	}
	public static int getPlanes(){
		return planes;
	}
}

public class HW4 {
	public static void main(String args[])
	{
		Plane p1 = new Plane("´ëÇÑÇ×°ø", "A123", 500);
		System.out.println("½Äº°¹øÈ£ : " + Plane.getPlanes() + " ¸ðµ¨ : " + p1.getModel() + " ½Â°´¼ö : " + p1.getMaxnumber());
		Plane p2 = new Plane("¾Æ½Ã¾Æ³ª", "B456", 600);
		System.out.println("½Äº°¹øÈ£ : " + Plane.getPlanes() + " ¸ðµ¨ : " + p2.getModel() + " ½Â°´¼ö : " + p2.getMaxnumber());
		Plane p3 = new Plane("Æ¼¿þÀÌ", "C789", 300);
		System.out.println("½Äº°¹øÈ£ : " + Plane.getPlanes() + " ¸ðµ¨ : " + p3.getModel() + " ½Â°´¼ö : " + p3.getMaxnumber());
	}
}
