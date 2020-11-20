package cho6;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data //getter, setter, toString
@AllArgsConstructor //Ǯ ������
@NoArgsConstructor //����Ʈ ������

//DTO = Data Transfer Object = ��ſ��� ���� ����.
class UserDto {
	private int id;
	private String name;
	
	
	
}

public class String01 {
	public static void main(String[] args) {
		String data = "id:1,name:ȫ�浿";
		
		String[] s = data.split(",");
		
		String name = s[0].substring(3); //String s[0] = 1
		int id = Integer.parseInt(s[0]);
		
		s[1] = s[1].substring(5); //String s[1] = "ȫ�浿"
		
		//�Ľ� parsing(���� �м�)
		UserDto dto = new UserDto();
		dto.setId(id);
		dto.setName(name);
		System.out.println(dto);
	}
}
