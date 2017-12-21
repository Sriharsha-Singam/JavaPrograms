import java.io.*;
public class ExceptionThreeDemo
{
	public static void main(String aeg[])
	{
		String filename = "C:\\test111\\welcome.txt";
		File f = new File(filename);
		
		try
		{
		
		//int a=10,b=0,c;
		//c=a/b;
			if (!f.exists())
			{
				
				throw new FileNotFoundException("Missing file");
				
			}
			else {
				System.out.println("File Found");
			}
		}
		catch(Exception ee)
		{
			//System.out.println("Exception " + ee);
		}
	}
}