package Ch5;
//메인이 빠진 헬로월드 프로그램 만들기
public class HelloWorld6 {
	private String msg;
	static int count = 0;
	static String prefix = "";
	
	public HelloWorld6() {
		msg = "Hello World !!";
	}
	
	public HelloWorld6(String msg) {
		this.msg = msg;
	}
	
	public HelloWorld6(String msg, int option) {
		if (option == 1) 
			this.msg = msg;
		else if(option==2)
			this.msg = msg + ", 안녕하세요?";
	}
	
	public void print() {
		//System.out.println(msg);
		count++;
		System.out.println("["+count+"]"+prefix+msg);
		
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
