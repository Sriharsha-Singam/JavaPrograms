import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;

public class RandomAccessFileDemo 
{

	

	public static void main(String[] args) 
	{

	 String FILEPATH = "C:\\Users\\saravanan.s\\Desktop\\Files\\random.txt";
	
		try 
		{
			File f1 = new File(FILEPATH); 
			//writeToFile(FILEPATH, "JavaCodeGeeks Rocks!", 0);
			//writeToFile(FILEPATH, "JavaCodeGeeks Rocks!", 10);
			writeToFile(FILEPATH, "JavaCodeGeeks Rocks!", 34);
			System.out.println(new String(readFromFile(FILEPATH, a)));

			
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

	private static void writeToFile(String filePath, String data, int position)
			throws IOException {

		RandomAccessFile file = new RandomAccessFile(filePath, "rw");
		file.seek(position);
		file.write(data.getBytes());
		file.close();

	}
}