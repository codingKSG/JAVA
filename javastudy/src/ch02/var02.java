package ch02;

public class var02 {

	public static void main(String[] args) /* 함수 이름은 4Byte */ {
		// Code 부분
		int num = 10;  //4Byte - 32bit - 42억 9천(약 -20억 ~ +20억)	
		long num2 = 100; //8Byte - 64bit , db에서 primary값/기본 값
		
		char s= '가'; //2Byte
		
		double d = 7.5; //8Byte 42억9천 정수의 범위(약 -20억 ~ 20억) 추가 소수점 이하 저장

		num = (int) d; //명시적 형변환(다운 캐스팅 - 자료 유실)
		
		boolean b = true; // 1bit
		
		num = (int/*다운 캐스팅*/)num2; //명시적 형변환
		num2 = num; //묵시적 형변환 (업 캐스팅)
	} // end of main

}
