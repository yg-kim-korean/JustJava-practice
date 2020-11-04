package Ch6;

import java.util.StringTokenizer;

//구분자로 분리되는 문자열을 처ㅣ하는 String Tokenizer활용하기
public class Ch6Ex8 {
	public static void main(String args[]) {
		String data = "홍길동, 010-123-1234, 서울시, 종로구, 학생";
		StringTokenizer st = new StringTokenizer(data, ",");
		System.out.println("## 개인 정보 출력 ##");
		System.out.println("이름 : " + st.nextToken());
		System.out.println("전번 : " + st.nextToken());
		System.out.println("주소 : " + st.nextToken());
		System.out.println("직업 : " + st.nextToken());
	}
}
