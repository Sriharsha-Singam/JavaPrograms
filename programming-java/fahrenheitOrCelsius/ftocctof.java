import java.io.*;
import java.util.*;
public class ftocctof
{

	public void CelsiustoFahrenheit (float a)
	{
	    float mkj= (a+32);
		System.out.println(" The Fahrenheit is " +(1.8*mkj)+"F");
	}
	public void FahrenheittoCelsius (float a)
	{
	    float mlk= (a-32);
		System.out.println(" The Celsius is " +(0.55555555555555555555555555556*mlk)+"C");
	}
	

   public static void main(String arg[])
    {
     try
	 {
	    System.out.println("Would you like to find Celsius=1 or Fahrenheit =2 ");
	    Scanner obj=new Scanner(System.in);
	    int l=obj.nextInt();
	 
	   ftocctof fun = new ftocctof();
       if(l==1)
	   {
        System.out.println("please enter the Temperature in Fahrenheit!");
		Scanner obj1=new Scanner(System.in);
	    float a=obj1.nextFloat();
	    fun.FahrenheittoCelsius(a);
	   }
	   else if(l==2)
	   {
        
        System.out.println("please enter the Temperature in Celsius!");
		Scanner obj12=new Scanner(System.in);
	    float b=obj12.nextFloat();		
	    fun.CelsiustoFahrenheit(b);
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