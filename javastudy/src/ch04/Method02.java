package ch04;

class Dog{
	int 배고픔 = 100; //상태
	
	void eat() { //행위
		배고픔 = 10;
	}
}

public class Method02 {

	public static void main(String[] args) {
		// Code 부분
		Dog d1 = new Dog();
		/*d1.배고픔 = 10; // 하면 안되는 예 1(변수를 직접 바꾸는 행위는 안됨, 마법) */
		d1.eat(); // 행위를 통해서 상태를 변경함
		
		System.out.println("강아지의 배고픔: "+d1.배고픔);
	} // end of main

}
