package star1;

// 1. Zealot, Dragon, Tank, Scv, DarkTempler => StarUnit Å¸ÀÔ

public class Star3App {
	

	static void attack(StarUnit u1, StarUnit u2) {
		u2.setHp(u2.getHp() - u1.getAttack());
		System.out.println(u2.getName()+ " Ã¼·Â : " +u2.getHp());
	}

	public static void main(String[] args) {
		Zealot z1 = new Zealot("Áú·µ1", 100, 10);
		Zealot z2 = new Zealot("Áú·µ2", 100, 10);
		
		attack(z1, z2);
	}// end of main

}
