import java.util.*;
public class pasword
//IN THIS PROGRAM I WILL USE ifSTATEMENT!
{
 public static void main(String arg[])
    {
	 
	  System.out.println("please enter your name!");
	  Scanner obj=new Scanner(System.in);
	   String a=obj.next();
       for(int i=0;i<=4;i++)
        {
	   System.out.println("please enter the PASSWORD!");
	    Scanner objksidh=new Scanner(System.in);
	   String b=objksidh.next();
	  switch (b)
	  {
	    case "singam":
		
		     System.out.println("you are right");
			 break;
		default :
		   System.out.println("you are wrong");
	  }
         }
	}
}