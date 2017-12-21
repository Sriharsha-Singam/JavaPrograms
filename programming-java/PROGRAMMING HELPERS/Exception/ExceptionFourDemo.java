import java.util.*;
import java.io.*;
public class ExceptionFourDemo 
{
  	public static void main(String args[]) throws IOException
  	{
			String filename = "C:\\test111\\welcome.txt";
			File f = new File(filename);
			try
			{
				boolean b= f.exists();
				/*if (!f.exists())
				{
				
					//throw new FileNotFoundException("Missing file");
				
				}
				else {
					System.out.println("File Found");
				}*/
			}
			catch(Exception ee)
			{
				System.out.println("Execption " + ee);
			}
			
			
			
			
  	}
}
