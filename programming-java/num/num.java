import java.io.*;
import java.util.*;
public class num

{
 public static void main(String arg[])
    {
	     System.out.println("please enter a number");
	     Scanner obj=new Scanner(System.in);
	     int a=obj.nextInt();                                       
		 int f,s,t;
		 f=0;s=1;
		 for (int i=1;i<=a;i++)
		{
			t=s+f;
			System.out.println(""+t);
			f=s;
			s=f;
			f=t;
		}
   }
}