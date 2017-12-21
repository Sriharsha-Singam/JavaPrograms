import java.util.*;
public class spottestno1
{
   public static void main(String arg[])
   {
      System.out.println("Please enter any alphabet from a to c or please enter a number from 1 to 3!");
	  Scanner obj=new Scanner(System.in);
	  char harsha=obj.nextLine().charAt(0);
	  switch (harsha)
	  {
	    case 'a':
	     System.out.println("You have entered an alphabet!");
		 break;
		case 'b':
		  System.out.println("You have entered an alphabet!");
		  break;
		case 'c':
		  System.out.println("You have entered an alphabet!");
		  break;
		case '3':
		   System.out.println("You have entered a number!");
		   break;
		case '1':
		  System.out.println("You have entered a number!");
		  break;
		case '2':
           System.out.println("You have entered a number!");
		   break;
		default:
		   System.out.println("you have entered a number!");
	  }
	}
}
		