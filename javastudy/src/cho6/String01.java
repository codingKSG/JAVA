package cho6;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data //getter, setter, toString
@AllArgsConstructor //풀 생성자
@NoArgsConstructor //디폴트 생성자

//DTO = Data Transfer Object = 통신에서 많이 사용됨.
class UserDto {
	private int id;
	private String name;
	
	
	
}

public class String01 {
	public static void main(String[] args) {
		String data = "id:1,name:홍길동";
		
		String[] s = data.split(",");
		
		String name = s[0].substring(3); //String s[0] = 1
		int id = Integer.parseInt(s[0]);
		
		s[1] = s[1].substring(5); //String s[1] = "홍길동"
		
		//파싱 parsing(구문 분석)
		UserDto dto = new UserDto();
		dto.setId(id);
		dto.setName(name);
		System.out.println(dto);
	}
}
