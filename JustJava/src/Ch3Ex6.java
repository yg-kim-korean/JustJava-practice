
public class Ch3Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pwd = 123456;
		int encPwd , decPwd;
		int key = 0x1A253B65;
		
		System.out.println("��ȣȭ �� ��й�ȣ : " + pwd);
		
		encPwd = pwd ^ key;  //^ ��Ʈ�� ������ // ������ ��Ʈ�� ���� �ٸ��� 1, ������ 0���� �����Ѵ� (XOR ����)
		
		System.out.println("��ȣȭ �� ��й�ȣ : " + encPwd);
		
		decPwd = encPwd ^ key;
		
		System.out.println("��ȣȭ �� ��й�ȣ : " + decPwd);
		
	}

}
