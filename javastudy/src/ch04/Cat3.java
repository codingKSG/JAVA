package ch04;

//import : 내 패키지 외부에 있는 것을 들고 올 때
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cat3 {
	private int age;
	private String name;
	private String color;
}
