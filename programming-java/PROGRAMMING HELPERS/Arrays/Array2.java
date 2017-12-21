import java.util.*;
public class Array2

{
    public static void main(String args[]) 
    { 
	try
	{
	 System.out.println("Please enter names of 5 students!!");
	
		String students[] =new String[5];
		  for(int i=0;i<=4;i++)
        {
           Scanner sc1=new Scanner (System.in);
            students[i]=sc1.next();
        }
		System.out.println("Please enter each of their Math marks!!");
		
        int marks[] = new int[5];   
       
     for(int i=0;i<=4;i++)
        {
           Scanner sc=new Scanner (System.in);
            marks[i]=sc.nextInt();
        }			
	
		
	
      
        for(int i = 0; i < marks.length; i++) 
        { 
            System.out.println(students[i] + "="+marks[i]+"%"); 
             
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
