package star1;

class River extends StarUnit {
	// StarUnit �� ã�ƾ� �ϴ� ����
	// ����
	private String name;
	private int hp;
	private int attack;

	// �⺻ ������ ��Ģ: Ŭ������ �����ϸ� ������ �ʱ�ȭ�� ���� �����ڸ� �����.

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