import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterDemo 
{
    public static void main(String[] args) throws IOException 
	{

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try 
		{
            inputStream = new FileReader("C:\\Users\\saravanan.s\\Desktop\\Files\\read.txt");
            outputStream = new FileWriter("C:\\Users\\saravanan.s\\Desktop\\Files\\write.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } 
		finally
		{
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}