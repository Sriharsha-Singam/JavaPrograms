public class Triangle24
 {
	public static void main(String arg[])
	{
		System.out.println("The Pattern is");
        int num31=11;
        int f31=(num31/2)+1;
        int g31=(num31/2)+1;
        for(int i=1;i<=(num31/2)+1;i++)
        {
            for(int j=1;j<=num31;j++)               
            {
                
                if((j==f31||j==g31))
                {
					System.out.print("x");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            f31=f31+1;
            g31=g31-1;
            System.out.println();
        }
        int num41=11;
        int f41=1;
        int g41=num41;
        for(int i=1;i<=(num41/2)+1;i++)
        {
            for(int j=1;j<=num41;j++) 
            {
                
                if((j==f41||j==g41))
                {
					System.out.print("x");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            f41=f41+1;
            g41=g41-1;
            System.out.println();
        }
	}
}

/*


The Pattern is
     x     
    x x    
   x   x   
  x     x  
 x       x 
x         x
x         x
 x       x 
  x     x  
   x   x   
    x x    
     x  
	 
*/	 