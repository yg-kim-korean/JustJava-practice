package Ch5;
//객체지향 개념을 적용하여 Hellowolrd 변경하기
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
