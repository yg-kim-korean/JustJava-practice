package Ch5;
//����� ���� �����ڿ� �����ϵ��� Helloworld �����ϱ�
public class HelloWorld2 {
	String msg;
	
	public HelloWorld2() {
		msg = "Hello World !!";
	}
	
	public HelloWorld2(String msg) {
		this.msg = msg;
	}
	
	public void print() {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld2 hello1 = new HelloWorld2();
		hello1.print();
		HelloWorld2 hello2 = new HelloWorld2("My Hello World!!");
		hello2.print();
	}

}

