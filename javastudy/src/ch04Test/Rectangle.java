package ch04Test;

public class Rectangle {

	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height) {

		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public Rectangle() {

	}

	void show() {
		System.out.println("(" + x + "," + y + ") ���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	}

	int square() {
		return width * height;
	}

	boolean contains(Rectangle val) {
		int resultX1 = x + width;
		int resultY1 = y + height;
		int resultX2 = val.x + val.width;
		int resultY2 = val.y + val.height;

		return x < val.x && y < val.y && resultX1 > resultX2 && resultY1 > resultY2;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s�� ������ " + s.square());
		if (t.contains(r))
			System.out.println("t�� r�� �����մϴ�.");
		if (t.contains(s))
			System.out.println("t�� s�� �����մϴ�.");

	}// end of main

}
