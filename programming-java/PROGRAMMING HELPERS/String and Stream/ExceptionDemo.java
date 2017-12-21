public class ExceptionDemo
{
	public static void main(String a[])
	{
		int a=10,b=0,c;
		try
		{
			c=a/b;
			System.out.println(“Output” + c);
		}
		catch(Exception e)
		{
			System.out.println(“Wrong Input”);		
		}
		finally
		{
			System.out.println(“See you again Bye!!” );
		}
	}
}