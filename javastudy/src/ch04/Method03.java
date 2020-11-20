package ch04;

class Cal { //계산기
	static void add(int n1, int n2/*지역변수 : 잠깐 떳다가 사라지는 변수*/) {
		System.out.println(n1+n2);
	} //void : return 값이 없음
	
	static int minus(int n3, int n4) {
		return n3 - n4;
	}
}

public class Method03 {
	public static void main(String[] args) {
		// Code 부분
		Cal.add(5, 6);
		// 지역변수 : stack 이 들고 있는 변수
		// 전역변수 : heap , static 이 들고 있는 변수
		
		
		/* minus 함수는 return 타입이 int 이기 때문에
		 * Cal.minus(10, 4)가 호출된 후 메서드가 종료되면
		 * Cal.minus(10, 4) --> 6으로 변경된다.
		 */
		int result = Cal.minus(10, 4); 
		System.out.println(result);
		
	} //end of main

}
