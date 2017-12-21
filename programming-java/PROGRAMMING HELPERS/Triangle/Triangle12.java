public class Triangle12
  {
	public static void main(String a[])
	{
		System.out.println("The Pattern is");
        int num5=12;
        int f5=(num5/2)+1;
        int g5=(num5/2);
        for(int i=1;i<=(num5/2);i++)
        {
            for(int j=1;j<=num5;j++)  
            {
                
                if((j>=f5&&j<=g5)&&(j!=1))
                {
					System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            f5=f5-1;
            g5=g5+1;
            System.out.println();
        }
	}
}

/*

The Pattern is
************
*****  *****
****    ****
***      ***
**        **
*          *

*/