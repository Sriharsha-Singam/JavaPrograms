import java.io.*;
import java.util.*;
public class homework7
{
   public static void main(String args[])throws IOException
    {
       System.out.println("Please enter your name");
	   
	   Scanner obj=new Scanner(System.in);
	   String a=obj.nextLine();
	   int b=a.length();
	   
	   String j="$";
	   PrintWriter file = new PrintWriter(new FileWriter("C:\\Users\\INT-ACC\\Desktop\\Encrypt.txt"));
	   for(int i=0;i<b;i++)
	   {
	    String l="";
	    char c = a.charAt(i);
		l=c+j;
		file.print(""+l);
		System.out.print(""+l);
	   }
	   file.println("");
	   	   String h="$";
	 
	   for(int i=0;i<b;i++)
	   {
	    String l="";
	    char c = a.charAt(i);
		
		l=(float)c+h;
		file.print(" "+l);
		System.out.print(" "+l);
	   }
	   file.println("");
	   String g="$";
	  
	   for(int i=0;i<b;i++)
	   {
	    String l="";
	    char c = a.charAt(i);
		l=Integer.toBinaryString((int)c);
		String nm=l+g;
		file.print(""+nm);
		System.out.print(""+nm);
	   }
	   file.println("");
	   file.close();
	}
}
