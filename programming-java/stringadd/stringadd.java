import java.io.*;
import java.util.*;
public class stringadd
//IN THIS PROGRAM I WILL convert string into integer and i wil add it!
{
 public static void main(String arg[])
    { 
	  
	 
	  System.out.println("please enter two numbers!");
	  Scanner obj=new Scanner(System.in);
	  String b=obj.next();
	   
	  Scanner obj1=new Scanner(System.in);
	  String a=obj1.next();
	  int g=Integer.parseInt(a);
	  int l=Integer.parseInt(b);
	  int c=g+l;
	  String a=obj.next();
	  Scanner obj1=new Scanner(System.in);
	  System.out.println("the sum of the numbers that you entered was"+c);
	}
}