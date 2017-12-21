import java.io.*;
public class PrinterWriterDemo
{
	public static void main(String a[]) throws IOException
	{
		PrintWriter f0 = new PrintWriter(new FileWriter("C:\\Users\\saravanan.s\\Desktop\\output.txt"));
		for(int i=0;i<10;i++)
		{
			f0.println("Result "+ i +" : ");
		}
		f0.close();
	}
}
