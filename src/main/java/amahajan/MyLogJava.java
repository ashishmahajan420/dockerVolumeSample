package amahajan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyLogJava {
	
	public static void main(String args[]) throws IOException {
		System.out.println("Hello!!!");
		BufferedWriter out = null;
		try {
		    out = new BufferedWriter(new FileWriter("test.txt"));
		    out.write("aString\nthis is a\nttest");  //Replace with the string 
		                                             //you are trying to write
		}
		catch (IOException e)
		{
		    System.out.println("Exception ");

		}
		finally
		{
		    out.close();
		}
	}

}
