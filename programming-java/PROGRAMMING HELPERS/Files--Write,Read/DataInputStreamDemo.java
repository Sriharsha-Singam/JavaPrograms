import java.io.*;
public class DataInputStreamDemo
{
	public static void main(String[] as)
	{
		  try
		  {
				DataInputStream dis = new DataInputStream(System.in);
				System.out.println("Enter First Number");
				int a =Integer.parseInt(dis.readLine());
				System.out.println("Enter Second Number");
				int b = Integer.parseInt(dis.readLine());
				int sum = a+b;
				System.out.println("Sum is "+sum);
			   
		  }
		  catch (Exception e)
		  {
				e.printStackTrace();
		  }
	}
}