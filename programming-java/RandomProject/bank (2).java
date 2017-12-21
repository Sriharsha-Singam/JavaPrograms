import java.io.*;
import java.util.*;
public class bank
{ 
   Scanner bankinfo=new Scanner(System.in);
   bank()
   {
   
   }
    void old(int a,String b , int c)
	{

		 System.out.println("Your ID number is "+a +" right??");
		 String e=bankinfo.nextLine();
		 int ab=e.compareTo("yes");
		int rij=e.compareTo("Yes");
		int lokio=e.compareTo("YES");
		 int aby=e.compareTo("no");
		int rijw=e.compareTo("No");
		int lokioz=e.compareTo("NO");		
	     if (ab==0||rij==0||lokio==0)
		 {
			
		   System.out.println("Your account balance is 1,800,000 INR!");
		   System.out.println("Do you have a Fixed Deposit or a Recursive Deposit");
		   String l=bankinfo.nextLine();
		   int abcdf=l.compareTo("Recursive Deposit");
		   int rijd=l.compareTo("recursive deposit");
	       int abcdfw=l.compareTo("fixed deposit");
		   int rijdw=l.compareTo("Fixed Deposit");
		   if (abcdf==0||rijd==0)
		   {
		    System.out.println("Would you like to Deposit Money or With Draw Money!");
			String lm=bankinfo.nextLine();
		   int abcdfe=lm.compareTo("deposit money");
		   int rijds=lm.compareTo("Deposit Money");
		    int abcdfeq=lm.compareTo("with draw money");
		   int rijdsq=lm.compareTo("With Draw Money");
			if(abcdfe==0||rijds==0)
			{
			 System.out.println("How much money do you want to Deposit");
			 int bgf=bankinfo.nextInt();
			 System.out.println("You have successfully Deposited "+bgf+" INR");
			 System.out.println("Your new Balance is"+(1800000+bgf)+" INR");
			 System.out.println("Thank You for using this Banking Software!!!!!");
			 System.exit(0);
			}
			else if (rijdsq==0||abcdfeq==0)
			{
			 System.out.println("How much money do you want to With Draw!!");
			 int gh=bankinfo.nextInt();
			 System.out.println("You have With Drawn "+gh+" INR -- Now Catch your precious money!!");
			 System.out.println("Your new Balance is "+(1800000-gh)+" INR");
			 System.out.println("Thank You for using this Banking Software!!!!!");
			 System.exit(0); 
			}
			else
		 {
		    System.out.println("Sorry You Have Entered Something Wrong-- The Program Will Have To Restart");
			System.exit(0);
		 }
		   }
		   else if(rijdw==0||abcdfw==0)
		   {
		    System.out.println("I am sorry -- you have a Fixed Deposit So , you can only make a new account!");
			System.exit(0);
		   }
		   	else
		 {
		    System.out.println("Sorry You Have Entered Something Wrong-- The Program Will Have To Restart");
			System.exit(0);
		 }
		   
		   
		 }
		 else if(lokioz==0||rijw==0||aby==0)
		 {
		    System.out.println("I am so sorry that it is not right --- you will have to restart the program!");
			System.exit(0);
		 
		 }
		 else
		 {
		    System.out.println("Sorry You Have Entered Something Wrong-- The Program Will Have To Restart");
			System.exit(0);
		 }
	  
	
	}
	bank(int kh,String lkd, int dkl)
	{
	 System.out.println("Your ID number is "+(long)kh);
	 System.out.println("Apparently the bank that you have chosen requires you to deposit 5000 INR ");
	 System.out.println("Would you like to deposit more money!!");
	 String kdj=bankinfo.nextLine();
	 	  int abcdfed=kdj.compareTo("yes");
		   int rijded=kdj.compareTo("Yes");
	       int abcdfwed=kdj.compareTo("YES");
		   int rijdwed=kdj.compareTo("no");
		   int abcdfwedE=kdj.compareTo("No");
		   int rijdwedE=kdj.compareTo("NO");
	 if (abcdfed==0||rijded==0||abcdfwed==0)
	 {
	  System.out.println("How much would you like to Deposit");
	  int dj=bankinfo.nextInt();
	  System.out.println("You have successfully Deposited "+dj+" INR");
	  System.out.println("Your new Balance is"+(dj+5000)+" INR");
	  System.out.println("Would you like to With Draw some money ");
	  String dej=bankinfo.next();
	  	  int ha=dej.compareTo("yes");
		   int has=dej.compareTo("Yes");
	       int hars=dej.compareTo("YES");
		   int harsh=dej.compareTo("no");
		   int harsha=dej.compareTo("No");
		   int blaha=dej.compareTo("NO");
	      if(ha==0||has==0||hars==0)
	      {
		   System.out.println("How much money do you want to With Draw!!");
			 int geh=bankinfo.nextInt();
			 System.out.println("You have With Drawn "+(geh)+" INR -- Now Catch your precious money!!");
			 System.out.println("Your new Balance is "+((dj+5000)-geh)+" INR");
			 System.out.println("Thank You for using this Banking Software!!!!!");
			 System.exit(0); 
	
	       }
	    else if(harsh==0||harsha==0||blaha==0)
	    {
	     System.out.println("Thank You for using this Banking Software!!!!!");
	     System.exit(0);
	    }
			  else
		 {
		    System.out.println("Sorry You Have Entered Something Wrong-- The Program Will Have To Restart");
			System.exit(0);
		 }
	 }
	 else if(rijdwed==0||abcdfwedE==0||rijdwedE==0)
	 {
	 System.out.println("Your new Balance is 5000 INR");
	 System.out.println("Thank You for using this Banking Software!!!!!");
	 System.exit(0);
	 }
	  else
		 {
		    System.out.println("Sorry You Have Entered Something Wrong-- The Program Will Have To Restart");
			System.exit(0);
		 }
		
	  
	
	}
    public static void main(String[] args) 
	{       
	 Scanner bankinf=new Scanner(System.in);
	 System.out.println("Hello Welcome ,Loyal Costumers to the EFFICIENT and AMAZING BANKING SOFTWARE!!");
	  System.out.println("Namaskaram , Please tell me whether you are a OLD or A NEW COSTUMER!! ");
	  String a=bankinf.nextLine();
	
	  int abcd=a.compareTo("old");
	  int r=a.compareTo("old customer");
	  int loki=a.compareTo("Old Customer");
	  int abc=a.compareTo("new");
	  int rj=a.compareTo("new customer");
	  int lok=a.compareTo("New Customer"); 
	  if (abcd==0||r==0||loki==0)
	  {
	     System.out.println("Please enter your BANK Name , Your NAME , and your AGE!! ");
		 int j=0;
		 String b=bankinf.nextLine();
		  String c=bankinf.nextLine();
		 int leo=c.length();
		 for(int as=0;as<leo;as++)
		 {
		  char cl = c.charAt(as);
		  j=j+(int)cl;
		 }
		 int d=bankinf.nextInt();
	     j=j+d;
		
		 
         bank fun=new bank();
		 fun.old(j, c,  d);
	  
	  }
	  else if (abc==0||rj==0||lok==0)
	  {
	   	 System.out.println("Please enter your  what BANK you would like to use!! ");
	     String kh=bankinf.nextLine();

		 System.out.println("Wonderful choice for a bank!! ");
		 System.out.println("Please enter  Your NAME , and your AGE!! ");
		 String lkd=bankinf.nextLine();
		 int lmgj=lkd.length();
         int l=0;		 
	     for(int ad=0;ad<lmgj;ad++)
		 {
		  char c = lkd.charAt(ad);
		  l=l+(int)c;
		 }
		 int dkl=bankinf.nextInt();
		 l=l+dkl;
         bank fu=new bank( l, lkd,  dkl);
	 }
	 else
	 {
	  System.out.println("Sorry You Have Entered Something Wrong-- The Program Will Have To Restart");
	  System.exit(0);
	 }
	  
	   
	  
	  
    }
}