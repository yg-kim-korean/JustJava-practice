package Ch6;

import java.text.MessageFormat;
import java.util.Date;

//��� ���ڿ� �޽����� �����ϴ� MessageFormat Ŭ���� Ȱ���ϱ�
public class Ch6Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "{0,date}�� {0,time}�� {1}���� {2}�� ������� �ߴ�.";
		Object[] objs = {new Date(), "����","ȫ�浿"};
		MessageFormat mf = new MessageFormat(msg);
		System.out.println(mf.format(objs));
		
		String from = "ȫ�浿";
		String to = "��⵿";
		final int CHAT_SEND = 1;
		String location = "HOME";
		
		String chatMsg = "{0}|{1}|{2}-{3}|{4}";
		System.out.println(MessageFormat.format(chatMsg, CHAT_SEND, new Date(),from,to,location));

	}

}
