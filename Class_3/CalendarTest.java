import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String args[]){
		Calendar d = Calendar.getInstance();
		System.out.println(d);
		System.out.println(d.get(Calendar.YEAR)+"년");
		System.out.println(d.get(Calendar.MONTH)+1+"월");
		System.out.println(d.get(Calendar.DATE)+"일");
		d.set(Calendar.HOUR, 12);
		d.set(Calendar.MINUTE, 34);
		d.set(Calendar.SECOND, 0);
		System.out.println(d);
		
		SimpleDateFormat cf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("날짜 정보 : " + cf.format(d.getTime()));
		SimpleDateFormat cf2 = new SimpleDateFormat("yy-MMM-dd");
		System.out.println("날짜 정보 : " + cf2.format(d.getTime()));
		// HH 시, mm 분, ss 초, sss 밀리초
	}
}
