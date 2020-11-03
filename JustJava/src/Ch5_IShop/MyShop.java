package Ch5_IShop;
//IShop �������̽��� ������ MyShop Ŭ����

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {
	//Ŭ���� ����� ����
	
	//���ȸ�� ���� �迭
	User[] users = new User[2];
	
	//��ϻ�ǰ ���� �迭
	Product[] products = new Product[4];
	
	//��ǰ�� �߰��Ҽ� �ִ� �ٱ���
	ArrayList<Product> cart = new ArrayList<Product>();
	
	//Ű���� �Է����� ���ڿ� �޴� Scanner ��ü ����
	Scanner scan = new Scanner(System.in);
	
	//������ ������� �ε��� ����
	int selUser;
	
	//���θ� �̸�
	String title;
	
	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title;
	}
	//����� ������ �����ϴ� �޼���
	@Override
	public void genUser() {
		// TODO Auto-generated method stub
		User user = new User("ȫ�浿", PayType.CARD);
		users[0] = user;
		user = new User("��ΰ�", PayType.CARD);
		users[1] = user;
	}
	//��ǰ������ �����ϴ� �޼���
	@Override
	public void genProduct() {
		// TODO Auto-generated method stub
		CellPhone cp = new CellPhone("��5", 10000000, "SKT");
		products[0] = cp;
		cp = new CellPhone("������ 7", 12000000, "KT");
		products[1] = cp;
		SmartTV st = new SmartTV("���", 50020231, "4k");
		products[2] = st;
		st = new SmartTV("LG", 212213123, "Full HD");
		products[3] = st;
	}
	//���θ� ���α׷��� ���� ����� start �޼���
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(title + " : ���� ȭ�� - ���� ����");
		System.out.println("===========================");
		int i = 0;
		//����� ����� ���� ���
		for (User u : users) {
			System.out.printf("[%d]%s(%s)\n",i++,u.getName(),u.getPayType());
		}
		
		System.out.println("[x]�� ��");
		System.out.println("���� : ");
		String sel = scan.next();
		System.out.println("## " + sel + "���� ##");
		
		//������ �޴��� ���� ó��
		switch(sel) {
			case "x" : System.exit(0);break;
			default:
				selUser = Integer.parseInt(sel);
				productList();
		}
	}
	//��ǰ ����� ����ϴ� �޼���
	public void productList() {
		System.out.println(title + " : ��ǰ ��� - ��ǰ ����");
		System.out.println("===========================");
		int i = 0;
		//����� ��ǰ ���� ���
		for (Product p : products) {
			System.out.println("["+ i +"]");
			p.printDetail();
			i++;
		}
		System.out.println("[h]����ȭ��");
		System.out.println("[c]üũ�ƿ�");
		System.out.println("���� : ");
		String sel = scan.next();
		System.out.println("## " + sel + "���� ##");
		
		switch(sel) {
		case "h" : start();break;
		case "c" : checkOut();break;
		default:
			int psel = Integer.parseInt(sel);
			cart.add(products[psel]);
			productList();
		}
	}
	
	//��ǰ���� �޼��� 
	public void checkOut() {
		System.out.println(title + " : üũ�ƿ�");
		System.out.println("===========================");
		int i = 0;
		int total = 0;
		//��ٱ��Ͽ� ����� ��ǰ ���� ���
		for (Product p : cart) {
			System.out.printf("[%d]%s(%s)\n",i++,p.pname,p.price);
			total = total+p.price;
		}
		System.out.println("===========================");
		//������ ������� ������� ���
		System.out.println("���� ��� : "+users[selUser].getPayType());
		//�հ����
		System.out.println("�հ� : " + total+" �� �Դϴ�.");
		System.out.println("[p]����, [q]���� �Ϸ�");
		System.out.println("���� : ");
		String sel = scan.next();
		
		switch(sel) {
		case "q" : 
			System.out.println("## ������ �Ϸ� �Ǿ����ϴ�. �����մϴ� ##");
			System.exit(0);break;
		case "p" : productList();break;
		default:
			checkOut();
		}
		
	}

}
