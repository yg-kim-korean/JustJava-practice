package Ch6;
//String Ŭ������ �ֿ� �޼��� ����ϱ�
public class Ch6Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		
		//String str4  = new String(30); ���� ó���ϸ�,
		//���������� �����ʾ� ���� �߻���
		String str4 = String.valueOf(30);
		
		String num1 = "20";
		
		if (str1==str2)
			System.out.println("str1 == str2");
		else
			System.out.println("str1 != str2");
		
		if (str1==str3)
			System.out.println("str1 == str3");
		else
			System.out.println("str1 != str3");
		
		if (str1.equals(str3))
			System.out.println("str1 == str3");
		else
			System.out.println("str1 != str3");
		
		
		System.out.println("num1+30 = "+ num1+30);
		System.out.println("st1_length : " + str1.length());
		System.out.println("str1 4��° ���� : "+ str1.charAt(3));
		System.out.println("str1�� 2~4�� �ִ� ����" + str1.substring(1,4));
		System.out.println("str1�� l�� k�� : " + str1.replace('l', 'k'));
		
	}

}
