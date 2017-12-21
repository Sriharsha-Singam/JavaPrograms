import java.util.*;
public class spotestone
{
	public static void main(String args[])
	{
		System.out.println("enter any letter or a number!");
		char a;
		Scanner sc = new Scanner (System.in);
		a = sc.nextLine().charAt(0);
		if( (a>='a'&& a<='z')&&( a>='A'&& a<='Z'))
		{
			System.out.println("YOU HAVE ENTERED AN ALPHABET!");
		}
		else if( a>='0'&& a<='9')
		{
			System.out.println("YOU HAVE ENTERED A NUMBER!");
		}
		else
		{
			System.out.println("INVALID VALUE!!!!!");
		}
	}
}
