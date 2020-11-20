package ch05;

class Animal {
	void sound() {}
}

class Dog extends Animal{
	/* �������̵� (��ȿȭ �ϴ�.)
	 * �θ� ����ִ� �Լ��� �ڽ��� �Ȱ��� �Լ��� ������
	 * �θ��� �Լ��� ��ȿȭ �ϰ� �ڽ��� �Լ��� ��Ÿ��
	 */
	void sound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal{
	/* �������̵� (��ȿȭ �ϴ�.)
	 * �θ� ����ִ� �Լ��� �ڽ��� �Ȱ��� �Լ��� ������
	 * �θ��� �Լ��� ��ȿȭ �ϰ� �ڽ��� �Լ��� ��Ÿ��
	 */
	void sound() {
		System.out.println("�߿�");
	}
}

class Bird extends Animal{
	/* �������̵� (��ȿȭ �ϴ�.)
	 * �θ� ����ִ� �Լ��� �ڽ��� �Ȱ��� �Լ��� ������
	 * �θ��� �Լ��� ��ȿȭ �ϰ� �ڽ��� �Լ��� ��Ÿ��
	 */
	void sound() {
		System.out.println("±±");
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
