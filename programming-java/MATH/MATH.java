import java.io.*;
import java.util.*;
public class MATH
//IN THIS PROGRAM I WILL USE IF STATEMENT!
{
 public static void main(String arg[])
    {
      try
      {
	 
	  System.out.println("What operator would you like to use ?\n [ADDITION - print a]\n or[SUBRACTION - print s]\n or[MULTIPLICATION - print m]\n or[DIVISION - print d]\n or[Square root-print r]\n or[exponents-print e]\n or[rounding up-c]\n or[rounding-down -f]");
	  Scanner obj=new Scanner(System.in);
	  char b=obj.next().charAt(0);
      if(b=='a'||b=='A')
	  {
	   System.out.println("Enter two numbers");
	   Scanner obj2=new Scanner(System.in);
	   Long a=obj2.nextLong();
	   Scanner obj1=new Scanner(System.in);
	   Long d=obj1.nextLong();
	   Long harsha=d+a;
	   System.out.println("the sum is " +harsha);
	  }
	  else if(b=='s'||b=='S')
	  {
	    System.out.println("Enter two numbers");
	   Scanner obj9=new Scanner(System.in);
	   Long fh=obj9.nextLong();
	   Scanner obj10=new Scanner(System.in);
	   Long gh=obj10.nextLong();
	   Long harsh=fh-gh;
	   System.out.println("the output is " +harsh);
	  }
	   else if(b=='m'||b=='M')
	  {
	    System.out.println("Enter two numbers");
	   Scanner obj4=new Scanner(System.in);
	   Long fo=obj4.nextLong();
	   Scanner obj105=new Scanner(System.in);
	   Long go=obj105.nextLong();
	   Long hars=go*fo;
	   System.out.println("the product is " +hars);
	  }
	   else if(b=='d'||b=='D')
	  {
	    System.out.println("Enter two numbers");
	   Scanner obj3=new Scanner(System.in);
	   long fu=obj3.nextLong();
	   Scanner obj1056=new Scanner(System.in);
	   long gu=obj1056.nextLong();
	   Long har=fu/gu;
	   System.out.println("the quotient is " +har);
	  }
          else if(b=='r'||b=='R')
          {
           System.out.println("Enter a number");
	   Scanner obj3p=new Scanner(System.in);
	   long fuh=obj3p.nextLong();
	 
	   System.out.println("the square root is " +Math.sqrt(fuh));
          }
          else if(b=='e'||b=='E')
          {
           System.out.println("Enter the two numbers");
           Scanner sw=new Scanner(System.in);
           long elrw=sw.nextLong();
           Scanner s=new Scanner(System.in);
           long elr=s.nextLong();
           System.out.println("The answer is " +Math.pow(elrw,elr)); 
        
          }

          else if(b=='c'||b=='C')
          {
            System.out.println("Enter the number");
           Scanner swe=new Scanner(System.in);
           float elrwe=swe.nextFloat();
           System.out.println("The answer is " +Math.ceil(elrwe));
          }
           
           else if(b=='f'||b=='F')
          {
            System.out.println("Enter the number");
           Scanner se=new Scanner(System.in);
           float elwe=se.nextFloat();
           System.out.println("The answer is " +Math.floor(elwe));
          }


	  else
	  {
	    System.out.println("You have not entered any operator");
	  }
       }
       catch(Exception e)
      {
       System.out.println("INFINITE OR ERROR...ERROR...ERROR......................");
      }
	}
}