package ch04;

//ctrl + shift +f ����
//�޼ҵ� �ȿ� �޼ҵ带 ������ �� ����
//������ �޼ҵ带 ���� �� ����. 
public class Method04 {

	int money = 10000; // heap

	int add(int num) { // int num -> stack, add() -> heap
		int money2 = money + num;
		return money2;
	} // ���¿� ��ȭ�� ���� �ʰ� �Լ� ������ ���� ��ȭ�ִ� �Լ��� ���α׷�

	public static void main(String[] args) {
		// Code �κ�
		Method04 m = new Method04();
		int money2 = m.add(50000);

		System.out.println(m.money);
		System.out.println(money2);
		// heap���� ������ ������ ������� ����(���� ����)
	} // end of main

}
