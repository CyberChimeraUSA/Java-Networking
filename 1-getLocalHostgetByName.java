package root;

import java.net.*;
public class Networking {
	public static void main(String args []) throws UnknownHostException{
		 
		InetAddress Address1 = InetAddress.getLocalHost();
		System.out.println(Address1);
		
		InetAddress Address2 = InetAddress.getByName("www.google.com");
		System.out.println(Address2);
		
		InetAddress Address3[] = InetAddress.getAllByName("www.cnn.com");
		for(int i = 0; i < Address3.length;i ++)
		System.out.println(Address3[i]);
			
	}
	
}
