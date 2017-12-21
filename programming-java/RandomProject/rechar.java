import java.io.*;
import java.util.*;
public class rechar
{
    public static void main(String args[]) 
    { 
	try
	{
	
	
	 System.out.println("Please enter one word");
	 Scanner sc1=new Scanner (System.in);
     String a=sc1.next();

	 int s=a.length();

        int o=0;
	   long p[] = new long[s];
	   for(int l=0;l<=s-1;l=l+1)
         { 
          char c = a.charAt(l);
		   p[l]=(long)c;
        
        }
		for(int d=0;d<s-1;d++)
		{
		 if(p[d]==p[d+1])
		 {
		  o+=1;
		 }
		}
     
	System.out.println(""+o);  

	



	}
    catch(Exception elk)
    {
	  System.out.println("You have entered something wrong ! Please enter it properly as said");
	  elk.printStackTrace();
    }
    finally
    {
	System.out.println("Tata , Bye Bye--See you next time");
    }
	}
}
	   