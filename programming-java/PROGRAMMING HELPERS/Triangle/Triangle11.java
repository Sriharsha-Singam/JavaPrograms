public class Triangle11
  {
	public static void main(String a[])
	{
		System.out.println("The Pattern is");
        int num8=12;
        int f8=2;
        int g8=num8-1;
        for(int i=1;i<=(num8/2);i++)
        {
            for(int j=1;j<=num8;j++)  
            {
                
                if(j>=f8&&j<=g8)
                {
					System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            f8=f8+1;
            g8=g8-1;
            System.out.println();
        }
	}
}

/*


The Pattern is
*          *
**        **
***      ***
****    ****
*****  *****
************

*/