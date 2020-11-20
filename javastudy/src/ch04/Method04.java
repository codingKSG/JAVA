package ch04;

//ctrl + shift +f 정렬
//메소드 안에 메소드를 정의할 수 없다
//변수에 메소드를 담을 수 없다. 
public class Method04 {

	int money = 10000; // heap

	int add(int num) { // int num -> stack, add() -> heap
		int money2 = money + num;
		return money2;
	} // 상태에 변화를 주지 않고 함수 내부의 값만 변화주는 함수형 프로그램

	public static void main(String[] args) {
		// Code 부분
		Method04 m = new Method04();
		int money2 = m.add(50000);

		System.out.println(m.money);
		System.out.println(money2);
		// heap으로 관리한 변수는 사라지지 않음(전역 변수)
	} // end of main

}
