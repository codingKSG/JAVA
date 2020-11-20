package composite;

public class LotteriaApp {

	public static void main(String[] args) {

		Burger b1 = new Burger();
		Potato p1 = new Potato();
		Coke c1 = new Coke();
		System.out.println();

		BurgerSet s1 = new BurgerSet();
		System.out.println();

		BigBurger bbg1 = new BigBurger();
		System.out.println();
		
		SBurger sbg1 = new SBurger();
		System.out.println();
		
		SBurgerSet sbs = new SBurgerSet();

	}

}
