package composite;

public class Coke {
	private int price;
	private String desc;

	public Coke() {
		this(1000, "코카콜라");
	}
	

	public Coke(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "가 만들어 졌습니다.");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
