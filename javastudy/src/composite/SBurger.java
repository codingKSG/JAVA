package composite;

public class SBurger extends Burger {
	
	public SBurger() {
		this(2000, "�������");
	}

	public SBurger(int price, String desc) {
		super(price, desc);
	}
}
