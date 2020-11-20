package ch05;

class Animal {
	void sound() {}
}

class Dog extends Animal{
	/* 오버라이딩 (무효화 하다.)
	 * 부모가 들고있는 함수를 자식이 똑같은 함수가 있으면
	 * 부모의 함수를 무효화 하고 자식의 함수를 나타냄
	 */
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	/* 오버라이딩 (무효화 하다.)
	 * 부모가 들고있는 함수를 자식이 똑같은 함수가 있으면
	 * 부모의 함수를 무효화 하고 자식의 함수를 나타냄
	 */
	void sound() {
		System.out.println("야옹");
	}
}

class Bird extends Animal{
	/* 오버라이딩 (무효화 하다.)
	 * 부모가 들고있는 함수를 자식이 똑같은 함수가 있으면
	 * 부모의 함수를 무효화 하고 자식의 함수를 나타냄
	 */
	void sound() {
		System.out.println("짹짹");
	}
}

public class Inherit03 {

	static void start(Animal a) {
		a.sound();
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();

		Inherit03.start(c);
		Inherit03.start(d);

	}

}
