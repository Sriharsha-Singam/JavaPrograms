import java.io.*;
public class linereader
{
    public static void main(String[] args) 
    {         
         try{
			 LineNumberReader file = new LineNumberReader(new FileReader("C:\\Users\\INT-ACC\\Desktop\\programming java\\fortune.txt"));

				
			System.out.println(file.getLineNumber());
			 for(int i=0;i<9;i++)
			 {
				file.setLineNumber(i);
				System.out.println(file.readLine());
		   	 }
             System.out.println(file.readLine());
             
			             

             System.out.println(file.readLine());
             System.out.println(file.readLine());
             file.close();
			 
            }catch(Exception e) {}
        }
}