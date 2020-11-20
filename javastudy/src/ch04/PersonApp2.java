package ch04;

public class PersonApp2 {

	public static void main(String[] args) {
		// Code 부분
		
		//기본 생성자 = 클래스명() -> 생략 가능
		Person p1 = new Person("최승희", "의사", 45, '여', "A");

		p1.preview();

		Person p2 = new Person("김여사", "운전 기사", 28, '여', "O");

		p2.preview();

		Person p3 = new Person("김치남", "", 47, '남', "AB");

		p3.preview();
	} // end of main

}
