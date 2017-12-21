public class ExceptionOneDemo
{
	public static void main(String aeg[])
	{
		int a=10,b=0,c;
		try
		{
			c=a/b;
			System.out.println("Output" + c);
		}
		/*catch(Exception e)
		{
			System.out.println("Wrong Input");		
		}*/
		catch(ArithmeticException ee)
		{
			System.out.println("Wrong Input Data" + ee.toString());		
		}
		finally
		{
			System.out.println("See you again Bye!!");
		}
	}
}