package Ch6;

import java.util.Scanner;

//키보드 입력을 ㅓ리하는 Scanner 클래스 사용하기
public class Ch6Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String msg = scan.next();
		System.out.println("입력 : "+msg);
		int num = scan.nextInt();
		System.out.println("입력 : "+num);
	}

}
