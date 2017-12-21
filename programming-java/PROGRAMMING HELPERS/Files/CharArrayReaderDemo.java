import java.io.*;

public class CharArrayReaderDemo {
   public static void main(String[] args) {

      CharArrayReader car = null;
      char[] ch = {'H', 'E', 'L', 'L', 'O'};
      try{
                 
         car = new CharArrayReader(ch);
         
         int value=0;
         
        
         while((value = car.read())!=-1)
         {
            
            char c = (char)value;
            
           
            System.out.print(c+" : ");
            
            
            System.out.println(value);
         }
      }catch(IOException e){
         
        
         e.printStackTrace();
      }finally{
         
         // releases any system resources associated with the stream
         if(car!=null)
            car.close();
      }
   }
}