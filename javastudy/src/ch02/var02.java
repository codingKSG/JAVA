package ch02;

public class var02 {

	public static void main(String[] args) /* �Լ� �̸��� 4Byte */ {
		// Code �κ�
		int num = 10;  //4Byte - 32bit - 42�� 9õ(�� -20�� ~ +20��)	
		long num2 = 100; //8Byte - 64bit , db���� primary��/�⺻ ��
		
		char s= '��'; //2Byte
		
		double d = 7.5; //8Byte 42��9õ ������ ����(�� -20�� ~ 20��) �߰� �Ҽ��� ���� ����

		num = (int) d; //����� ����ȯ(�ٿ� ĳ���� - �ڷ� ����)
		
		boolean b = true; // 1bit
		
		num = (int/*�ٿ� ĳ����*/)num2; //����� ����ȯ
		num2 = num; //������ ����ȯ (�� ĳ����)
	} // end of main

}
