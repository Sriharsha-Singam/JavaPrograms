import java.io.*;
import java.util.*;
public class average
//IN THIS PROGRAM I WILL FIND THE AVERAGE!
{
 public static void main(String arg[])
    {
	 
	  System.out.println("what amount of numbers  would you like to find the average for?");
	  Scanner obj=new Scanner(System.in);
	  float m=obj.nextFloat(); 
	  float a,d=0;
	  System.out.println("Now enter the numbers that you the average for!");
	 
	  for(a=1;a<=m;a++)
     {
	  
	  Scanner obj1=new Scanner(System.in);
	  float b=obj1.nextFloat();
      
        d=d+b;
     }
     float e=d/m;
      System.out.println("The average of these numbers that you entered is"+e);
    }
}