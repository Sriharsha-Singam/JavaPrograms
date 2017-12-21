import java.io.*;
public class FunctionPureImpureDemo
{		
	public static int x=10; //Static variable and access specifier
	public static int y=5;
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
	
	public void SquareRoot(int a) //Computation Method and Pure
	{
		
		System.out.println("Sqrt : " + Math.sqrt(a));
	}
 
	public void Impure(FunctionPureImpureDemo d) //Procedural Method and Impure
	{
		//Impure 
		System.out.println("Impure");
		System.out.println("Before Swap :x: " + d.x + ":y:"+d.y );
		int tmp;
		tmp=d.x;
		d.x=d.y;
		d.y=tmp;
		
		System.out.println("After Call By Ref :x: " + d.x + ":y:"+d.y );
	}

			
	public static void main(String args[])
	{
		int i=10,j=12;
		try
		{						
			FunctionPureImpureDemo fun = new FunctionPureImpureDemo();
			fun.Pure(i,j);			
			System.out.println("Pure Value : "+fun.Pure(i,j));
			fun.SquareRoot(i);
			fun.Impure(fun);			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
