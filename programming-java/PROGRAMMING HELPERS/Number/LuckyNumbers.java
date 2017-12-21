import java.io.*;
class LuckyNumbers
{
	/*
	Consider the sequence of natural numbers.
	1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 

	Removing every second number produces the sequences
	1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23 

	Removing every third number produces the sequences
	1, 3, 7, 9, 13, 15, 19, 21, 25 

	This process continues indefinitely by removing the fourth, fifth…and so on,
	till after a fixed number of steps, certain natural numbers remain indefinitely.
	These are known as Lucky Numbers.
	*/


	public static void main(String aaa[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number of Elements : ");
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		int c=n;
		for(int i=0;i<n;i++)
		{
			a[i]=i+1;
		}
		int del=1;
		System.out.println("\nLucky Number Operation :\n");
		while(del<n)
		{
			for(int i=del; i<n; i+=del)
			{
				for(int j=i; j<n-1; j++)
				{
					a[j]=a[j+1];
				}
				n--;
			}
			del++;
			for(int i=0; i<n; i++)
			{
				System.out.print(a[i]+"   ");
			}
			System.out.println();
		} //end of while
		System.out.print("\nHence, the Lucky Numbers Less than "+c+" are : ");
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+"   ");
		}
	}
}

