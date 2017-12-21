import java.io.*;
import java.util.*;
public class triangle4
//IN THIS PROGRAM I WILL USE for LOOP!
{
 public static void main(String arg[])
    {
	   int b,c;
	 
	  System.out.println("please enter a number below 79 for the dimension of a Triangle!");
	  Scanner obj=new Scanner(System.in);
	  int a=obj.nextInt();
	  
	  for(b=1;b<=a;b++)
     {                                      
        for(c=0;c<b;c++)
        {
	
            System.out.print("*");
        }
		System.out.println(" ");
	 }
	 
	 for(b=0;b<=a;b++)
     {                                      
        for(c=a;c>=b;c--)
        {
	
            System.out.print("*");
        }
		System.out.println(" ");
	 }
	}
}
	 