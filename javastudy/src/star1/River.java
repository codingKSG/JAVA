package star1;

class River extends StarUnit {
	// StarUnit 이 찾아야 하는 변수
	// 상태
	private String name;
	private int hp;
	private int attack;

	// 기본 생성자 규칙: 클래스를 생성하면 무조건 초기화를 위한 생성자를 만든다.

	public River(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}

	public River() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

}