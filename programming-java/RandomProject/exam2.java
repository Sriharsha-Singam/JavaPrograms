import java.io.*;
import java.util.*;
public class exam2
{
  public static void main(String arg[])
  {
  try
  {
    int exam[]=new int[10];
	int lxam[]=new int[10];
	System.out.println("Please enter any 10 positive numbers!!!");
    Scanner obg=new Scanner(System.in);
	for(int a=0;a<10;a++)
	{
	 exam[a]=obg.nextInt();
	}
	int p=exam.length;
    exam[0]=lxam[0];
	for(int i=1;i<=p;i++)
	{
	  
	  for(int k=1;k<=p;k++)
	  {
	   if(lxam[i]==k)
	   { 
	    i+=1;
	   }
	   else
	   {
	    lxam[i]=exam[i];
	    break;
	   }
	  }
	 
	}
	for (int c=0;c<(p-1);c++)
	{
	 for(int d=0;d<p-c-1;d++)
	 {
	  if (lxam[d]<lxam[d+1])
	  {
	   int swap=lxam[d];
	   lxam[d]=lxam[d+1];
	   lxam[d+1]=swap;
	  }
	 }
	}
	for(int j=0;j<lxam.length;j++)
	{
     System.out.println(""+lxam[j]);
	}
    /*System.out.print("THE SUM =");
    int l=exam[0]+exam[1]+exam[2]+exam[3]+exam[4];
	 System.out.println(""+l);
	  System.out.println("====================================================================================");
	}
	*/
	}
	catch(Exception e)
	{
	 System.out.println("THERE IS AN ERROR");
	 e.printStackTrace();
	 
	}
	finally
	{
	 System.out.println("BYE -  Thanks for your cooperation and I hope you  had fun!!!");
	}
	 
		
  
  }

}
