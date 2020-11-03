package Ch5_IShop;
//product 클래스를 상속받은 SmartTV 클래스 구현
public class SmartTV extends Product{
	String resolution; //해상도
	public SmartTV(String Pname, int price, String resolution) {
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
		
	}
	@Override
	public void printExtra() {
		System.out.println("통신사 : "+ resolution);
	}
}
