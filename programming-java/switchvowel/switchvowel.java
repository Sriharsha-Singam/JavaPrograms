import java.util.*;
public class switchvowel
//IN THIS PROGRAM I WILL USE SWITCH STATEMENT!
{
 public static void main(String arg[])
    {
	 
	  System.out.println("please enter any  vowel!");
	  Scanner obj=new Scanner(System.in);
	  char a=obj.nextLine().charAt(0); 
	  switch (a)
	  {
	    case 'a':
		case 'A':
		     System.out.println("you entered a or A");
			 break;
		case 'e':
		case 'E':
		      System.out.println("you entered e or E");
			  break;
		case 'i':
		case 'I':
		      System.out.println("you entered i or I");
			  break;
		case 'o':
		case 'O':
		      System.out.println("you entered o or O");
			  break;
		case 'u':
		case 'U':
		      System.out.println("you entered u or U");
			  break;
		case 'y':
		case 'Y':
		      System.out.println("you entered y or Y which may or may not be a vowel");
			  break;
		default:
		      System.out.println(" you have not entered  a  vowel");
	  
	   }
	}
}