public class ExceptionTwoDemo
{
	public static void main(String aeg[])
	{
		int a=aeg.length;
		System.out.println("a = " + a);
		try
		{
			int b=42/a;
			int c[]={1};
			c[0]=9;			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index " + e);		
		}
		catch(ArithmeticException ee)
		{
			System.out.println("Arithmetic " + ee);		
		}
		finally
		{
			System.out.println("See you again Bye!!");
		}
	}
}