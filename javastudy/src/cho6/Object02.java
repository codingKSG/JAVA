package cho6;

public class Object02 {

	
	
	public static void main(String[] args) {
		
		//주소를 해쉬함...
		//주소를 비교 할 수 있음
		String str = "홍길동";
		System.out.println(str.hashCode());
		
		String str2 = "홍길동";
		System.out.println(str2.hashCode());
		
		str = "임꺽정";
		
		System.out.println(str.hashCode());
	} // end of main

}
