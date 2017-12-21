import java.io.*;
import java.util.*;
public class ifstatement
//IN THIS PROGRAM I WILL USE IF STATEMENT!
{
 public static void main(String arg[])
    {
	 
	  System.out.println("please enter a number below 20!");
	  Scanner obj=new Scanner(System.in);
	  int a=obj.nextInt(); 
	  if(a>=10)
	  {
	   System.out.println("The number you entered was either = 10 or was greater than 10!");
	  }
	  if(a<10)
	  {
	   System.out.println("The number you entered was lesser than 10");
	   }
	}
}