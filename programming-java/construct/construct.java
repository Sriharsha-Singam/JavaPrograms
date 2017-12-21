import java.io.*;
import java.util.*;
public class construct
{
   construct()
   {
    System.out.println("Hello");
   }
   construct(int a, int b)
   { 
    System.out.println(""+(a+b));
	}
	construct(String a, String b)
	{
	 System.out.println(""+(a+b));
	 }
	 public static void main(String args[])
	 {
	  construct gh=new construct(100,54);
	  construct l=new construct("hello" , "visitor");
	 }
}