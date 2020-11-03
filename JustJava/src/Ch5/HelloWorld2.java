package Ch5;
//출력할 값을 생성자에 전달하도록 Helloworld 수정하기
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

