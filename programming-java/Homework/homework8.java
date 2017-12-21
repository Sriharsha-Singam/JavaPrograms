import java.io.*;
import java.util.*;
public class homework8
{
  public static void main(String arg[])throws IOException
  {
   //try
   //{
     LineNumberReader file = new LineNumberReader(new FileReader("C:\\Users\\INT-ACC\\Desktop\\Encrypt.txt"));
	        String j=file.readLine();
		    String lk=j.replace('$','2');
			//System.out.println(lk);
			String h="";
			String hj="";
			LineNumberReader fil = new LineNumberReader(new FileReader("C:\\Users\\INT-ACC\\Desktop\\Encrypt.txt"));
			for(int i=0;i<3;i++)
			{
			    fil.setLineNumber(i);
				 h=fil.readLine();
				 if (i==2)
				 {
				    
				    hj=h;
					
				   
				}
			}
			
			
			String harsha="";
			int y=lk.length();
			int fd=(lk.length())-2;
			long binary[] = new long[y];
            for(int i=fd;i>=0;i=i-2)
            {
              char c=lk.charAt(i);
			  harsha=c+harsha;
            }		
            int ls=harsha.length();		
            
            
             long tr=0;			
   			 for(int i=0;i<ls;i++)
			 {
			    char c=harsha.charAt(i);
				long q=0;
				String ha=Integer.toBinaryString((int)c);
				
				long jfk=ha.length()+1;
				 for(int ja=0;ja<ha.length();ja++)
                    {
					   jfk=jfk-1;
				       char b=ha.charAt(ja);
					   if(b=='1')
					    {
						  q+=Math.pow(2,jfk);
						  
						 }
					   
					   binary[i]=q;
                    } 
		       }
			   
			   //for(int i=0;i<harsha.length();i++)
			   //{
			   //long earth=binary[i]/2;
			     //System.out.println(earth);
				 
				 
			   //}
			   String sai="";
			    for(int i=0;i<harsha.length();i++)
			   {
		        long earth=binary[i]/2;
				 sai=sai+(char)earth;
			   }
			   System.out.println(sai.toUpperCase());
      
             file.close();
			 

  }
}