import java.util.*;
public class ifvowel
//IN THIS PROGRAM I WILL USE if STATEMENT!
{
 public static void main(String arg[])
    {
	 
	  System.out.println("please enter any  vowel!");
	  Scanner obj=new Scanner(System.in);
	  char a=obj.nextLine().charAt(0); 
	  if(a=='a'||a=='A')
	  {
	   System.out.println("you have entered a or A ");
	   }
	   else if(a=='e'||a=='E')
	   {
	     System.out.println("you have entered e or E ");
		}
		else if(a=='i' || a=='I')
		{
		  System.out.println("you have entered i or I ");
		}
		else if(a=='o' || a=='O')
		{
		  System.out.println("you have entered o or O ");
		}
		else if(a=='u' || a=='U')
		{
		  System.out.println("you have entered u or U ");
		  }
		else if(a=='y' || a=='Y')
		{
		  System.out.println("you have entered y or Y ");
		  
		 }
		 else 
		 {
		   System.out.println(" you have not entered  a  vowel");
		  }
	}
}