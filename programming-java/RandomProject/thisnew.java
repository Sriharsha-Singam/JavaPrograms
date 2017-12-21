import java.io.*;
import java.util.*;
public class thisnew
{ 
 int heol;
   int harsha;
   
   thisnew()
   {
    heol=12321;
   harsha=123459877;
   }
   
   thisnew(int a)
   {
    this.heol=a;
	System.out.println(""+heol);
	
   }
   public static void main(String args[])
   {
    thisnew a=new thisnew(134);
   }
}