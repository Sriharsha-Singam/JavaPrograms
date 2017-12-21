import java.util.*;
public class CalendarDemoTwo 
{
   public static void main(String[] args)
   {   
      // create a calendar
      Calendar cal = Calendar.getInstance();
	  
      // print current date
      System.out.println("The current date is : " + 
	  (cal.get(Calendar.MONTH) + 1) + "/" +
	  cal.get(Calendar.DATE) + "/" +
	  cal.get(Calendar.YEAR) + "/ " +
	  cal.get(Calendar.HOUR) + ":" +
	  cal.get(Calendar.MINUTE) + ":" +
	  cal.get(Calendar.SECOND) + ":" +
	  cal.get(Calendar.MILLISECOND));     
   }
}