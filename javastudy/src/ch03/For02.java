package ch03;

public class For02 {

	public static void main(String[] args) {
		//¦�� 1~100
		
		for (int i = 1; i <= 100; i++) {
			
			if (i%2 == 0) {
				System.out.println("¦�� : "+ i);	
			}// end of if
			
		}// end of for

		for (int i = 1; i <= 100; i++) {
			
			if (i%2 == 1) {
				System.out.println("Ȧ�� : "+ i);
			}//end of if
		}//end of for
	}// end of main

}
