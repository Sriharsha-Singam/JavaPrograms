import java.io.*;
import java.util.*;
public class file

{
 public static void main(String arg[]) throws IOException
 
    {
	System.out.println("Would like to open a calculator=1;or a youtube downloader=2;or a google chrome=3;or a power point=4;or a vlc media player=5 ;or a paint doc=6;or mozilla firefox=7;or a task manager=8;or an image of IronMan3=9;or a CSK image=10!!!!!!!!!!!!!!!!!!!");
	 Scanner obj=new Scanner(System.in);
	  int a=obj.nextInt();
	 switch (a)
	   { 
	      case 1 :
		      Runtime r=Runtime .getRuntime();
	          r.exec("calc.exe");
			  break;
			  
		  case 2:
		     Runtime rs=Runtime .getRuntime();
	         rs.exec("C:\\Program Files (x86)\\GreenTree Applications\\YTD Video Downloader\\ytd.exe");
			 break;
		 case 3:
		     Runtime s=Runtime .getRuntime();  
	         s.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
			 break;
		 case 4:
		     Runtime g=Runtime .getRuntime();  
	         g.exec("C:\\Program Files\\Microsoft Office\\Office15\\powerpnt.exe");
			 break;
		 case 6:
		     Runtime gh=Runtime .getRuntime();  
	         gh.exec("C:\\Windows\\system32\\mspaint.exe");
			 break;
		 case 5:
		     Runtime ghe=Runtime .getRuntime();
             ghe.exec( "C:\\Program Files\\VideoLAN\\VLC\\vlc.exe");
			 break;
		 case 7:
		     Runtime ghej=Runtime .getRuntime(); 
             		 
	         ghej.exec( "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			 break;
		 case 8:
		     Runtime ghejc=Runtime .getRuntime();  
	         ghejc.exec("C:\\Windows\\system32\\taskmgr.exe");
			 break;
		 case 9:
			 Runtime ghejcu=Runtime .getRuntime(); 
              String harsha="rundll32.exe c:\\WINDOWS\\System32\\shimgvw.dll,ImageView_Fullscreen ";	
          			 
	         ghejcu.exec(harsha + "Z:\\Pictures\\pics\\PICS\\iron_man_3_new-wide.jpg");
		    break;
		 case 10:
		 	Runtime hejcu=Runtime .getRuntime(); 
            String harsh="rundll32.exe c:\\WINDOWS\\System32\\shimgvw.dll,ImageView_Fullscreen ";	
          	hejcu.exec(harsh + "Z:\\Pictures\\pics\\PICS\\chennai-super-kings-101.jpg");
		    break;
		 default:
		    System.out.println("you have not entered any of the options!!!");
		}
	}
	
}