package sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SmsData {
	private int id; // 메세지 번호... 1, 2, 3....
	private String text;
	private String to;
	private int errorCode;
	private String sendTime;
	
	
	
}
