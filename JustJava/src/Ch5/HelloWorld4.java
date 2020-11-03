package Ch5;
//getter/setter를 HelloWorld에 적용하기
public class HelloWorld4{
	private String msg;
	
	public HelloWorld4() {
		msg = "Hello World !!";
	}
	
	public HelloWorld4(String msg) {
		this.msg = msg;
	}
	
	public HelloWorld4(String msg, int option) {
		if (option == 1) 
			this.msg = msg;
		else if(option==2)
			this.msg = msg + ", 안녕하세요?";
	}
	
	public void print() {
		System.out.println(msg);
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld4 hello1 = new HelloWorld4();
		hello1.print();
		HelloWorld4 hello2 = new HelloWorld4("My Hello World!!");
		hello2.print();
		HelloWorld4 hello3 = new HelloWorld4("Hello",2);
		hello3.print();
		
		hello2.setMsg("반갑습니다!");
		System.out.println(hello2.getMsg());
	}

}

