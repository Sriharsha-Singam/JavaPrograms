import java.io.*;

class anagram
{
  static int counter = 0;
  public static void main (String args[]) throws IOException
  {
     BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
     String str = br.readLine ();

     genanagram ("",str);
  }

  static void genanagram (String prefix, String ana)
  {
     if (ana.length () <= 1)
     {
        System.out.println (prefix + ana);
     }
     else
     {
        for(int i = 0; i < ana.length(); i++) 
        {
           String cur    = ana.substring(i, i + 1);
           String before = ana.substring(0, i); 
           String after  = ana.substring(i + 1);
           counter++;
           //System.out.println ("ana length : "+ana.length()+" Counter "+counter+" cur : "+cur+" before : "+before+" after : "+after);
           genanagram (prefix + cur, before + after);
        }
     }
  }
}