public class Triangle8
  {
	public static void main(String a[])
	{
		System.out.println("The Pattern is");
        int num1=11;
        int f1=1;
        int g1=num1;
        for(int i=1;i<=(num1/2)+1;i++)		
        {
            for(int j=1;j<=num1;j++) 
            {
                
                if((j>=f1&&j<=g1))
                {
					System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            f1=f1+1;
            g1=g1-1;
            System.out.println();
        }
	}
}

/*

The Pattern is
***********
 ********* 
  *******  
   *****   
    ***    
     *   
*/	 