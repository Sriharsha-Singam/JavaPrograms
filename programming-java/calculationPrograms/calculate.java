import java.io.*;
import java.util.*;
public class calculate
{

	public void addition(int a,int b)
	{
		System.out.println("The sum of the two numbers you entered = " +(a+b));
	}
	public void subtraction(int a,int b)
	{
		System.out.println("The subtraction of the two numbers you entered = " +(a-b));
	}
	public void multiplication(int a,int b)
	{
		System.out.println("The product of the two numbers you entered = " +(a*b));
	}
	public void division(int a,int b)
	{
		System.out.println("The quotient of the two numbers you entered = " +(a/b));
	}
	

   public static void main(String arg[])
    {
     try
	 {
	    System.out.println("What operator would you like to use ADDITION=1 or SUBRACTION=2 or MULTIPLICATION=3 or DIVISION=4");
	    Scanner obj=new Scanner(System.in);
	    int l=obj.nextInt();
	    System.out.println("please enter any two numbers!");
	    Scanner obj1=new Scanner(System.in);
	    int a=obj1.nextInt();
	    Scanner obj12=new Scanner(System.in);
	    int b=obj12.nextInt();
	    calculate fun = new calculate();
       if(l==1)
	   {	    
	    fun.addition(a,b);
	   }
	   else if(l==2)
	   {	   
	   fun.subtraction(a,b);
	   }
	    else if(l==3)
	    {
	     fun.multiplication(a,b);
	    }
	    else if(l==4)
	    {	   
	     fun.division(a,b);
	    }
          else
	    {
	    System.out.println("You have not entered any of the operators");
	    }	  	 
     }
       catch(Exception e)
      {
       System.out.println("INFINITE OR ERROR...ERROR...ERROR......................");
      }
	}
}