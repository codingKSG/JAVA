package cho6;

public class Wrapper01 {

	public static void main(String[] args) {
		int num = 10;
		Integer num2 = 20;
		
		//숫자를 문자로 바꾸는 법
		String num3 = num2.toString();
		
		System.out.println(num3);
		
		//문자를 숫자로 바꾸는법
		// 1번 방법
		String num4 = num+"";
		
		// 2번 방법
		String num5 = "10";
		int num6 = Integer.parseInt(num5);
		System.out.println(num4);
		System.out.println(num6);
	}

}
