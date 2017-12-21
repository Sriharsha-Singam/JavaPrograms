import myjava.*;
public class UserDefinedExceptionDemo 
{
	public static void main(String[] args)throws Exception
	{
		int price = -120;
 
		if(price < 0)
		{
			throw new MySchoolException("My Exception : " + price);
		}
		else
		{
			System.out.println("Your age is :"+price);
		}
   }
}