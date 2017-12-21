import java.io.*;
public class FileInputStreamDemo
{ 
    public static void main(String[] args) 
	{               
        try 
		{
			int i;
			FileInputStream fin = new FileInputStream(args[0]);
			do
			{
				
				i=fin.read();
				System.out.println(" i "+i);
				if(i!=-1)
				{
					System.out.println((char)i);					
				}
			}
            while(i!=-1);
			fin.close();
        } 
		catch (Exception e) 
		{
            e.printStackTrace();
        }
    }
}