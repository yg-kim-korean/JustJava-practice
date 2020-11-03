package Ch5_IShop;
//IShop 인터페이스를 구현한 MyShop 클래스

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {
	//클래스 선언부 구현
	
	//등록회원 정보 배열
	User[] users = new User[2];
	
	//등록상품 정보 배열
	Product[] products = new Product[4];
	
	//상품을 추가할수 있는 바구니
	ArrayList<Product> cart = new ArrayList<Product>();
	
	//키보드 입력으로 문자열 받는 Scanner 객체 생성
	Scanner scan = new Scanner(System.in);
	
	//선택한 사용자의 인덱스 보관
	int selUser;
	
	//쇼핑몰 이름
	String title;
	
	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title;
	}
	//사용자 정보를 생성하는 메서드
	@Override
	public void genUser() {
		// TODO Auto-generated method stub
		User user = new User("홍길동", PayType.CARD);
		users[0] = user;
		user = new User("블로거", PayType.CARD);
		users[1] = user;
	}
	//상품정보를 생성하는 메서드
	@Override
	public void genProduct() {
		// TODO Auto-generated method stub
		CellPhone cp = new CellPhone("갤5", 10000000, "SKT");
		products[0] = cp;
		cp = new CellPhone("아이폰 7", 12000000, "KT");
		products[1] = cp;
		SmartTV st = new SmartTV("삼숭", 50020231, "4k");
		products[2] = st;
		st = new SmartTV("LG", 212213123, "Full HD");
		products[3] = st;
	}
	//쇼핑몰 프로그램의 메인 기능인 start 메서드
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(title + " : 메인 화면 - 계정 선택");
		System.out.println("===========================");
		int i = 0;
		//등록한 사용자 정보 출력
		for (User u : users) {
			System.out.printf("[%d]%s(%s)\n",i++,u.getName(),u.getPayType());
		}
		
		System.out.println("[x]종 료");
		System.out.println("선택 : ");
		String sel = scan.next();
		System.out.println("## " + sel + "선택 ##");
		
		//선택한 메뉴에 따라 처리
		switch(sel) {
			case "x" : System.exit(0);break;
			default:
				selUser = Integer.parseInt(sel);
				productList();
		}
	}
	//상품 목록을 출력하는 메서드
	public void productList() {
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("===========================");
		int i = 0;
		//등록한 상품 정보 출력
		for (Product p : products) {
			System.out.println("["+ i +"]");
			p.printDetail();
			i++;
		}
		System.out.println("[h]메인화면");
		System.out.println("[c]체크아웃");
		System.out.println("선택 : ");
		String sel = scan.next();
		System.out.println("## " + sel + "선택 ##");
		
		switch(sel) {
		case "h" : start();break;
		case "c" : checkOut();break;
		default:
			int psel = Integer.parseInt(sel);
			cart.add(products[psel]);
			productList();
		}
	}
	
	//상품결제 메서드 
	public void checkOut() {
		System.out.println(title + " : 체크아웃");
		System.out.println("===========================");
		int i = 0;
		int total = 0;
		//장바구니에 등록한 상품 정보 출력
		for (Product p : cart) {
			System.out.printf("[%d]%s(%s)\n",i++,p.pname,p.price);
			total = total+p.price;
		}
		System.out.println("===========================");
		//선택한 사용자의 결제방법 출력
		System.out.println("결제 방법 : "+users[selUser].getPayType());
		//합계출력
		System.out.println("합계 : " + total+" 원 입니다.");
		System.out.println("[p]이전, [q]결제 완료");
		System.out.println("선택 : ");
		String sel = scan.next();
		
		switch(sel) {
		case "q" : 
			System.out.println("## 결제가 완료 되었습니다. 종료합니다 ##");
			System.exit(0);break;
		case "p" : productList();break;
		default:
			checkOut();
		}
		
	}

}
