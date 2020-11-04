package Ch6;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

//숫자 데이터를 다양한 형식으로 출력하는 프로그램 만들기
public class Ch6Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 35.829283;
		int num2 = 340000000;
		
		NumberFormat nf1 = NumberFormat.getInstance();
		NumberFormat nf2 = NumberFormat.getIntegerInstance();
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.KOREA);
		
		System.out.println(nf1.format(num1));
		System.out.println(nf2.format(num1));
		System.out.println(nf3.format(num1));
		nf3.setMinimumIntegerDigits(3); //정수의 최고 자리수 지정하는 메서드 
		System.out.println(nf3.format(num1));
		
		DecimalFormat df1 = new DecimalFormat();
		DecimalFormat df2 = new DecimalFormat("00.####");
		System.out.println(df1.format(num2));
		System.out.println(df1.format(num1));
		df2.applyPattern("00.##"); // 소수점 2자리로 변경하고 출력결과를 반올림.
		System.out.println(df2.format(num1));
		
	}

}
