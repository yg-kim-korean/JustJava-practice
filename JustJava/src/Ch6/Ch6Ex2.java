package Ch6;
//String Buffer 클래스 구현
public class Ch6Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "문자열";
		for (int i = 0; i < 50; i++) {
			str = str+ i+ ' ';
			
		}
		System.out.println(str);
		StringBuffer sb = new StringBuffer();
		sb.append("문자열");
		
		for (int i = 0; i < 50; i++) {
			sb.append(i);
			sb.append(' ');
			
		}
		System.out.println(sb.toString());
				
	}

}
