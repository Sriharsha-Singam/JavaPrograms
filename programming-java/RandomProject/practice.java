import java.util.*;
public class practice
{
  public static void main(String[] args)
  {
   try
   {   
    int a[]=new int[5];
	int b[]=new int[5];
	int lml=a.length;
	int lmg=b.length;
	int harsha =lml+lmg;
	int c[]=new int[harsha];
	Scanner in=new Scanner(System.in);
	
    System.out.println("Enter any 5 numbers !!");
	for (int d=0;d<5;d++)
	{
	  a[d]=in.nextInt();
	}
	 System.out.println("Enter any 5 numbers !!");
  	for (int d=0;d<5;d++)
	{
	  b[d]=in.nextInt();
	}
    for (int d=0;d<5;d++)
	{
	  c[d]=a[d];
	  }
	int e=0;
     
	for(int l=5;l<10;l++)
	{
	
     c[l]=b[e]; 
	 e+=1;
	}
	System.out.println("------------------------------------------------------------------------------------");
	for(int i=0;i<10;i++)
	{
	
	System.out.println(""+c[i]);
	}
	int lm=c.length;
	for(int i=0;i<lm-1;i++)
	{
	 int min=i;
	 for(int k=i+1;k<lm;k++)
	 {
	   if(c[min]>c[k])
	   {
	    min=k;
		}
	  }
	
	 if (i!=min)
     {
	   int temp=c[i];
	   c[i]=c[min];
	   c[min]=temp;
	  }
	}
		System.out.println("------------------------------------------------------------------------------------");
		for(int i=0;i<10;i++)
	{
	System.out.println(""+c[i]);
	}
	 
	  System.out.println("Please enter the number you would like to search for!");
	  int g=in.nextInt();
	  int first=0;
	  int last=harsha-1;
	  int middle=(first+last)/2;
	  while( first <= last )
    {
      if ( array[middle] < search )
      {
          first = middle + 1;    
      }
      else if ( array[middle] == search ) 
      {
        System.out.println(search + " found at location " + (middle + 1) + ".");
        break;
      }
      else
      {
         last = middle - 1;
      }
      middle = (first + last)/2;
	 }
	 }
   catch(Exception elk)
    {
	  System.out.println("You have entered something wrong ! Please enter it properly as said");
	  elk.printStackTrace();
    }
  
    
  
  }
}