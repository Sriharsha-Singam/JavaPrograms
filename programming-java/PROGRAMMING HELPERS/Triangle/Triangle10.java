public class Triangle10
  {
	public static void main(String a[])
	{
		System.out.println("The Pattern is");
        int num3=11;
        int f3=(num3/2)+1;
        int g3=(num3/2)+1;
        for(int i=1;i<=(num3/2)+1;i++)
        {
            for(int j=1;j<=num3;j++)
            {
                
                if((j<=f3&&j>=g3))
                {
					System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            f3=f3+1;
            g3=g3-1;
            System.out.println();
        }
        int num4=11;
        int f4=1;
        int g4=num4;
        for(int i=1;i<=(num4/2)+1;i++)
        {
            for(int j=1;j<=num4;j++)  
            {
                
                if((j>=f4&&j<=g4))
                {
					System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            f4=f4+1;
            g4=g4-1;
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
***********
 ********* 
  *******  
   *****   
    ***    
     *     
	 
*/