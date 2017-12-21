import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;

public class h
{

	

	public static void main(String[] args) 
	{

	 String FILEPATH = "C:\\Users\\INT-ACC\\Desktop\\programming java\\fortune.txt";
	
		try 
		{
			File f1 = new File(FILEPATH); 
		
			System.out.println(new String(readFromFile(FILEPATH, 28, 8)));
			} 
		catch (IOException e) 
		{
			e.printStackTrace();
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

	/*private static void writeToFile(String filePath, String data, int position)
			throws IOException {

		RandomAccessFile file = new RandomAccessFile(filePath, "rw");
		file.seek(position);
		file.write(data.getBytes());
		file.close();

	}*/
}