import java.io.*;
class File2Demo
{
    public static void main(String[] args) 
    {         
         try{
			 LineNumberReader file = new LineNumberReader(
                            new FileReader("C:\\Users\\saravanan.s\\Desktop\\Files\\Sample.txt"));

				
			System.out.println(file.getLineNumber());
			 
             file.close();
			 
            }catch(Exception e) {}
        }
}