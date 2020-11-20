package login;

//사용자가 로그인할 때 -> 페이스북, 네이버
public class LoginApp {
	
	static void userInfo(OAuth o) {
		System.out.println(o.oAuthProvider()+"로 로그인한 사용자는 ...");
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
