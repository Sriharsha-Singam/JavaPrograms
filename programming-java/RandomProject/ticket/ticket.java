import java.io.*;
import java.util.*;
public class ticket
//Flight ticket=Rs.5,000--Business class =d=Rs.900 --First class= d=Rs.1,000--Economy=d=10%
//Bus = Rs.1,000--15% discount
//to make an itenary!
{
 public static void main(String arg[])
    {
	 
	  System.out.println("please enter your name");
	  Scanner obj=new Scanner(System.in);
	  String a=obj.nextLine(); 
      System.out.println("please enter the number of people coming with you?");
	  Scanner obj1=new Scanner(System.in);
	  int b=obj1.nextInt();
	  System.out.println("please enter through what type of mode of transport -[flight=f] or [bus=t]?");
	  Scanner obj2=new Scanner(System.in);
	  char c=obj2.nextLine().charAt(0);
	  System.out.println("please enter at what time you would to board the "+c);
	  Scanner obj4=new Scanner(System.in);
	  int f=obj4.nextInt();
	 
	if(c=='f')
	  {
	    System.out.println("please enter through what type class you want to go through - [Business class=b] or [First class=f] or [Economy class=e] ?");
		Scanner obj3=new Scanner(System.in);
	    char d=obj3.nextLine().charAt(0);
		if(d=='b')
		{
		  System.out.println("The origanal ticket price is 5,000 rupees ,but there is a discount of 900 rupees");
                   b+=1;
		  int e=b*(5000-900);
		  System.out.println("You will have to pay totally " +e);
		  System.out.println("You will be traveling by Qatar Airlines [Flight no.--[qu3489]] ");
		   f+=2;
		  System.out.println("You will have to start borading the flight at sharp "+f);
		  System.out.println("THANKS FOR USING QATAR AILINES");
		}
	   
		else if(d=='f')
		{
		  System.out.println("The origanal ticket price is 5,000 rupees ,but there is a discount of 1,000 rupees");
                  b+=1;
		  int hk=b*(5000-1000);
		  System.out.println("You will have to pay totally " +hk);
		  System.out.println("You will be traveling by Delta Airlines [Flight no.--[De3909]]");
		   f+=2;
		  System.out.println("You will have to start borading the flight at sharp "+f);
		  System.out.println("THANKS FOR USING DELTA AILINES");
		}
		else if(d=='e')
		{
		  System.out.println("The origanal ticket price is 5,000 rupees ,but there is a discount of 10%");
                  b+=1;
		 int javas=(5000*10/100);
                 int harsha=b*(5000-javas);
		  System.out.println("You will have to pay totally "+harsha);
		  System.out.println("You will be traveling by Lufthansa Airlines [Flight no.--[Lu50312]]");
		   f+=1;
		  System.out.println("You will have to start borading the flight at sharp "+f);
		  System.out.println("THANKS FOR USING LUFTHANSA AILINES");
		}
	  }
	
	    else if(c=='t')
	    {
		  System.out.println("please enter at what bus stop you would like to start from ?");
		  Scanner obj8=new Scanner(System.in);
	     char mn=obj8.nextLine().charAt(0);
		  System.out.println("The origanal ticket price is 1,000 rupees ,but there is a discount of 15%");
                  b+=1;
		  int u=1000-(1000*15/100);
                  int jk=b*u;
		  System.out.println("You will have to pay totally " +jk);
		  System.out.println("You will be traveling by Volvo [Bus no.--[Vo2465]] at bus station " +mn);
		   f+=2;
		  System.out.println("You will have to start borading the bus at sharp "+f);
		  System.out.println("THANKS FOR USING Volvo Buses");
		}
	  else
	   {
	     System.out.println("You have entered some invalid information!!!!!!!!");
	    
	   }
	
	  
	}
	
	 
}
		  