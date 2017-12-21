import java.io.*;
import java.util.*;
public class cube
//IN THIS PROGRAM I WILL USE IF STATEMENT!
{
 public static void main(String arg[])
    {
	   int b,c;
	 
	  System.out.println("please enter a number for the dimension of a square!");
	  Scanner obj=new Scanner(System.in);
	  int a=obj.nextInt();
	  for(b=1;b<=a;b++)
     {

        for(c=1;c<=a;c++)
        {
            System.out.print("*");
        }
		System.out.println("");
	 }
	}
}