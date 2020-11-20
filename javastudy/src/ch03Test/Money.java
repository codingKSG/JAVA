package ch03Test;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		System.out.println("금액을 입력하시오>> ");
		final int money = sr.nextInt();
		int rMoney = money;
		int rCount;

		int arr[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

		for (int i = 0; i < 7; i++) {
			rCount = rMoney / arr[i];
			rMoney = rMoney % arr[i];

			if (rCount != 0) {
				System.out.println("arr[i] " + rCount);
			}

		}

	} // end of main

}
