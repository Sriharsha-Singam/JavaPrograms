import java.io.*;
public class FunctionOverloadDemo
{		
	void add(int a,int b)  //Function not returning value
	{
		// a and b Formal Parameter
		System.out.println("Sum " + (a+b));
	}
	
	void add(double a,int b)  //Function not returning value
	{
		System.out.println("Sum of double and int " + (a+b));
	}

	String add(String a,String b) //Function returning value
	{
		return a+b;
	}
			
	public static void main(String args[])
	{
		String s;
		try
		{
			int i=1,j=23;
			FunctionOverloadDemo fun = new FunctionOverloadDemo();
			fun.add(i,j);//i and j Actual Parameter
			fun.add(10.0d,2);
			s=fun.add("Sample","Simple");
			System.out.println(s);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
