package Ch5;
//��°� �����ϴ� HelloWold �����
public class HelloWorld5{
	private String msg;
	static int count = 0;
	static String prefix = "";
	
	public HelloWorld5() {
		msg = "Hello World !!";
	}
	
	public HelloWorld5(String msg) {
		this.msg = msg;
	}
	
	public HelloWorld5(String msg, int option) {
		if (option == 1) 
			this.msg = msg;
		else if(option==2)
			this.msg = msg + ", �ȳ��ϼ���?";
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld5 hello1 = new HelloWorld5();
		hello1.print();
		HelloWorld5 hello2 = new HelloWorld5("My Hello World!!");
		hello2.print();
		HelloWorld5 hello3 = new HelloWorld5("Hello",2);
		hello3.print();
		
		hello2.setMsg("�ݰ����ϴ�!");
		System.out.println(hello2.getMsg());
		
		HelloWorld5.prefix = "Greetings : ";
		hello2.print();
		hello3.print();
		
		HelloWorld5.prefix = "�λ縻 : ";
		hello2.print();
		hello3.print();
	}

}

