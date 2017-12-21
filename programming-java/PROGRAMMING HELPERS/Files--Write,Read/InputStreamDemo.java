import java.io.*;
public class InputStreamDemo
{
	public static void main(String a[])
	{
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader stdin = new BufferedReader(isr);
			System.out.println("Enter your Age");
			String data = stdin.readLine();
			int age=Integer.parseInt(data);
			System.out.println("Your Age  = " + age);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured " +  e.toString());
		}
	}
}