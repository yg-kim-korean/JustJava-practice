package Ch5_IShop;
//User Ŭ���� ����
public class User {
	//����� �̸�
	private String name;
	
	//���� ���� - enum
	private PayType payType;

	//�̸��� ���������� �Ķ���ͷ� ������ ������
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
