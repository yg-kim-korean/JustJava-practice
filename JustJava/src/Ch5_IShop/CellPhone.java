package Ch5_IShop;
//product 클래스를 상속받은 Cellphone 클래스 구현
public class CellPhone extends Product{
	String carrier; //통신사
	public CellPhone(String Pname, int price, String carrier) {
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
		
	}
	@Override
	public void printExtra() {
		System.out.println("통신사 : "+ carrier);
	}
}
