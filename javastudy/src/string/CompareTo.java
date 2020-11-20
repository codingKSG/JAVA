package string;

public class CompareTo {

	public static void main(String[] args) {
		String java = "Java";
		String cpp = "C++";
		
		int res = java.compareTo(cpp);
		if(res== 0) System.out.println("두 문자열이 같습니다.");
		else if(res < 0) System.out.println(java + " < " + cpp);
		else System.out.println(cpp + " > " + java);

	}

}
