package java_20210521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {
	public static void main(String[] args) 
			throws IOException {
		URL url = new URL(
				"https://imgnews.pstatic.net/image/311/2021/05/21/0001300889_001_20210521144704993.jpg?type=w647");
		URLConnection urlCon = url.openConnection();

		String cacheControl = urlCon.getHeaderField("cache-control");
		String contentType = urlCon.getHeaderField("content-type");
		String date = urlCon.getHeaderField("date");

		System.out.println("cache-control : " + cacheControl);
		System.out.println("content-type : " + contentType);
		System.out.println("date : " + date);
		
		InputStream in = urlCon.getInputStream();
		InputStreamReader isr = new InputStreamReader(in,"euc-kr");
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine())!=null) {
			System.out.println(readLine);
		}
	}

}
