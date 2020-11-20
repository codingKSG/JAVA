package ch05;

public class Truck extends Car implements Control{
	private String name;
	private Engine5000 engine5000;
	
	public Truck() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ¿¢¼¿() {
		System.out.println("ÀüÁø");
		
	}

	@Override
	public void ºê·¹ÀÌÅ©() {
		System.out.println("¸ØÃã");
		
	}
}
