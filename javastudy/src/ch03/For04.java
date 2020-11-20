package ch03;

public class For04 {
	
	static void starPrint(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("¡Ú");
		}
		System.out.println();
	
	}
	
	public static void main(String[] args) {
		for (int i = 5; i > 0; i--) {
			starPrint(i);
		}

	}
	
}
