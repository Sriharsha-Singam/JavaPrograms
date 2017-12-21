import java.util.*;
import java.io.*;

public class ExceptionFiveDemo
{
    public static void main(String args[]) throws IOException  
    {
       Runtime rs = Runtime.getRuntime();
	  String imageExePath="rundll32.exe C:\\WINDOWS\\System32\\shimgvw.dll,ImageView_Fullscreen ";
      rs.exec(imageExePath + "C:\\Users\\Isha\\Desktop\\challenges.jpg");
    }
    
}
