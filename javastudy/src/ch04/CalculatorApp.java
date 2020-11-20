package ch04;

public class CalculatorApp {

	public static void main(String[] args) {
		// Code 부분
		
		Calculator cal = new Calculator();
		int result1 = cal.add(10, 5);
		int result2 = cal.multi(result1, 20);
		int result3 = cal.divid(result2, 5);
		int result4 = cal.minus(result3, 100);
		
		System.out.println("결과 : "+ result4);
		
	} //end of main

}
