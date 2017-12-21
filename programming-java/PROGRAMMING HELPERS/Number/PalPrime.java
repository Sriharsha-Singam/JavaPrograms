import java.io.*;
class PalPrime
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	/* Function isPrime( ) returns 'true' when the number 'x' is Prime and 'false' if it is not. */
	boolean isPrime(int x)
	{
		int count=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
			count++;
		}
		if(count==2)
			return true;
		else
			return false;
	}
	
	/*Function isPalin( ) returns 'true' when 'x' is a Palindrome and 'false' if it is not.*/
	boolean isPalin(int x)
	{
		int rev=0,dig;
		int copy=x;
		while(x>0)
		{
			dig=x%10;
			rev=rev*10+dig;
			x=x/10;
		}
		if(rev==copy)
			return true;
		else
			return false;
	}
	
	/* Function showPalPrime( ) accepts the lower and upper limit, and prints all the PalPrime numbers
	in between that range by sending each numbers in the range to both the functions isPrime( ) and isPalin( ) */
	public void showPalPrime() throws IOException
	{
		int m,n;
		int c=0;
		System.out.print("Enter the Lower Limit (m) = ");
		m=Integer.parseInt(br.readLine());
		System.out.print("Enter the Upper Limit (n) = ");
		n=Integer.parseInt(br.readLine());
		if(m>=n || m>=3000 || n>=3000) // Checking the range of Limits as given in the question
			System.out.println("OUT OF RANGE");
		else
		{
		System.out.println("The Prime Palindrome integers are:");
		/* The below for loop generates every number starting from 'm' till 'n' and sends it
		to both functions isPalin() and isPrime(), to check whether they are both Palindrome and
		prime or not. If yes, then they are printed. */
		for(int i=m; i<=n; i++)
		{
			if(isPrime(i)==true && isPalin(i)==true)
			{
				if(c==0)
					System.out.print(i); 
						/*The above line is printing the first PalPrime number in order to maintain the sequence
						of giving a comma ',' before every next PalPrime number, as is given in the Sample Output.*/
				else
					System.out.print(", "+i);
					c++; //Counting the number of PalPrime numbers by incrementing the counter
			}
		}
		System.out.println("Frequency of Prime Palindrome integers: "+c);
	}
	}
	/* The main method creates an object of PalPrime Class and calls the function showPalPrime( ) */
	public static void main(String aaa[])throws IOException
	{
		PalPrime ob=new PalPrime();
		ob.showPalPrime();
	}
}

