import java.util.*;
import java.io.*;
public class roman
{
    

public static void main(String args[])
   {
      try
      { 
	  System.out.println("Please enter your name!!");
	  String name[] =new String[5];
		  for(int i=0;i<=4;i++)
        {
           Scanner sc1=new Scanner (System.in);
            name[i]=sc1.next();
        }
		System.out.println("Please enter your number!!");
		
        int no[] = new int[5];   
       
     for(int i=0;i<=4;i++)
        {
           Scanner sc=new Scanner (System.in);
            no[i]=sc.nextInt();
        }
				System.out.println("Please enter your age!!");
		
        int aage[] = new int[5];   
       
     for(int i=0;i<=4;i++)
        {
           Scanner sc=new Scanner (System.in);
           aage[i]=sc.nextInt();
        }
System.out.println("Please enter your pin code!!");		
       int pin[] = new int[5];   
       
     for(int i=0;i<=4;i++)
        {
           Scanner sc=new Scanner (System.in);
            pin[i]=sc.nextInt();
        }			
      
	  System.out.println("Please enter your address!!");	
	  String add[] =new String[5];
		  for(int i=0;i<=4;i++)
        {
           Scanner sc1=new Scanner (System.in);
            add[i]=sc1.next();
        }
	for(int i=0;i<5;i++)
    {
         int min=i;
        for (int k=i+1;k<6;k++)
        {
            if(no[k]<no[min])
            {
                min = k;
            }
        }
        if (i != min) 
        {
            int temp=no[i];
            no[i]=no[min];
            no[min]=temp;
        }
    }
    for (int j=0;j<4;j++) 
    {
        System.out.println(no[j]+" ");
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