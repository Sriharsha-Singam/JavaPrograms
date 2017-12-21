public class Triangle26
 {
	public static void main(String arg[])
	{
		System.out.println("The Pattern is");
        int qum2=11;
        int m2=(qum2/2)+1;
        int n2=(qum2/2)+1;
        for(int i=1;i<=(qum2/2)+1;i++)
        {
            for(int j=1;j<=qum2;j++)                
            {
                
                if((j==m2||j==n2)&&(i<(qum2/2)+1))
                {
					System.out.print("x");
                }
                else if((i==(qum2/2)+1)&&(j%2!=0))
                {
                    System.out.print("x");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            m2=m2+1;
            n2=n2-1;
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
x x x x x x

*/