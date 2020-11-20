package string;

public class CharAt2 {
	public static void main(String[] args) {
		int count = 0;
		String a = "class";
		
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 's')
				count++;
		}
		
		System.out.println(count);
	}
}
