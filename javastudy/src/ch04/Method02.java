package ch04;

class Dog{
	int ����� = 100; //����
	
	void eat() { //����
		����� = 10;
	}
}

public class Method02 {

	public static void main(String[] args) {
		// Code �κ�
		Dog d1 = new Dog();
		/*d1.����� = 10; // �ϸ� �ȵǴ� �� 1(������ ���� �ٲٴ� ������ �ȵ�, ����) */
		d1.eat(); // ������ ���ؼ� ���¸� ������
		
		System.out.println("�������� �����: "+d1.�����);
	} // end of main

}
