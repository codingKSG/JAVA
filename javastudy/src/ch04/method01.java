package ch04;

/*�ڹ� Ư¡ : ��� �ڵ�� class ���ο� �־� �Ѵ�. */
public class method01 {
	/*
	int num = 10; // heap �� ������
	static int num3 = 30; // static �� ������
	*/
	
	static void add() {
		System.out.println("add�Լ� ȣ���");
	}
	
	void sound() {
		System.out.println("sound�Լ� ȣ���");
	}
	
	public static void main(String[] args) {
		// Code �κ�
		/* int num2 = 20; //stack �� ������(�Լ� ����) */
		
		method01.add();
		
		method01 m = new method01();
		m.sound();
	} //end of main

}
