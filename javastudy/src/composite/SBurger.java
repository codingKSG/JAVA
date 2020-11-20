package composite;

public class SBurger extends Burger {
	
	public SBurger() {
		this(2000, "새우버거");
	}

	public SBurger(int price, String desc) {
		super(price, desc);
	}
}
