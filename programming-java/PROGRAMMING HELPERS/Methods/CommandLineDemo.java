import java.io.*;
public class CommandLineDemo
{					
	public static void main(String args[]) throws IOException
	{
		try
		{						
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("Result : " + (a+b));
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
