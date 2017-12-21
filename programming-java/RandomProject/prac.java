import java.util.*;
public class prac
{
  public static void main(String[] args)
  {
   System.out.println("please enter 5 numbers !!!!");
   Scanner obg=new Scanner(System.in);
   int num[]=new int[5];
   for (int a=0;a<5;a++)
   {
     num[a]=obg.nextInt();
   }
   int a=num.length;
   for (int i=0;i<a-1;i++)
   { 
    int min=i;
	for(int k=i+1;k<a;k++)
     {
         if(num[k]<num[min]) 
		 {
		  min=k;
		 }
      }	 
	 if(i!=min)
	 {
	 int temp=num[i];
	 num[i]=num[min];
	 num[min]=temp;
	 }
   }
   System.out.println("========================================================================================================================================================");
   for(int j=0;j<a;j++)
   {
   System.out.println(num[j]);
   }
   System.out.println("========================================================================================================================================================");
   System.out.println("What number would you like to find!!");
   int lm=obg.nextInt();
   for(int c=0;c<a;c++)
   {
     if (num[c]==lm)
	 {
	 System.out.println("It is in index no."+(c+1));
	 break;
	 }
	 if(c==a-1)
	 {
	  System.out.println("the number you entered is not there!!");
	 }
   }
  System.out.println("========================================================================================================================================================");
    //System.out.println("descending order!");
	//for (int c=0;)
   
   
   
   
   
   
   
  }
}
