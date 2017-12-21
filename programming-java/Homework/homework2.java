import java.io.*;
import java.util.*;
import java.io.IOException;


public class homework2
{
  
    void print(int employees , String employeesinfo[][]) throws IOException
   {

	 int as=employees*4;
	 Calendar cal = Calendar.getInstance();
	  int bf= cal.get(Calendar.YEAR);
	  int al=(cal.get(Calendar.MONTH) + 1);
	    PrintWriter fiel = new PrintWriter(new FileWriter("C:\\Users\\INT-ACC\\Desktop\\programming java\\employeedb.csv"));
      for(int i=0; i<employees; i++)
        {    
                fiel.println(""+employeesinfo[i][0]+","+employeesinfo[i][1]+","+employeesinfo[i][2]+",$"+employeesinfo[i][3]+",EMP_"+bf+"_"+al+"_"+i); 
        } 
		fiel.close();
	}
  void read(int employe)
    {
	

		LineNumberReader fil = new LineNumberReader(new FileReader("C:\\Users\\INT-ACC\\Desktop\\programming java\\employeedb.csv"));
	
		
		char ads=',';
		char dea='_';
		int e =0;
		
	   for(int i=0; i<employe; i++)
	   {
	     fil.setLineNumber(i);
	     String asd = fil.readLine();
	     int asdjk=asd.length();
	     for(int y=0;y<asdjk;y++)
	     {
	       char c = asd.charAt(y);
	   	   if(c==ads)
		   {
		   e++;
		 
		   }
		 }
	    }
		int lds=0;
	   for(int i=0;i<employe;i++)
	    {
		 fil.setLineNumber(i);
	     String asd = fil.readLine();
	     int asdjk=asd.length();
		  for(int y=0;y<asdjk;y++)
	     {
	       char c = asd.charAt(y);
	   	   if(c==dea)
		   {
		   lds++;
		 
		   }
	     }
        }
	   
	 System.out.println("Number of commas = "+e);
	 System.out.println("Number of underscores = "+lds);
   }
   void readcom(int employee)
    {
     LineNumberReader filx = new LineNumberReader(new FileReader("C:\\Users\\INT-ACC\\Desktop\\programming java\\employeedb.csv"));
	
		
		char as=',';
		
		
	   for(int i=0; i<employee; i++)
	   {
	     filx.setLineNumber(i);
	     String asd = filx.readLine();
	     int asdjk=asd.length();
	     for(int y=0;y<asdjk;y++)
	     {
	       char c = asd.charAt(y);
	   	   if(c==as)
		   {
		     System.out.println("First commas was in index number "+(y+1)+" in line number "+i);
		     break;
		   }
	     }

	   }
	


    }
	void changeunder(int asdf)
	{
	     LineNumberReader filxa = new LineNumberReader(new FileReader("C:\\Users\\INT-ACC\\Desktop\\programming java\\employeedb.csv"));
	
		
		char as='_';
		char ads='.';
		
	   for(int i=0; i<asdf; i++)
	   {
	     filxa.setLineNumber(i);
	     String asd = filxa.readLine();
	     int asdjk=asd.length();
	     for(int y=0;y<asdjk;y++)
	     {
	       char c = asd.charAt(y);
	   	   if(c==as)
		   {
		    .charAt(y)=ads;
		   }
	     }

	    }
	
	}
	void len(int elf)
	{
	  LineNumberReader filxaa = new LineNumberReader(new FileReader("C:\\Users\\INT-ACC\\Desktop\\programming java\\employeedb.csv"));
	  int harsha=0;
	  for(int i=0; i<elf; i++)
	   {
	     filxaa.setLineNumber(i);
	     String assd = filxaa.readLine();
	     int asdajk=assd.length();
		 harsha+=asdajk;
	   }
	   System.out.println("The length of the file is "+harsha+" letters");
	}
	void uppercase(int gelf)
	{
	  int lds=0;
	  LineNumberReader fila = new LineNumberReader(new FileReader("C:\\Users\\INT-ACC\\Desktop\\programming java\\employeedb.csv"));
	 	 for(int i=0;i<gelf;i++)
	    {
		 fila.setLineNumber(i);
	     String asd = fila.readLine();
	     int asdjk=asd.length();
		  for(int y=0;y<asdjk;y++)
	     {
	       char c = asd.charAt(y);
		  Boolean ia=Character.isUpperCase(c);
	   	   if(ia==true)
		   {
		   lds++;
		 
		   }
	     }
        }
      System.out.println("the number of uppercases is "+lds);
    }
	void threeglpline(int ele,String employeesinfo[][])
	{
	 int j=1;
     for(int i=0;i<ele;i++)
	 {
	   int l=employeesinfo[i][0].length();
	   if(l>3)
	   {
	    j+=1;
	   }
	  System.out.println("Line number "+(i+1)+" has "+j+" number of words having more than 3 letters");
	 }
	 
	 
	 for(int i=0;i<ele;i++)
	 {
	   int lm=0;
	   String stin=employeesinfo[i][0];
	   int lent=stin.length();
	   for(int kj=0;kj<lent;kj++)
	   {
	    char c=stin.charAt(kj);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='y'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='Y')
		{
		 lm+=1;
		}
	   }
	   if(lm>1)
	   {
	    System.out.println("There are "+lm+" vowels in Employee number "+i+"'s name");
	   }
	   else
	   {
	    System.out.println("There is "+lm+" vowel in Employee number "+i+"'s name");
	   }
	 }
	}
	void palin(int chel,String employeesinfo[][])
	{
		 Calendar cal = Calendar.getInstance();
	  int bf= cal.get(Calendar.YEAR);
	  int al=(cal.get(Calendar.MONTH) + 1);
	for(int i=0;i<chel;i++)
	 {
	  String j="";
	 for(int l=chel-1;l>=0;l--)
	   { 
         char c = employeesinfo[i][0].charAt(l);
		 j=j+c;
		}
		
        int lm=employeesinfo[i][0].compareTo(j);
	
        if( lm == 0)
		{
		System.out.println(""+i+","+employeesinfo[i][0]+",EMP_"+bf+"_"+al+"_"+i+"---His Name is a palindrome");
		}

	
     }
	 for(int i=0;i<chel;i++)
	 {
	   String s = employeesinfo[i][3];
       int inn = Integer.parseInt( s );
	  if(inn>10000)
	  {
	   System.out.println(""+employeesinfo[i][0]+",EMP_"+bf+"_"+al+"_"+i+"---His salary is greater than 10k");
	  }
	 }
	}
	public static void main(String args[])
	{
               Scanner empinf=new Scanner(System.in);
	 System.out.println("How Many Employees Would You Like To Enter?");
	 int employees=empinf.nextInt();
	 Scanner empinfo=new Scanner(System.in);
     System.out.println("Please enter Your Name , Your age , Your Phone Number ,and Your Salary per Month!!");
	 String employeesinfo[][]=new String[employees][4];
	 for(int a=0;a<employees;a++)
	 {
	  for(int b=0;b<4;b++)
	  {
	    employeesinfo[a][b]=empinfo.next();
	  }
	 }
	  homework2 fun=new homework2();
	  fun.print(employees,employeesinfo);
	  fun.read(employees);
      fun.readcom(employees);
	  fun.changeunder(employees);
	  fun.len(employees);
	  fun.uppercase(employees);
	  fun.threeglpline(employees,employeesinfo);
	}
}
