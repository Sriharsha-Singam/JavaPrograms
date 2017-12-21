import java.io.*;
class Emirp
    {
		static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n, rev, f;
		 
		Emirp(int nn) //parameterised constructor
		{
		n=nn;
		rev=0;
		f=2;
		}
 
		int isprime(int x) //recursive function for checking whether 'x' is Prime or not
		{
			if(f<=x)
			{
				 if(x%f!=0) // f is increasing everytime we are not getting any factor
				 {
					 f++;
					 isprime(x);
				 }
			}
			/* Since, 'f' was increasing everytime we did not get any factor,
			* Hence, if 'f' becomes equal to the number, then that means that the number
			* is not divisible by any other number except 1 and itself
			* Hence it is Prime */
			if(f==x)
				 return 1;
			else
				 return 0;
		}
 
		void isEmirp()
		{
		int copy=n, d;
		while(copy>0) // code for reversing a number
		{
			d=copy%10;
			rev=rev*10+d;
			copy=copy/10;
		}
		int a=isprime(n); //checking whether the Original number is Prime or not
		f=2; //resetting the value of f for checking whether the reverse number is Prime or not
		int b=isprime(rev); //checking whether the Reverse number is Prime or not
		if(a==1 && b==1) //If both Original and Reverse are Prime, then it is an Emirp number
		System.out.println(n+" is an Emirp Number");
		else
		System.out.println(n+" is Not an Emirp Number");
		}
 
		public static void main(String aaa[])throws IOException
		{
			System.out.print("Enter any number : "); //inputting the original number
			int n=Integer.parseInt(br.readLine());
			Emirp ob=new Emirp(n);
			ob.isEmirp();
		}  
    }

