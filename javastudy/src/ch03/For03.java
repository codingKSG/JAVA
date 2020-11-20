package ch03;

public class For03 {
	
	static void starPrint(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("¡Ú");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		/* ¡Ú
		 * ¡Ú¡Ú
		 * ¡Ú¡Ú¡Ú
		 * ¡Ú¡Ú¡Ú¡Ú
		 * ¡Ú¡Ú¡Ú¡Ú¡Ú
		 */
		
		for (int i = 1; i < 6; i++) {
			starPrint(i);
		}

	}
}
