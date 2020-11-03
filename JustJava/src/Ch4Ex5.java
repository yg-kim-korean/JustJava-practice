//클래스 변수와 인스턴스 변수 사용하기
public class Ch4Ex5 {
	static int num1 = 10;
	int num2 = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch4Ex5 ex1 = new Ch4Ex5();
		Ch4Ex5 ex2 = new Ch4Ex5();
		
		ex1.num1 = 20;
		ex2.num1 = 30;
		
		System.out.println("ex1.nnum1 = " + ex1.num1);
		System.out.println("ex2.nnum1 = " + ex2.num1);

		ex1.num2 = 30;
		ex2.num2 = 50;
		
		System.out.println("ex1.nnum2 = " + ex1.num2);
		System.out.println("ex2.nnum2 = " + ex2.num2);

	}

}
