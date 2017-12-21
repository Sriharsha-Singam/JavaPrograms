import java.util.*;
public class cases
{
	public static void main(String ar[])
	{
	try
	{

	 System.out.println("Please enter a sentence with different cases!");
	 Scanner sc1=new Scanner (System.in);
     String ag=sc1.nextLine();
     int s=ag.length();
	 System.out.println("This is the reverse of each case :");
	 for(int l=0;l<s;l=l+1)
	 
        { 
        Boolean ad=Character.isLowerCase(ag.charAt(l));
		if (ad==true)
		{
		 System.out.print(""+Character.toUpperCase(ag.charAt(l)));
		}
		else if (ad==false)
		{
		 System.out.print(""+Character.toLowerCase(ag.charAt(l)));
		}
		else 
        {
           	System.out.print("Man seriously!!!");
        }			

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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
