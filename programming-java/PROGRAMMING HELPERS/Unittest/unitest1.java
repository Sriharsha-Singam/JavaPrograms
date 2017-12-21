import java.util.*;
//Write a program to find the occurrence of given character from string entered in console
public class unitest1
{
 public static void main(String ar[])
 {
  try
  {
    System.out.println("please enter a character!");
	Scanner sc=new Scanner(System.in);
	char a=sc.next().charAt(0);
	System.out.println("" +a);
	System.out.println("please enter a word !");
	Scanner sc1=new Scanner(System.in);
	String b=sc1.next();
	int c=b.length();
	int d=0;
	for(int l=c;l>0;l--)
	{
	char n=b.charAt(l);
	 if('n'=='a')
	 {
	    d=d+1;
	 }
	}
	System.out.println("In this word  you have entered :-" +a);
	System.out.println(" this many times =" +d);
   }
   catch(Exception e)
   {
    System.out.println("you have entered some thing wrong! " );
   }
   finally{};
   {
    System.out.println("See you next time! " );
   }
   }
}