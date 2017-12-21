import java.io.*;
class Happy
{
	/*
		A happy number is a number in which
		the eventual sum of the square of the digits of the 
		number is equal to 1.

		Example: 12 = ( 1 )^2 + ( 2 )^2 = 1 + 4 = 5
				 28 = 2 ^ 2 + 8 ^ 2 
		Hence, 12 is not a happy number.

	*/
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n;
	 
	Happy()
	  {
	   n=0;
	  }
	 
	void getnum(int nn)
	{
	  n=nn;
	}
	 
	int sum_sq_digits(int x)
	{
	  if(x==0)
		return 0;
	  else
	   {
		int d=x%10;
		return (d*d+ sum_sq_digits(x/10));
	   }
	}
	 
	void ishappy()
	{
		int a=sum_sq_digits(n);
		while(a>9)
		{
			a=sum_sq_digits(a);
		}
		if(a==1)
		   System.out.print(n+" is a Happy Number");
		else
		   System.out.print(n+" is Not a Happy Number");
	}
	 
	public static void main(String aaa[])throws IOException
	  {
		Happy ob=new Happy();
		System.out.print("Enter any number: ");
	    int b=Integer.parseInt(br.readLine());
	    ob.getnum(b);  
	    ob.ishappy();
	  }
}

