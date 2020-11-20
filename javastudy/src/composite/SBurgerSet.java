package composite;

import lombok.Data;

//ÄÞÆ÷Áö¼Ç
@Data

public class SBurgerSet {
	private SBurger Sburger;
	private Potato potato;
	private Coke coke;

	public SBurgerSet() {
		this(   new SBurger(), 
				new Potato(), 
				new Coke()  
				);

	}

	public SBurgerSet(SBurger Sburger, Potato potato, Coke coke) {
		this.Sburger = Sburger;
		this.potato = potato;
		this.coke = coke;
	}

}
