public class Triangle28
 {
	public static void main(String arg[])
	{
		System.out.println("The Pattern is");
        int dum4=11;
        int d4=1;
        int e4=dum4;
        for(int i=1;i<=(dum4/2)+1;i++)
        {
            for(int j=1;j<=dum4;j++)               
            {
                
                if((j==d4||j==e4)&&(i>1))
                {
					System.out.print("x");
                }
                else if((i==1)&&(j%2!=0))
                {
                    System.out.print("x");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            d4=d4+1;
            e4=e4-1;
            System.out.println();
        }
       
	}	     
}

/*


   
The Pattern is
x x x x x x
 x       x 
  x     x  
   x   x   
    x x    
     x 
	 
	 */