import java.io.*;
import java.util.*;
public class mmm
{

	public void mean(float a,float b,float c, float d, float f)
	{

	   
	
	    float ls= (a+b+c+d+f)/5;
		System.out.println("The Mean is " +ls);
	}
	public void median(float a,float b,float c, float d, float f , float marks[])
	{
	  
		for(int i=0;i<4;i++)
      {
        int min=i;
        for (int k=i+1;k<4;k++)
        {
            if(marks[k]<marks[min])
            {
                min = k;
            }
        }
        if (i != min) 
        {
            float temp=marks[i];
            marks[i]=marks[min];
            marks[min]=temp;
        }
      }
	  System.out.println("The Median " +marks[2]);
	}
		public void mode(float a,float b,float c, float d, float f)
	{
	   int a1=0,b1=0,c1=0,d1=0,f1=0;
	   if(a==b)
	   {
	    a1++;
	   }
	   	if(a==c)
	   {
	    a1++;
	   }
		if(a==d)
	   {
	    a1++;
	   }
	    if(a==f)
	   {
	    a1++;
	   }
	    if(b==a)
	   {
	    b1++;
	   }
	   	if(b==c)
	   {
	    b1++;
	   }
	   	 if(b==d)
	   {
	    b1++;
	   }
	   	 if(b==f)
	   {
	    b1++;
	   }
	   	if(c==a)
	   {
	    c1++;
	   }
	   	 if(c==b)
	   {
	    c1++;
	   }
		if(c==d)
	   {
	    c1++;
	   }
	   	if(c==f)
	   {
	    c1++;
	   }
		if(d==a)
	   {
	    d1++;
	   }
		if(d==b)
	   {
	    d1++;
	   }
		if(d==c)
	   {
	    d1++;
	   }
		if(d==f)
	   {
	    d1++;
	   }
		if(f==a)
	   {
	    f1++;
	   }
	   	if(f==b)
	   {
	    f1++;
	   }
	   	if(f==c)
	   {
	    f1++;
	   }
	   	if(f==d)
	   {
	    f1++;
	   }
	   System.out.println("" + a1);
	   System.out.println("" + b1);
	   System.out.println("" + c1);
	   System.out.println("" + d1);
	   System.out.println("" + f1);
	   
       if(a1>=b1 && a1>=c1 && a1>=d1 && a1>=f1)
	   {
	    System.out.println("The mode is " + a);
	   }
	    else if(b1>=a1 && b1>=c1 && b1>=d1 && b1>=f1)
	   {
	    System.out.println("The mode is " + b);
	   }
	   else if(c1>=b1 && c1>=a1 && c1>=d1 && c1>=f1)
	   {
	    System.out.println("The mode is " + c);
	   }
	    else if(d1>=b1 && d1>=c1 && d1>=a1 && d1>=f1)
	   {
	    System.out.println("The mode is " + d);
	   }
	    else if(f1>=b1 && f1>=c1 && f1>=d1 && f1>=a1)
	   {
	    System.out.println("The mode is " + f);
	   }
	   else 
	   {
	   System.out.println("No numbers have been matched -- sorry! " );
	   }
	}

   public static void main(String arg[])
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
		
        float marks[] = new float[5];   
       
     for(int i=0;i<=4;i++)
        {
           Scanner sc=new Scanner (System.in);
            marks[i]=sc.nextFloat();
        }			
	
	    System.out.println("Would you like to find mean=1 or median =2 or mode = 3");
	    Scanner obj=new Scanner(System.in);
	    int l=obj.nextInt();
	 
	   mmm fun = new mmm();
       if(l==1)
	   {

	    fun.mean(marks[0],marks[1],marks[2],marks[3],marks[4]);
	   }
	   else if(l==2)
	   {
        
	
	    fun.median(marks[0],marks[1],marks[2],marks[3],marks[4], marks);
	   }
	   	   else if(l==3)
	   {
        
		
	    fun.mode(marks[0],marks[1],marks[2],marks[3],marks[4]);
	   }
          else
	    {
	    System.out.println("You have not entered any of the above");
	    }	  	 
     }
       catch(Exception e)
      {
       System.out.println("INFINITE OR ERROR...ERROR...ERROR......................");
      }
	
	}
 
}