import java.io.*;
public class FunctionDemo
{	
	public static int x=10; //Static variable and access specifier
	public static int y=5;
	public void Display()
	{
		System.out.println("Anonymous");
	}
	
	void add(int a,int b) //Function Overloading and Formal Parameter
	{
		System.out.println("Sum " + (a+b));
	}
	
	String add(String a,String b) //Function Overloading and Call By Value
	{
		return a+b;
	}
	
	float divide(int a,int b) throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException("Denominator cannot be zero");
		}
		else
		{
			return (a/b);
		}
	}
	
	int Product(int a,int b) throws ArithmeticException
	{
		if(a==0 || b==0)
		{
			throw new ArithmeticException("Value cannot be zero");
		}
		else
		{
			return (a*b);
		}
	}
	
	public void CallByRef(FunctionDemo d) //Procedural Method and Impure
	{
		//Impure 
		System.out.println("Impure");
		System.out.println("Before Call By Ref :x: " + d.x + ":y:"+d.y );
		int tmp;
		tmp=d.x;
		d.x=d.y;
		d.y=tmp;
		
		System.out.println("After Call By Ref :x: " + d.x + ":y:"+d.y );
	}
	
	public void SquareRoot(int a) //Computation Method
	{
		
		System.out.println("Sqrt : " + Math.sqrt(a));
	}
	
	public boolean Pure(int a,int b) //Manipulation Method and Pure
	{
		if(a<b)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String UpperVowels(char a)
	{
		if (a=='a')
		{
			return "A";
		}
		else if (a=='e')
		{
			return "E";
		}
		else if (a=='e')
		{
			return "I";
		}
		else if (a=='o')
		{
			return "O";
		}
		else if (a=='u')
		{
			return "U";
		}
		else
		{
			return "Not Vowel";
		}
	}
	
	public static void main(String args[])
	{
		int c=10,d=1;
		try
		{
			FunctionDemo fun = new FunctionDemo();
			fun.Display();//Without Parameter
			fun.add(c,d);//Actual Parameter
		
			System.out.println(fun.add("Fun","Fan"));
		
			System.out.println(fun.divide(23,10));
		
			System.out.println(fun.divide(23,2));
		
			System.out.println(fun.Product(2,2));
						
			fun.SquareRoot(100);
		
			System.out.println("Pure " + fun.Pure(10,12));
			
			fun.CallByRef(fun);
			
			System.out.println("Multiple Return " + fun.UpperVowels('S'));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
