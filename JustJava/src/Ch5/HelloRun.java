package Ch5;
//��ü���� HelloWorld�� �����ϴ� ��ó ���α׷� �����
public class HelloRun {
	public void go() {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloRun hr = new HelloRun();
		hr.go();
	}	

}
