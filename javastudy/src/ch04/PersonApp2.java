package ch04;

public class PersonApp2 {

	public static void main(String[] args) {
		// Code �κ�
		
		//�⺻ ������ = Ŭ������() -> ���� ����
		Person p1 = new Person("�ֽ���", "�ǻ�", 45, '��', "A");

		p1.preview();

		Person p2 = new Person("�迩��", "���� ���", 28, '��', "O");

		p2.preview();

		Person p3 = new Person("��ġ��", "", 47, '��', "AB");

		p3.preview();
	} // end of main

}
