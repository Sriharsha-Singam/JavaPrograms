import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;


public class homework4
{
  public static void main(String arg[])
  {
  
     String FILEPATH = "C:\\Users\\INT-ACC\\Desktop\\programming java\\fortune.txt";
	
		try 
		{
		    System.out.println("Please Enter number to find your fortune!!!!");
			Scanner obg=new Scanner(System.in);
			int a=obg.nextInt();
			LineNumberReader file = new LineNumberReader(new FileReader("C:\\Users\\INT-ACC\\Desktop\\programming java\\fortune.txt"));
			File f1 = new File(FILEPATH);
            switch (a)
	  { 
	    case 1:
		     file.setLineNumber(1);
	         String as = file.readLine();
	         int asdj=as.length();
		    System.out.println(new String(readFromFile(FILEPATH, 0, asdj)));
			break;
		case 2:
				     file.setLineNumber(2);
	         String ad = file.readLine();
	         int asjk=ad.length();
		    System.out.println(new String(readFromFile(FILEPATH, 31,(asjk-6) )));
			break;
		case 3:
				     file.setLineNumber(3);
	         String sd = file.readLine();
	         int sdjk=sd.length();
		    System.out.println(new String(readFromFile(FILEPATH, 56,sdjk )));
			break;
		case 4:
				     file.setLineNumber(4);
	         String asdp = file.readLine();
	         int asdk=asdp.length();
		    System.out.println(new String(readFromFile(FILEPATH, 87,(asdk+13) )));
			break;
		case 5:
				     file.setLineNumber(5);
	         String asdo = file.readLine();
	         int asdjkp=asdo.length();
		    System.out.println(new String(readFromFile(FILEPATH, 131,(asdjkp+2) )));
			break;
		case 6:
				     file.setLineNumber(6);
	         String asdi = file.readLine();
	         int asdjki=asdi.length();
		    System.out.println(new String(readFromFile(FILEPATH, 164,(asdjki+17))));
			break;
		case 7:
				     file.setLineNumber(7);
	         String asdkt = file.readLine();
			 
	         int asdjkk=asdkt.length();
			
		    System.out.println(new String(readFromFile(FILEPATH, 212,(asdjkk+21) )));
			break;
		case 8:
				     file.setLineNumber(8);
	         String asdje = file.readLine();
	         int asdjkj=asdje.length();
		    System.out.println(new String(readFromFile(FILEPATH,264,(asdjkj-2) )));
			break;
		case 9:
				     file.setLineNumber(9);
	         String asdn = file.readLine();
	         int asdjkn=asdn.length();
		    System.out.println(new String(readFromFile(FILEPATH, 293,(asdjkn+1) )));
			break;
		case 10:
				     file.setLineNumber(10);
	         String asdh = file.readLine();
	         int asdjkh=asdh.length();
		    System.out.println(new String(readFromFile(FILEPATH, 325,(asdjkh))));
			break;			
		default:
		    System.out.println("LINE NUMBER DOES NOT EXIST");		
			
        }
		}
	  catch(Exception e)
	  {
    	System.out.println("Sorry , there is a technical error");
	   }
	
   }
   	private static byte[] readFromFile(String filePath, int position, int size)
	throws IOException {

		RandomAccessFile file = new RandomAccessFile(filePath, "r");
		file.seek(position);
		
		byte[] bytes = new byte[size];
		file.read(bytes);
		file.close();
		return bytes;

	}
}