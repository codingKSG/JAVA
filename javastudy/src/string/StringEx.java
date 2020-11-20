package string;

public class StringEx {

	public static void main(String[] args) {
		String a = new String("  C#");
		String b = new String(",C++");
		
		System.out.println(a + "의 길이는 " + a.length()); //문자열의 길이(문자 개수)
		System.out.println(a.contains("#")); //문자열의 포함 관계
		
		a = a.concat(b); //문자열 연결
		System.out.println(a);
		
		a = a.trim(); //문자열의 앞 뒤 공백 제거
		System.out.println(a);
		
		a = a.replace("C#", "Java"); //문자열 대치 - C#을 Java로 대치함(변경함)
		System.out.println(a);
		
		String[] s = a.split(","); //문자열 분리 - , 를 중심으로 문자열을 분리
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열" + (i+1) + " : " + s[i]);
		}
		
		// 인덱스 5부터 끝까지 서브 스트링 리턴 - a = Java, C++ 이므로 문자열 5번 째 이후를 리턴
		a = a.substring(5); 
		System.out.println(a);
		
		char c = a.charAt(2); // 인덱스 2의 문자 리턴
		System.out.println(c);	
		
	}

}
