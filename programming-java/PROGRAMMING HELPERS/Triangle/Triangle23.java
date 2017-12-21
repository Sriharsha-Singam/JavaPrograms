public class Triangle23
  {
	public static void main(String a[])
	{
		System.out.println("The Pattern is");
        int w21=8;
        for(int i=1;i<=9;i++)
        {
            int p=i;
            p=p+w21;
            for(int j=1;j<=9;j++)   
            {
                if((j==p)&&(i<=5))
                {
                    System.out.print("x");
                }
                else if((j==i)&&(i>5))
				{
					System.out.print("x");
				}
                else
                {
					System.out.print(" ");
                }
            }
            w21=w21-2;
            
            System.out.println();
        }
	}
}

/*

The Pattern is
        x
       x 
      x  
     x   
    x    
     x   
      x  
       x 
        x
		
*/		