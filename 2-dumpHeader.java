package pack1;

import java.io.*;
import java.net.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class video {

	public static void main (String[] args) {
	try {
		URL u = new URL("http://www.google.com/");
		URLConnection uc = u.openConnection();
		//prints URL
		System.out.println("Entered URL: " + uc.getURL());
      
		   //block of code prints of key values of header returned from http request 
	       Map<String, List<String>> headers = uc.getHeaderFields();
	        Set<Map.Entry<String, List<String>>> entrySet = headers.entrySet();
	        for (Map.Entry<String, List<String>> entry : entrySet) {
	            String headerName = entry.getKey();
	            System.out.print( headerName);
	            List<String> headerValues = entry.getValue();
	            for (String value : headerValues) {
	                System.out.print("  " + value);
	            }
	            System.out.println();
	        }
		
		
	    } catch (MalformedURLException ex) {
		  System.err.println("www.google.com" + " is not a URL I understand");
		} catch (IOException ex) {
		  System.err.println(ex);
		}
		System.out.println();
}
}
