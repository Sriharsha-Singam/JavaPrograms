import java.util.*;
import java.io.*;
public class ExceptionSixDemo 
{
	void add (int a,int b) throws NumberFormatException
	{
		System.out.println("Add: -> " + (a+b));
	}
	void sub (int a,int b) 
	{
		if(a==b)
		{
			throw new NumberFormatException("Number cannot be same");
		}
		else
		{
			System.out.println("Sub: -> " + (a-b));
		}
	}
	void mul (int a,int b) throws NumberFormatException
	{
		System.out.println("Product: -> " + (a*b));
	}
  	public static void main(String args[])
  	{		
		try
		{
			ExceptionSixDemo e = new ExceptionSixDemo();
			Scanner a = new Scanner(System.in);
			System.out.println("Enter Value for first ");
			int first = Integer.parseInt(a.nextLine());
			Scanner b = new Scanner(System.in);
			System.out.println("Enter Value for second ");
			int second = Integer.parseInt(b.nextLine());
			e.sub(first,first);
		}
		catch(Exception ee)
		{	
			System.out.println("Exception " + ee);
		}
  	}
}
