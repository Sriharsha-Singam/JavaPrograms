import java.util.*;
public class palindrome

{
    public static void main(String args[]) 
    { 
	try
	{
	
	
	 System.out.println("Please enter a word");
	 Scanner sc1=new Scanner (System.in);
     String a=sc1.next();
	 int s=a.length();

	 String j="";
	
	 for(int l=s-1;l>=0;l--)
	 
        { 
        char c = a.charAt(l);
		 j=j+c;
		 
        
        }
		
        int lm=a.compareTo(j);
	
        if( lm == 0)
		{
		System.out.println("IT IS A PALINDROME!!!");
		}
		else
		{
		System.out.println("IT IS NOT A PALINDROME!!!");
		}
	 
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