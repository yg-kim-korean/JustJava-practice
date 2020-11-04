package Ch6;

import java.util.Random;

//난수를 처리하는 Random 클래스 활용하기
public class Ch6Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		Random r2 = new Random(123);
		Random r3 = new Random(123);
		Random r4 = new Random(System.currentTimeMillis());
		
		System.out.println("## 기본난수 출력 ##");
		System.out.println("r1 : " + r1.nextInt(10));
		System.out.println("r2 : " + r2.nextInt(10));
		System.out.println("r3 : " + r3.nextInt(10));
		System.out.println("r4 : " + r4.nextInt(10));
		
		System.out.println("## 범위 난 수 출력 ##");
		System.out.println("1~20 : "  + (r1.nextInt(20)+1));
	}

}
