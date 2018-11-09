package java8exercise.com.liang.practice;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Base64;
import java.util.UUID;

public class Java8TesterBase64 {
	public static void main(String args[]) throws Exception{

		try {

			// Encode using basic encoder
//			String base64encodedString = Base64.getEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
//			System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);
//
//			// Decode
//			byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
//
//			System.out.println("Original String: " + new String(base64decodedBytes, "utf-8"));
//			base64encodedString = Base64.getUrlEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
//			System.out.println("Base64 Encoded String (URL) :" + base64encodedString);

			StringBuilder stringBuilder = new StringBuilder();

			for (int i = 0; i < 10; ++i) {
				stringBuilder.append(UUID.randomUUID().toString());
			}

			byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
			String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
			System.out.println("Base64 Encoded String (MIME) :" + mimeEncodedString);
			
			
			URL a = new URL("http://example.com:80/docs/books/tutorial/index.html?name=networking#DOWNLOADING");
			String protocol = a.getProtocol();
			String host = a.getHost();
			int post = a.getPort();
			String path = a.getPath();
			
			
			
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error :" + e.getMessage());
		}
	}
	
	
}


