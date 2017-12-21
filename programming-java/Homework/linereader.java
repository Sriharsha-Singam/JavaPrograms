import java.io.*;
public class linereader
{
    public static void main(String[] args) 
    {         
         try{
			 LineNumberReader file = new LineNumberReader(new FileReader("C:\\Users\\INT-ACC\\Desktop\\Encrypt.txt"));

				
			
			 for(int i=0;i<3;i++)
			 {
				 file.setLineNumber(i);
				 file.readLine();
				 if (i==1)
				 {
				   String hj=file.readLine();
				   System.out.println(hj);
				}
		   	 }
      
             file.close();
			 
            }catch(Exception e) {}
        }
}