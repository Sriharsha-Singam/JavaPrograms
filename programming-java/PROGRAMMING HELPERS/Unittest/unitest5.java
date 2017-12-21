import java.util.*;

public class unitest5
{
 public static void main(String ar[])
 {
  try
  {
    String mln="ThIsIsAsTrIn";
	int g=mln.length();
	int c=0;
	

	 for(int jh=0;jh<=11;jh++)
	 {
	
	    c =c++;
		 int p=-1;
	    for(int y=0;y<=c;y++)
		{
		    p=p+1;
			char n=mln.charAt(p);
			System.out.print("" +n);
		}
		System.out.println(" ");
	 

	}
	 
	 
   
    System.out.println("ThIsISA$TrInG");

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