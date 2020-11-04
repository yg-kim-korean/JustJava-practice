package Ch6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//�پ��� ��¥ ���� ������ �����Ͽ� ����ϴ� ���α׷� �����
public class Ch6Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		DateFormat df1 = DateFormat.getInstance();
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("DateFormat �⺻ : " + df1.format(date));
		System.out.println("DateFormat Long : " + df2.format(date));
		System.out.println("DateFormat Timezone : " + df1.getTimeZone().getID());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd, hh:mm:a");
		System.out.println("SimpleDateFormat �⺻ : " + sdf1.format(date));
		System.out.println("SimpleDateFormat ���� : " + sdf2.format(date));
		sdf1.applyPattern("yyyy�� MM/dd");
		System.out.println("SimpleDateFormat ���� : " + sdf1.format(date));
	}
}
