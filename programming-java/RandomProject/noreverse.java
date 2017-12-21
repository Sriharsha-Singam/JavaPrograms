import java.util.*;
public class noreverse 

{
    public static void main(String args[]) 
    { 
	try
	{
	
	 System.out.println("Please enter a word");
	 Scanner sc1=new Scanner (System.in);
     String a=sc1.next();
     int s=a.length();
	 System.out.println("This is the reverse :");
	 for(int l=s-1;l>=0;l=l-1)
	 
        { 
        char c = a.charAt(l);
		System.out.print("" + c);
        }
         System.out.println(" ");		
        
    }
    catch(Exception e)
    {
	  System.out.println("You have entered something wrong ! Please enter it properly as said");
	  
    }
    finally
    {
	System.out.println("Tata , Bye Bye--See you next time");
    }
	
	
	 
    	
    } 
}
