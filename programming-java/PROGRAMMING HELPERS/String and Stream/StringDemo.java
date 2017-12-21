import java.util.*;
public class StringDemo
{
	public static void main(String a[])
	{
		String first = "My First Example for String";
		String second = "My Second Example for String";
		String third = "Sample";
		String fourth = "Simple";
		String fifth = "Sample";
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(fourth);
		System.out.println(fifth);
		System.out.println("charAt");
		System.out.println("-----------------------------");
		char c = first.charAt(6);
		System.out.println("charAt(6) for " + first + " ==> " + c);
		System.out.println("-----------------------------");
		System.out.println("compare 1");
		System.out.println("comparing first and second " + " ==> " + first.compareTo(second)); // Second is greater
		System.out.println("-----------------------------");
		System.out.println("compare 2");
		System.out.println("comparing fourth and third " + " ==> " + fourth.compareTo(third)); //Fourth is greater 
		System.out.println("-----------------------------");
		System.out.println("compare 3");
		System.out.println("comparing third and fifth " + " ==> " + third.compareTo(fifth)); //Equal
		System.out.println("-----------------------------");
		System.out.println("Concat method");
		System.out.println("concatinating first and second " + " ==> " + first.concat(second)); 
		System.out.println("-----------------------------");
		System.out.println("Concat using + ");
		System.out.println("concatinating first and second " + " ==> " + first + second ); 
		System.out.println("-----------------------------");
		System.out.println("trim demo");
		System.out.println("enter string ends with space");
		Scanner sc = new Scanner(System.in);
		String userdata = sc.next();
		System.out.println("trimming user data" + " ==> " + userdata.trim() ); //removes whitespace
		System.out.println("-----------------------------");
		System.out.println("Uppercase");
		System.out.println("Uppercase for first" + " ==> " + first.toUpperCase()); 
		System.out.println("-----------------------------");
		System.out.println("Lowercase");
		System.out.println("Lower for second" + " ==> " + second.toLowerCase()); 
		System.out.println("-----------------------------");
		System.out.println("Replace");
		System.out.println("Replace for first with n by a " + " ==> " + first.replace('n','a')); //old,new
		System.out.println("-----------------------------");
		System.out.println("Substring");
		System.out.println("Substring for first from 6 to 10 " + " ==> " + first.substring(6,10)); //from,to
		System.out.println("-----------------------------");
		System.out.println("length");
		System.out.println("length for first " + " ==> " + first.length()); 
		System.out.println("-----------------------------");		
		System.out.println("Startswith 1");
		System.out.println("Startswith for first with My" + " ==> " + first.startsWith("My")); 
		System.out.println("-----------------------------");	
		System.out.println("Startswith 2");
		System.out.println("Startswith for first with my" + " ==> " + first.startsWith("my")); 
		System.out.println("-----------------------------");		
		System.out.println("Indexof");
		System.out.println("Indexof for first - r " + " ==> " + first.indexOf('r')); //Gives first occurence
		System.out.println("-----------------------------");
		System.out.println("LastIndexof");
		System.out.println("LastIndexof for first - r " + " ==> " + first.lastIndexOf('r')); //Gives last occurence
		System.out.println("-----------------------------");				
		System.out.println("Endswith 1");
		System.out.println("Endswith for first - ng " + " ==> " + first.endsWith("ng")); 
		System.out.println("-----------------------------");
		System.out.println("Endswith 2");
		System.out.println("Endswith for first - Ng " + " ==> " + first.endsWith("Ng")); 
		System.out.println("-----------------------------");
		System.out.println("EqualsIgnoreCase");
		System.out.println("Endswith for first - My FiRst ExaMple for StRing " + " ==> " + first.equalsIgnoreCase("My FiRst ExaMple for StRing")); 
		System.out.println("-----------------------------");
		System.out.println("EqualsIgnoreCase");
		System.out.println("Endswith for first - My FiRst ExaMple for StRing " + " ==> " + first.equalsIgnoreCase("My FiRst ExaMple for StRing")); 
		System.out.println("-----------------------------");
		System.out.println("isDigit 1");		
		System.out.println("Is char 5 is digit" + " ==> " + Character.isDigit('5')); 
		System.out.println("-----------------------------");
		System.out.println("isDigit 2");		
		System.out.println("Is char A is digit" + " ==> " + Character.isDigit('A')); 
		System.out.println("-----------------------------");
		System.out.println("isLetter 1");
		System.out.println("Is Letter A is letter " + " ==> " + Character.isLetter('A')); 
		System.out.println("-----------------------------");
		System.out.println("isLetter 2");
		System.out.println("Is Letter 6 is letter " + " ==> " + Character.isLetter('6')); 
		System.out.println("-----------------------------");
		System.out.println("isLetterOrDigit 1");
		System.out.println("Is 1 is Letter Or Digit" + " ==> " + Character.isLetterOrDigit('1')); 
		System.out.println("-----------------------------");
		System.out.println("isLetterOrDigit 2");
		System.out.println("Is J is Letter Or Digit" + " ==> " + Character.isLetterOrDigit('J')); 
		System.out.println("-----------------------------");
		System.out.println("isLetterOrDigit 3");
		System.out.println("Is * is Letter Or Digit" + " ==> " + Character.isLetterOrDigit('*')); 
		System.out.println("-----------------------------");
		System.out.println("isLowerCase 1");
		System.out.println("is y Lowercase " + " ==> " + Character.isLowerCase('y')); 
		System.out.println("-----------------------------");
		System.out.println("isLowerCase 2");
		System.out.println("is A Lowercase " + " ==> " + Character.isLowerCase('A')); 
		System.out.println("-----------------------------");
		System.out.println("isLowerCase 1");
		System.out.println("is y Lowercase " + " ==> " + Character.isLowerCase('y')); 
		System.out.println("-----------------------------");
		System.out.println("isLowerCase 2");
		System.out.println("is A Lowercase " + " ==> " + Character.isLowerCase('A')); 
		System.out.println("-----------------------------");
		System.out.println("isUpperCase 1");
		System.out.println("is y UpperCase " + " ==> " + Character.isUpperCase('y')); 
		System.out.println("-----------------------------");
		System.out.println("isLowerCase 2");
		System.out.println("is A UpperCase " + " ==> " + Character.isUpperCase('A')); 
		System.out.println("-----------------------------");
		//System.out.println("String Reverse for Third ==>" + third.reverse());
	}
}