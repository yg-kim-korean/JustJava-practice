package Ch5_IShop;
//product Ŭ������ ��ӹ��� SmartTV Ŭ���� ����
public class SmartTV extends Product{
	String resolution; //�ػ�
	public SmartTV(String Pname, int price, String resolution) {
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
		
	}
	@Override
	public void printExtra() {
		System.out.println("��Ż� : "+ resolution);
	}
}
