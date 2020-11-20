package ch03;

public class Gugudan01 {
	public static void main(String[] args) {
		/*구구단 2단을 출력하는 프로그램을 만들어 주세요!!
		 * 2*1=2
		 * 2*1=4
		 * ....
		 */
		
		for (int n1 = 2; n1 < 10; n1++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(n1+"*"+ i +"="+(n1*i));
			}
			System.out.println();
		}


	}
}