package ch02;

public class Oper01 {

	public static void main(String[] args) {
		// Code 부분
		System.out.println(1+1); //연산
		System.out.println(1+"1"); //결합
		
		int num = 10;
		String s = "5";
		
		String sum = num +s; //type 이 String 으로 됨.
		System.out.println(sum);
		
		
		System.out.println(10-5);
		System.out.println(10/3); //타입이 int로 됨.
		System.out.println(10.0/3); // 타입이 double이 됨.
		System.out.println(10%3); // 나머지 구하기
		System.out.println(10*3); //곱하기
	} //end of main

}
