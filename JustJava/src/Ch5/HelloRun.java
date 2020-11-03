package Ch5;
//객체지향 HelloWorld를 실행하는 런처 프로그램 만들기
public class HelloRun {
	public void go() {
		// TODO Auto-generated method stub
		HelloWorld5 hello1 = new HelloWorld5();
		hello1.print();
		HelloWorld5 hello2 = new HelloWorld5("My Hello World!!");
		hello2.print();
		HelloWorld5 hello3 = new HelloWorld5("Hello",2);
		hello3.print();
		
		hello2.setMsg("반갑습니다!");
		System.out.println(hello2.getMsg());
		
		HelloWorld5.prefix = "Greetings : ";
		hello2.print();
		hello3.print();
		
		HelloWorld5.prefix = "인사말 : ";
		hello2.print();
		hello3.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloRun hr = new HelloRun();
		hr.go();
	}	

}
