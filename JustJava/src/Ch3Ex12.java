
public class Ch3Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		while(num > 10) {
			System.out.println(num--);
		}
		boolean flag = true;
		while (flag) {
			num--;
			if (num ==3) {
				flag = false;
				System.out.println("num=3 ����!");
			}
		}

	}

}
