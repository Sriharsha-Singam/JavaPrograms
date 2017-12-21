import java.io.*;
import java.util.*;

public class homework6
{
   public static String[ ] getAllLists(String[ ] elements, int lengthOfList)
 {
     String[ ] allLists = new String[ (int) Math.pow(elements.length, lengthOfList) ];
     if(lengthOfList == 1)
    {
      return elements;
    }
    else
    {
      String[ ] allSublists = getAllLists(elements, lengthOfList - 1);
      int arrayIndex = 0;
 


       for(int i = 0; i < elements.length; i++)
      {
        for(int j = 0; j < allSublists.length; j++)
       {
        allLists[arrayIndex] = elements[ i ] + allSublists[ j ];
        arrayIndex++;
        }
      }
      return allLists;
    }
  }
  public static void main(String[ ] args)
    {
             String[ ] database = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            long list=0;
            for(int i=1; i<=database.length; i++)
              {
                   String[ ] result = getAllLists(database, i);
                   for(int j=0; j<result.length; j++)
                  {
                     list++;
                     System.out.println(result[j] + " Position " + (list));
                  }
              }
    }
}