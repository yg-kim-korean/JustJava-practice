
public class Ch3Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String memberLevel = "YOUNG"; // YOUNG VIP NEW �� ����
		String msg;
		
		switch(memberLevel) {
		case "VIP" :
			msg = "VIP �� ���� ����"; break;
		case "NEW" :
			msg = "�ű� �� ���� ����"; break;
		case "YOUNG" :
			msg = "û�ҳ� �� ���� ����"; break;
		default:
			msg = "��޾���";
		}
		System.out.println(msg);
	}

}
