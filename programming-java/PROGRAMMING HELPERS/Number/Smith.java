import java.io.*;
class Smith
{
/*
Examples:

1.  666

Prime factors are 2, 3, 3, and 37
Sum of the digits are (6+6+6) = 18
Sum of the digits of the factors (2+3+3+(3+7)) = 18

2.   4937775

Prime factors are 3, 5, 5, 65837
Sum of the digits are (4+9+3+7+7+7+5) = 42
Sum of the digits of the factors (3+5+5+(6+5+8+3+7)) = 42


*/
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
	//function for finding sum of digits
	int sumDig(int n)
	{
		int s=0;
		while(n>0)
		{
			s=s+n%10;
			n=n/10;
		}
		return s;
	}
 
	//function for generating prime factors and finding their sum
	int sumPrimeFact(int n)
	{
		int i=2, sum=0;
		while(n>1)
		{
			if(n%i==0)
			{
				sum=sum+sumDig(i); //Here 'i' is the prime factor of 'n' and we are finding its sum
				n=n/i;
			}
			else
				i++;
		}
		return sum;
	}
 
	public static void main(String aws[]) throws IOException
	{
		Smith ob=new Smith();
		System.out.print("Enter a Number : ");
		int n=Integer.parseInt(br.readLine());
		int a=ob.sumDig(n);// finding sum of digit
		int b=ob.sumPrimeFact(n); //finding sum of prime factors
		System.out.println("Sum of Digit = "+a);
		System.out.println("Sum of Prime Factor = "+b);
		if(a==b)
		System.out.print("It is a Smith Number");
		else
		System.out.print("It is Not a Smith Number");
	}
}

