package Ch5;
//��ü���� ������ �����Ͽ� Hellowolrd �����ϱ�
public class HelloWorld {
	String msg;
	
	public HelloWorld() {
		msg = "Hello World !!";
	}
	
	public void print() {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hello1 = new HelloWorld();
		hello1.print();
	}

}
