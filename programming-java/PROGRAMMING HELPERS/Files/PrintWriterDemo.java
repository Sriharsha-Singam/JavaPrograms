import java.io.*;
public class PrintWriterDemo
{ 
    public static void main(String[] args) 
	{               
        try 
		{
				PrintWriter pw = new PrintWriter(System.out,true);
				pw.write("Sample Out Put");
				int i =10;
				char c='s';
				pw.println("Int " + i);
				pw.println("Char " + c);
            
        } 
		catch (Exception e) 
		{
            e.printStackTrace();
        }
    }
}