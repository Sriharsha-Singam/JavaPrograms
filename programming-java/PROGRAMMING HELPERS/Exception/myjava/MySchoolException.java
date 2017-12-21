package myjava;
public class MySchoolException extends Exception
{
	String strException;
	public MySchoolException(String exception)
	{
		this.strException = exception;		
	}
}