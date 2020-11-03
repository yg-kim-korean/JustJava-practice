package Ch5_IShop;
//User 클래스 구현
public class User {
	//사용자 이름
	private String name;
	
	//결제 유형 - enum
	private PayType payType;

	//이름과 결제정보를 파라미터로 가지는 생성자
	public User(String name, PayType payType) {
		this.name = name;
		this.payType = payType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PayType getPayType() {
		return payType;
	}

	public void setPayType(PayType payType) {
		this.payType = payType;
	}
	
	
}
