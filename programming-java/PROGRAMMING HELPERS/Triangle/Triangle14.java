public class Triangle14
  {
	public static void main(String a[])
	{
		System.out.println("The Pattern is");
        int num7=12;
        int f7=(num7/2)+1;
        int g7=(num7/2);
        for(int i=1;i<=(num7/2);i++)
        {
            for(int j=1;j<=num7;j++)  
            {
                
                if((j>=f7&&j<=g7)&&(j!=1))
                {
					System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            f7=f7-1;
            g7=g7+1;
            System.out.println();
        }
        int num9=12;
        int f9=2;
        int g9=num9-1;
        for(int i=1;i<=(num9/2);i++)
        {
            for(int j=1;j<=num9;j++)  
            {
                
                if(j>=f9&&j<=g9)
                {
					System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            f9=f9+1;
            g9=g9-1;
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
*          *
**        **
***      ***
****    ****
*****  *****
************

*/