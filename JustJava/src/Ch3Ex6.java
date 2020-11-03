
public class Ch3Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pwd = 123456;
		int encPwd , decPwd;
		int key = 0x1A253B65;
		
		System.out.println("암호화 전 비밀번호 : " + pwd);
		
		encPwd = pwd ^ key;  //^ 비트논리 연산자 // 두항의 비트가 서로 다르면 1, 같으면 0으로 연산한다 (XOR 연산)
		
		System.out.println("암호화 후 비밀번호 : " + encPwd);
		
		decPwd = encPwd ^ key;
		
		System.out.println("복호화 후 비밀번호 : " + decPwd);
		
	}

}
