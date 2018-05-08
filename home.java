import java.io.*;
import java.net.*;


public class home {
	public static void main(String[] args) throws Exception
	{
		URL myURL = new URL("http://www.google.com");
		
		//Opening a connection our established URL
		URLConnection myConnect = myURL.openConnection();
		
		InputStream is = myConnect.getInputStream();
		
		System.out.println("Type = " + myConnect.getContentType());
		
		BufferedReader ourReader = new BufferedReader(new InputStreamReader(is));
		
		String line = null;
		
		while((line = ourReader.readLine()) != null)
		{
			System.out.println(line);
			System.out.println();
			
		}
		
	}
}
