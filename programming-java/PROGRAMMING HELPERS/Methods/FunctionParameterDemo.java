import java.io.*;
public class FunctionParameterDemo
{		
	void DisplaySum(int a,int b)  //With Parameter(Formal)
	{		
		System.out.println("Sum " + (a+b));
	}
	
	void DisplaySum()  //Without Parameter
	{
		String a="A";
		String b="B";
		System.out.println("Sum of string " + (a+b));
	}

			
	public static void main(String args[])
	{
		String s;
		try
		{
			int i=1,j=23;
			FunctionParameterDemo fun = new FunctionParameterDemo();
			fun.DisplaySum(i,j);//i and j Actual Parameter
			fun.DisplaySum();			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
