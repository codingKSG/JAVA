package ch03Test;

import java.util.Scanner;

public class Rsp {

	public static void main(String[] args) {
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.\n");
		
		
		System.out.println("���� ���� ��! >>");
		
		
		String str[] = { "����", "����", "��" };
		
		
		Scanner scanner = new Scanner(System.in);

		
		while (true) {


			String userRsp = scanner.next();
			
			if (userRsp.equals("����")) {
				
				int n = (int) (Math.random() * 3);
				
				if (str[n].equals("����")) {
					System.out.println("����� = " + userRsp + " , ��ǻ�� = " + str[1] + ", ����ڰ� �����ϴ�.");
				} else if (str[n].equals("����")) {
					System.out.println("����� = " + userRsp + " , ��ǻ�� = " + str[0] + ", �����ϴ�.");
				} else {
					System.out.println("����� = " + userRsp + " , ��ǻ�� = " + str[2] + ", ����ڰ� �̰���ϴ�.");
				}

			} // end of if

			else if (userRsp.equals("����")) {
				
				int n = (int) (Math.random() * 3);
				
				if (str[n].equals("��")) {
					System.out.println("����� = " + userRsp + " , ��ǻ�� = " + str[2] + ", ����ڰ� �����ϴ�.");
				} else if (str[n].equals("����")) {
					System.out.println("����� = " + userRsp + " , ��ǻ�� = " + str[1] + ", �����ϴ�.");
				} else {
					System.out.println("����� = " + userRsp + " , ��ǻ�� = " + str[0] + ", ����ڰ� �̰���ϴ�.");
				}

			} // end of else if

			else if (userRsp.equals("��")) {
				
				int n = (int) (Math.random() * 3);
				
				if (str[n].equals("����")) {
					System.out.println("����� = " + userRsp + " , ��ǻ�� = " + str[1] + ", ����ڰ� �����ϴ�.");
				} else if (str[n].equals("����")) {
					System.out.println("����� = " + userRsp + " , ��ǻ�� = " + str[0] + ", �����ϴ�.");
				} else {
					System.out.println("����� = " + userRsp + " , ��ǻ�� = " + str[2] + ", ����ڰ� �̰���ϴ�.");
				}

			} // end of else if
			
			else if(userRsp == "�׸�") {
				System.out.println("������ �����մϴ�.....");
				
				break;
			}
			
			else {
				System.out.println("����, ����, ��, �׸� �� �ϳ��� �Է��Ͻʽÿ�.");
				continue;
			}//end of else
			scanner.close();
		} // end of while
		
		
		
	}// end of main

}
