import java.io.*;
class Kaprekar
{
	/*
	Example 1: 9

	92  = 81, right-hand piece of 81 = 1 and left hand piece of 81 = 8

	Sum = 1 + 8 = 9, i.e. equal to the number. Hence, 9 is a Kaprekar number.

	Example 2: 45

	452 = 2025, right-hand piece of 2025 = 25 and left hand piece of 2025 = 20

	Sum = 25 + 20 = 45, i.e. equal to the number. Hence, 45 is a Kaprekar number.

	Example 3: 297

	2972 = 88209, right-hand piece of 88209 = 209 and left hand piece of 88209 = 88

	Sum = 209 + 88 = 297, i.e. equal to the number. Hence, 297 is a Kaprekar number.
*/
	public static void main(String aaa[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a Number : ");
		int n=Integer.parseInt(br.readLine()); //Inputting the number
		int sq=n*n; //finding the square of the number
		String s=Integer.toString(sq); //converting the square into a String
		if(sq<=9)
		s="0"+s;
		int l=s.length(); //finding the length (i.e. no. of digits in the square).
		int mid=l/2; //finding the middle point
		String left=s.substring(0,mid); //extracting the left digits from the square
		String right=s.substring(mid); //extracting the right digits from the square
		int x=Integer.parseInt(left); //converting the left String into Integer
		int y=Integer.parseInt(right); //converting the right String into Integer
		if(x+y == n) //if sum of left and right numbers is equal to the original number then it is a Kaprekar number
		System.out.println(n+" is a Kaprekar Number");
		else
		System.out.println(n+" is Not a Kaprekar Number");
	}
}

