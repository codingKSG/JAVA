package login;

//����ڰ� �α����� �� -> ���̽���, ���̹�
public class LoginApp {
	
	static void userInfo(OAuth o) {
		System.out.println(o.oAuthProvider()+"�� �α����� ����ڴ� ...");
		System.out.println(o.oAuthId());
		System.out.println(o.oAuthPassword());
		System.out.println(o.oAuthNickName());
		System.out.println();
	}

	public static void main(String[] args) {
		
		Facebook f = new Facebook();
		userInfo(f);
		
		Naver n = new Naver();
		userInfo(n);
		
		Kakao k = new Kakao();
		userInfo(k);
		
		
		
	}
}
