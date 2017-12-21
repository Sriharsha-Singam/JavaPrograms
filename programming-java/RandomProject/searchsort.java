import java.util.*;
import java.io.*;
public class searchsort
{
   public static void main(String args[])
   {
try
{   
   int num[]=new int[5];
   System.out.println("Please enter 5 numbers of your choice !!!");
   Scanner obiwan=new Scanner(System.in);
   for (int i=0;i<5;i++)
   {
   num[i]=obiwan.nextInt();
   }
     System.out.println("Please enter which number you would like to find!!");   
	 Scanner kenobi=new Scanner(System.in);
	 int search=kenobi.nextInt();

	    for (int k=0;k<5;k++)
		{
	 
		  if(num[k]==search)
		  {
		    System.out.println("the number you were looking for was the " +(k+1)+ " number you entered!!");
		   break ;
		  }
		  
		}

	 for(int i=0;i<4;i++)
	 {
	 int l=i;
	 for (int k=i+1;k<5;k++)
	 {
	 
	  if(num[k]<num[l])
	  {
            l=k;
	  }
      }
	  if(i!=l)
	  {
	   int swap=num[i];
	   num[i]=num[l];
	   num[l]=swap;
	  }
   }
   for(int ko=0;ko<=5;ko++)
   {
     System.out.println("the ascending order is "+num[ko]);
   }
   {
   catch(Exception e)
   {
   System.out.println("You have entered something wrong!!");
   }
   
   
   }
}