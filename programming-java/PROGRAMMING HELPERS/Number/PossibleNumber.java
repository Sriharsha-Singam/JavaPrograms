import java.io.*;
class PossibleNumber
    {
		//inputs a positive natural number N and prints the possible consecutive number 
		//combinations, which when added give N

        public static void main(String aaaa[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number : "); //inputting the number
            int n=Integer.parseInt(br.readLine());
            
            int sum=0,c=0,j=0;
            for(int i=1;i<n;i++)
            {
                sum=i;
                j=i+1;
 
				/* adding consecutive natural numbers till sum is less than the given number */
 
                while(sum<n)
                {
                    sum=sum+j;
                    j++;
                }
 
/* when the above while condition is false, then either the sum is equal to
that number or is greater than that number
So, we will be printing the series of consecutive numbers only if the sum is
equal to that number
 
Note: variable 'i' is keeping record of the first number of the series and
variable 'j' is keeping record of the last number of the series */
 
                    if(sum==n)
                    {
                        for(int k=i;k<j;k++)
                        {
                            if(k==i)
                                System.out.print(k);
                            else
                                System.out.print(" + "+k);
                        }
                     System.out.println();
                    }
            }
        }
    }

