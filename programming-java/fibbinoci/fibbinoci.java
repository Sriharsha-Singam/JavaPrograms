import java.io.*;
import java.util.*;
public class fibbinoci

{
 public static void main(String arg[])
    {
	     System.out.println("please enter a number");
	     Scanner obj=new Scanner(System.in);
	     int a=obj.nextInt();
        
		 int f,s,t;
		 f=0;s=1;
		 System.out.println(""+f);
		 
		 for (int i=0;i<=a;i++)
		{
			t=s+f;
			System.out.println(""+t);
			f=s;
			s=t;
		
			
		}
   }
}