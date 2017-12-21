import java.io.*;
import java.util.*;

public class Try

{
 public static void main(String arg[]) 
 
    {

	
	 try
	 {
	 System.out.println("Please Enter One Number!!");
	 Scanner obj=new Scanner(System.in);
	  float m=obj.nextFloat();
	  System.out.println("Please Enter Another Number!!");
	  Scanner objt=new Scanner(System.in);
	  float d=objt.nextFloat();
	
	 float c=m/d;
	  System.out.println("The Quetient Is "+c "!!!!!!!!!!!");
	 
	 
	 }
	 catch(Exception e)
	 {
	 System.out.println("Unable to Compile!!!!!!!!!!!!!!!!!!!!!!!!");
	 }
	 
    }
	
	
}                                                           