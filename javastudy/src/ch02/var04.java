package ch02;

public class var04 {

	public static void main(String[] args) {
		// Code 부분
		//숫자 여러개 1,2,3
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		
		//숫자 여러개 1,2,3
		int[] n = {1,2,3}; //장점 : 연속된 데이터를 저장할 때 용의, 데이터를 뺄 때 편안함
						   //단점 : 크기가 정해지면 변경 불가
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		
		//문자 여러개 가, 나, 다
		char[] mon = {'가', '나', '다'};
		
		System.out.println(mon[0]);
		System.out.println(mon[1]);
		System.out.println(mon[2]);
	} //end of main

}
