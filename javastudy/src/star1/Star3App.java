package star1;

// 1. Zealot, Dragon, Tank, Scv, DarkTempler => StarUnit Ÿ��

public class Star3App {
	

	static void attack(StarUnit u1, StarUnit u2) {
		u2.setHp(u2.getHp() - u1.getAttack());
		System.out.println(u2.getName()+ " ü�� : " +u2.getHp());
	}

	public static void main(String[] args) {
		Zealot z1 = new Zealot("����1", 100, 10);
		Zealot z2 = new Zealot("����2", 100, 10);
		
		attack(z1, z2);
	}// end of main

}
