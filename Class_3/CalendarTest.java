import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String args[]){
		Calendar d = Calendar.getInstance();
		System.out.println(d);
		System.out.println(d.get(Calendar.YEAR)+"��");
		System.out.println(d.get(Calendar.MONTH)+1+"��");
		System.out.println(d.get(Calendar.DATE)+"��");
		d.set(Calendar.HOUR, 12);
		d.set(Calendar.MINUTE, 34);
		d.set(Calendar.SECOND, 0);
		System.out.println(d);
		
		SimpleDateFormat cf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("��¥ ���� : " + cf.format(d.getTime()));
		SimpleDateFormat cf2 = new SimpleDateFormat("yy-MMM-dd");
		System.out.println("��¥ ���� : " + cf2.format(d.getTime()));
		// HH ��, mm ��, ss ��, sss �и���
	}
}
