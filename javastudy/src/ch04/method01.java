package ch04;

/*자바 특징 : 모든 코드는 class 내부에 둬야 한다. */
public class method01 {
	/*
	int num = 10; // heap 이 관리함
	static int num3 = 30; // static 이 관리함
	*/
	
	static void add() {
		System.out.println("add함수 호출됨");
	}
	
	void sound() {
		System.out.println("sound함수 호출됨");
	}
	
	public static void main(String[] args) {
		// Code 부분
		/* int num2 = 20; //stack 이 관리함(함수 내부) */
		
		method01.add();
		
		method01 m = new method01();
		m.sound();
	} //end of main

}
