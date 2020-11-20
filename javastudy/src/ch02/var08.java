package ch02;

//static 정적
//heap 동적
class Zealot {
	String name = "질럿";
	int attack  = 10;
	int armor = 5;
	
	static int hp = 100;
}

public class var08 {

	public static void main(String[] args) {
		// Code 부분
		 Zealot z = new Zealot(); //19번 라인에서 질럿 생성됨
		 System.out.println(z.name);
		 System.out.println(z.attack);
		 System.out.println(z.armor);
		 
		 Zealot z2 = new Zealot();
		 System.out.println(z.name);
		 System.out.println(z.attack);
		 System.out.println(z.armor);
		 
		 z.attack = 50;
		 
		 System.out.println("변화관찰");
		 System.out.println(z.attack);
		 System.out.println(z2.attack);
		 
		 z.hp = 50; //Zealot.hp 와 같다
		 
		 System.out.println("변화관찰");
		 System.out.println(z.hp);
		 System.out.println(z2.hp);
		 
		 //포지 업그레이드
		 
		 z.attack =11;
		 
		 System.out.println(z.attack);
		 System.out.println(z2.attack);
		 
	} // end of main

}
