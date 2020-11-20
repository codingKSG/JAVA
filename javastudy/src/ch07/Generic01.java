package ch07;

import lombok.Data;

@Data
class ResponseDto<T>/*제네릭*/{
	private int statusCode;//200(성공), 300(다시요청), 400(잘못된 요청)
	private T/*아직 정해지지 않은 타입*/ data;
}


public class Generic01 {
	public static void main(String[] args) {
		ResponseDto<Integer> dto = new ResponseDto();
		dto.setStatusCode(200);
		dto.setData(1);

		if(dto.getStatusCode() == 200)
			System.out.println(dto.getData());
	}
}
