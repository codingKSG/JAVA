package ch03Test;

import java.util.Scanner;

public class Center {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);

		System.out.println("���� 3�� �Է� >>");

		int num1 = sc1.nextInt();
		int num2 = sc2.nextInt();
		int num3 = sc3.nextInt();

		if (num1 > num2 && num1 < num3) {
			System.out.println("�߰� ���� " + num1);
		} else if (num1 < num2 && num1 > num3) {
			System.out.println("�߰� ���� " + num1);
		} else if (num2 > num1 && num2 < num3) {
			System.out.println("�߰� ���� " + num2);
		} else if (num2 < num1 && num2 > num3) {
			System.out.println("�߰� ���� " + num2);
		} else if (num3 > num2 && num1 > num3) {
			System.out.println("�߰� ���� " + num3);
		}	else {
			System.out.println("�߰� ���� " + num3);
		}

	}
}
