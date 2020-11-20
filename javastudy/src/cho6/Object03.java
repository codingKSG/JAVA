package cho6;

public class Object03 {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		// == 은 최초 엑세스 한 메모리 공간의 내용을 비교
		System.out.println(str1 == str2);
		
		//String 의 Hash 함수는 오버라이딩 되서
		//같은 문자열이면 같은 해쉬를 뽑아낸다.
		//
		String str3 = "임꺽정";//heap 내부의 Constant Pool
		String str4 = new String("임꺽정"); // heap
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		// == 으로 먼저 비교 > 같으면 true
		// > 달라서 false가 나오면 최종목적지의 값을 비교
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}
}
