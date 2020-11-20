package ch04;

class Jop{
	String getName() {
		return "";
	}
}

class Police extends Jop{
	String name = "°æÂû";

	public Police() {
		// TODO Auto-generated constructor stub
	}

	public Police(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Doctor extends Jop {
	String name = "ÀÇ»ç";

	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Array02 {

	public static void main(String[] args) {
		Jop[] names = new Jop[2];
		
		Jop j1 = new Police();
		Jop j2 = new Doctor();
		
		names[0] = j1;
		names[1] = j2;
		
		System.out.println(names[0].getName() + " , " + names[1].getName());
		
	}

}
