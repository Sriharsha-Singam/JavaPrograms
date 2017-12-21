import java.io.*;
public class FunctionValRefDemo
{		
	public static int x=10; //Static variable and access specifier
	public static int y=5;
	
	
	public void CallByVal(int a,int b) 
	{
		System.out.println("CallByVal");
		System.out.println("Before Swap a:b=-> " + a +":"+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After Swap a:b:=->" + a +":"+b);
	}
 
	public void CallByRef(FunctionValRefDemo d) 
	{
		
		System.out.println("CallByRef");
		System.out.println("Before Swap :x: " + d.x + ":y:"+d.y );
		int tmp;
		tmp=d.x;
		d.x=d.y;
		d.y=tmp;
		
		System.out.println("After Call By Ref :x: " + d.x + ":y:"+d.y );
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
		int i=10,j=12;
		try
		{						
			FunctionValRefDemo fun = new FunctionValRefDemo();
			fun.CallByVal(i,j);
			fun.CallByRef(fun);
System.out.println("Multiple Return " + fun.UpperVowels('S'));			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
