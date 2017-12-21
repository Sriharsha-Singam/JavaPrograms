import java.io.*;
class FileDemo
{
    public static void main(String[] args) 
    {         
         try{
			 LineNumberReader file = new LineNumberReader(
                            new FileReader("C:\\Users\\saravanan.s\\Desktop\\Files\\Sample.txt"));

				
			System.out.println(file.getLineNumber());
			 for(int i=0;i<file.getLineNumber();i++)
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