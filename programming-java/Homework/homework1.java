import java.io.*;
import java.util.*;
//Write a program to accept name, age, phone number, salary for an employee using array, store the details in the file as Employeedb.csv (Comma Separate values) and display the EMPLOYEEID .Format of the employee id should be EMP_YYYY_MM_NNN (EMP is a string, YYYY – Year, MM – Current Month and NNN –sequence number(001,002,003,etc) ).
public class homework1
{
   public static void main(String args[]) throws IOException
   {
     Scanner empinfo=new Scanner(System.in);
	 System.out.println("How Many Employees Would You Like To Enter?");
	 int employees=empinfo.nextInt();
	 System.out.println("Please enter Your Name , Your age , Your Phone Number ,and Your Salary per Month!!");
	 String employeesinfo[][]=new String[employees][4];
	 for(int a=0;a<employees;a++)
	 {
	   System.out.println("Enter Information of EMPLOYEE"+(a+1));
	   System.out.println();
	  for(int b=0;b<4;b++)
	  {
	    employeesinfo[a][b]=empinfo.next();
	  }
	 }
	 int as=employees*4;
	 Calendar cal = Calendar.getInstance();
	  int bf= cal.get(Calendar.YEAR);
	  int al=(cal.get(Calendar.MONTH) + 1);
	   PrintWriter file = new PrintWriter(new FileWriter("c:\\Users\\INT-ACC\\Desktop\\employee.txt"));
	   PrintWriter fil = new PrintWriter(new FileWriter("c:\\Users\\INT-ACC\\Desktop\\programming java\\employeed.csv"));
	    PrintWriter fiel = new PrintWriter(new FileWriter("c:\\Users\\INT-ACC\\Desktop\\programming java\\employeedb.csv"));
	
      for(int i=0; i<employees; i++)
        {   
           
                file.println(""+employeesinfo[i][0]+","+employeesinfo[i][1]+","+employeesinfo[i][2]+",$"+employeesinfo[i][3]+",EMP_"+bf+"_"+al+"_"+(i+1)); 
                fil.println("Employee number "+(i+1)+" :-\n His Name Is :- "+employeesinfo[i][0]+"\n His age is :- "+employeesinfo[i][1]+ " \nHis Phone Number is :- "+ employeesinfo[i][2]+" \n His Salary Per Month is:- "+employeesinfo[i][3]); 
                fiel.println(""+employeesinfo[i][0]+","+employeesinfo[i][1]+","+employeesinfo[i][2]+",$"+employeesinfo[i][3]+",EMP_"+bf+"_"+al+"_"+(i+1)); 
        } 
	    file.close();
		fil.close();
		fiel.close();

	 
    }
}
