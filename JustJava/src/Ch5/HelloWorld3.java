package Ch5;
//�޼��� �����ε� ����� �����Ͽ� ������ �߰��ϱ�
public class HelloWorld3{
	String msg;
	
	public HelloWorld3() {
		msg = "Hello World !!";
	}
	
	public HelloWorld3(String msg) {
		this.msg = msg;
	}
	
	public HelloWorld3(String msg, int option) {
		if (option == 1) 
			this.msg = msg;
		else if(option==2)
			this.msg = msg + ", �ȳ��ϼ���?";
	}
	
	public void print() {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld3 hello1 = new HelloWorld3();
		hello1.print();
		HelloWorld3 hello2 = new HelloWorld3("My Hello World!!");
		hello2.print();
		HelloWorld3 hello3 = new HelloWorld3("Hello",2);
		hello3.print();
	}

}

