package Ch6;

import java.util.StringTokenizer;

//�����ڷ� �и��Ǵ� ���ڿ��� ó���ϴ� String TokenizerȰ���ϱ�
public class Ch6Ex8 {
	public static void main(String args[]) {
		String data = "ȫ�浿, 010-123-1234, �����, ���α�, �л�";
		StringTokenizer st = new StringTokenizer(data, ",");
		System.out.println("## ���� ���� ��� ##");
		System.out.println("�̸� : " + st.nextToken());
		System.out.println("���� : " + st.nextToken());
		System.out.println("�ּ� : " + st.nextToken());
		System.out.println("���� : " + st.nextToken());
	}
}
