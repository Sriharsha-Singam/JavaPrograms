public class Triangle9
  {
	public static void main(String a[])
	{
		System.out.println("The Pattern is");
        int num2=11;
        int f2=(num2/2)+1;
        int g2=(num2/2)+1;
        for(int i=1;i<=(num2/2)+1;i++)
        {
            for(int j=1;j<=num2;j++)  
            {
                
                if((j<=f2&&j>=g2))
                {
					System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            f2=f2+1;
            g2=g2-1;
            System.out.println();
        }
	}
}

/*

The Pattern is
     *     
    ***    
   *****   
  *******  
 ********* 
***********

*/