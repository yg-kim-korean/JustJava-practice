package Ch6;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

//Date�� Calendar Ŭ���� Ȱ���ϱ�
public class Ch6Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date();
		Date date2 = new Date(51861513);
		System.out.println(date1);
		System.out.println(date2);
		
		System.out.println("date1 date2 ��" + date1.compareTo(date2));
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT + 2"));
		System.out.println("�ð� : "+cal.get(Calendar.HOUR_OF_DAY)+ ":" + cal.get(Calendar.MINUTE));
	}

}
