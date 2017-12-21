public class Triangle17
  {
	public static void main(String a[])
	{
		System.out.println("The Pattern is");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)    
            {
                if(j>=i)
                {
                    System.out.print("*");
                }
                else
                {
					System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=5;j++)               
            {
                if(j>=i)
                {
					System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}
/*

The Pattern is
*****
 ****
  ***
   **
    *
    *
   **
  ***
 ****
*****

*/