package Ch5_IShop;
//Product �߻� Ŭ���� ����
// ���θ� ��ǰ ���Ǹ� ���� �߻� Ŭ����,
// �پ��� ��ǰ ������ �����Ϸ��� �⺻ ���� ������ ��¸� �߻� Ŭ�������� �����ϰ�
// �߰� ������ ���� Ŭ�������� �����ϵ��� �����Ѵ�.
public abstract class Product {
	//��ǰ �̸��� ���� ����
	String pname;
	int price;
	
	//��ǰ�̸��� ������ ����ϴ� �⺻ ���� ��� �޼���
	public void printDetail() {
		System.out.println("��ǰ�� : "+pname+" , ");
		System.out.println("����   : "+price+" , ");
		printExtra();
	}
	public abstract void printExtra();
}
