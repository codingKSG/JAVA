package ch03Test;

import java.util.Scanner;

public class Rsp {

	public static void main(String[] args) {
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.\n");
		
		
		System.out.println("가위 바위 보! >>");
		
		
		String str[] = { "가위", "바위", "보" };
		
		
		Scanner scanner = new Scanner(System.in);

		
		while (true) {


			String userRsp = scanner.next();
			
			if (userRsp.equals("가위")) {
				
				int n = (int) (Math.random() * 3);
				
				if (str[n].equals("바위")) {
					System.out.println("사용자 = " + userRsp + " , 컴퓨터 = " + str[1] + ", 사용자가 졌습니다.");
				} else if (str[n].equals("가위")) {
					System.out.println("사용자 = " + userRsp + " , 컴퓨터 = " + str[0] + ", 비겼습니다.");
				} else {
					System.out.println("사용자 = " + userRsp + " , 컴퓨터 = " + str[2] + ", 사용자가 이겼습니다.");
				}

			} // end of if

			else if (userRsp.equals("바위")) {
				
				int n = (int) (Math.random() * 3);
				
				if (str[n].equals("보")) {
					System.out.println("사용자 = " + userRsp + " , 컴퓨터 = " + str[2] + ", 사용자가 졌습니다.");
				} else if (str[n].equals("바위")) {
					System.out.println("사용자 = " + userRsp + " , 컴퓨터 = " + str[1] + ", 비겼습니다.");
				} else {
					System.out.println("사용자 = " + userRsp + " , 컴퓨터 = " + str[0] + ", 사용자가 이겼습니다.");
				}

			} // end of else if

			else if (userRsp.equals("보")) {
				
				int n = (int) (Math.random() * 3);
				
				if (str[n].equals("바위")) {
					System.out.println("사용자 = " + userRsp + " , 컴퓨터 = " + str[1] + ", 사용자가 졌습니다.");
				} else if (str[n].equals("가위")) {
					System.out.println("사용자 = " + userRsp + " , 컴퓨터 = " + str[0] + ", 비겼습니다.");
				} else {
					System.out.println("사용자 = " + userRsp + " , 컴퓨터 = " + str[2] + ", 사용자가 이겼습니다.");
				}

			} // end of else if
			
			else if(userRsp == "그만") {
				System.out.println("게임을 종료합니다.....");
				
				break;
			}
			
			else {
				System.out.println("가위, 바위, 보, 그만 중 하나를 입력하십시오.");
				continue;
			}//end of else
			scanner.close();
		} // end of while
		
		
		
	}// end of main

}
