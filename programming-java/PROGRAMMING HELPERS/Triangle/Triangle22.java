public class Triangle22
  {
	public static void main(String a[])
	{
		System.out.println("The Pattern is");
        int w11=8;
        for(int i=1;i<=9;i++)
        {
            int p=i;
            p=p+w11;
            for(int j=1;j<=9;j++)
            {
                if((j==i)||(j==p))
                {
                    System.out.print("x");
                }
                else
                {
					System.out.print(" ");
                }
            }
            w11=w11-2;
            
            System.out.println();
        }
	}
}

/*

The Pattern is
x       x
 x     x 
  x   x  
   x x   
    x    
   x x   
  x   x  
 x     x 
x       x

*/