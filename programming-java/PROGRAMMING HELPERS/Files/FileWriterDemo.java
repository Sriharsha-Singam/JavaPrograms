import java.io.*;

public class FileWriterDemo{

   public static void main(String args[])throws IOException{

      File file = new File("Hello1.txt");
     
      file.createNewFile();
      
      FileWriter writer = new FileWriter(file); 
      
      writer.write("This\n is\n an\n example\n"); 
      writer.flush();
      writer.close();

      
      FileReader fr = new FileReader(file); 
      char [] a = new char[50];
      fr.read(a); 
	  for(int len=0;len<a.length;len++)
	  {      
          System.out.print(a[len]); //prints the characters one by one
	  }
      fr.close();
   }
}