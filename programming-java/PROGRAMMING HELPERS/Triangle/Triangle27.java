public class Triangle27
 {
	public static void main(String arg[])
	{
		System.out.println("The Pattern is");
        int lum4=11;
        int h4=1;
        int i4=lum4;
        for(int i=1;i<=(lum4/2)+1;i++)
        {
            for(int j=1;j<=lum4;j++)                
            {
                
                if((j>=h4&&j<=i4))
                {
					System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            h4=h4+1;
            i4=i4-1;
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