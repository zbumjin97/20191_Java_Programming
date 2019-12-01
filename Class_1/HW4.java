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
		Plane p1 = new Plane("�����װ�", "A123", 500);
		System.out.println("�ĺ���ȣ : " + Plane.getPlanes() + " �� : " + p1.getModel() + " �°��� : " + p1.getMaxnumber());
		Plane p2 = new Plane("�ƽþƳ�", "B456", 600);
		System.out.println("�ĺ���ȣ : " + Plane.getPlanes() + " �� : " + p2.getModel() + " �°��� : " + p2.getMaxnumber());
		Plane p3 = new Plane("Ƽ����", "C789", 300);
		System.out.println("�ĺ���ȣ : " + Plane.getPlanes() + " �� : " + p3.getModel() + " �°��� : " + p3.getMaxnumber());
	}
}
