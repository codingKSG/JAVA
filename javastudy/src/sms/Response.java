package sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Response {
	String group_id;
	String error_list;
	String success_count;
	String error_count;

	public static void main(String[] args) {
		String data = "{\"group_id\":\"R2GFbVj44GD29iMw\",\"error_list\":{\"1\":\"1062\"},\"success_count\":0,\"error_count\":1}";
		System.out.println(data);

		data = data.replace("{", "");
		data = data.replace("}", "");
		data = data.replaceAll("\"", "");
		data = data.replace(":", ",");

		String[] s = data.split(","); // s[1],s[4],s[6],s[8]

		Response res = new Response(s[1],s[4],s[6],s[8]);

		System.out.println(res);

	}
}
