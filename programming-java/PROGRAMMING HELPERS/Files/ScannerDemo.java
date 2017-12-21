import java.util.*;
public class ScannerDemo
{
  public static void main(String[] args)
  {    
    Scanner in = new Scanner(System.in);
    int integer;
    long longInteger;
    float realNumber;
    double doubleReal;
    String string1;
    String string2;    
     
	 System.out.println("Enter an integer");
    integer = in.nextInt();
	System.out.println("Enter a long integer");
    longInteger = in.nextLong();
	System.out.println("Enter a floating-point ");
    realNumber = in.nextFloat();
	System.out.println("Enter an double value");
    doubleReal = in.nextDouble();
	System.out.println("Enter a String Value");
    string1 = in.next();    
   
    System.out.println("Here is what you entered: ");
    System.out.println(integer + " " + longInteger + " " + realNumber +
                       " " + doubleReal + " " + string1);
  }
 
}