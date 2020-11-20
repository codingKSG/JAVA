package ch04;

class President{

	private static President instance = new President();
	
	public static President getInstance() {
		return instance;
	}
	
}

public class SingtoneApp {

	public static void main(String[] args) {
		
		President instance = President.getInstance();
		
		
	}// end of main

}
