import java.io.*;
import java.util.*;
public class practicalexam
{
  public static void main(String arg[])
  {
  try
  {
    int exam[]=new int[5];
	System.out.println("Please enter any 5 positive numbers!!!");
    Scanner obg=new Scanner(System.in);
	for(int a=0;a<5;a++)
	{
	 exam[a]=obg.nextInt();
	}
	int p=exam.length;
	System.out.println("Now I will show you the numbers you have entered in Descending order!!");
	System.out.println("DESCENDING ORDER");
	System.out.println("================");
	for(int i=0;i<p-1;i++)
	{
	  int min=i;
	  for(int k=i+1;k<p;k++)
	  {
	   if(exam[k]>exam[min])
	   { 
	    min=k;
	   }
	  }
	  if(i!=min)
	  {
	   int temp=exam[i];
	   exam[i]=exam[min];
	   exam[min]=temp;
	  }
	}
	for (int i=0;i<5;i++)
	{
	 System.out.println(exam[i]);
	}
    System.out.println("Now I will show you the sum of the numbers you entered!!");
    System.out.print("THE SUM =");
    int l=exam[0]+exam[1]+exam[2]+exam[3]+exam[4];
	 System.out.println(""+l);
	  System.out.println("====================================================================================");
	}
	catch(Exception e)
	{
	 System.out.println("THERE IS AN ERROR");
	 
	}
	finally
	{
	 System.out.println("BYE -  Thanks for your cooperation and I hope you  had fun!!!");
	}
	 
		
  
  }

}
