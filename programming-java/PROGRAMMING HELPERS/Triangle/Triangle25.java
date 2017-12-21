public class Triangle25
 {
	public static void main(String arg[])
	{
		System.out.println("The Pattern is");
        int sum4=11;
        int a4=1;
        int b4=sum4;
        for(int i=1;i<=(sum4/2)+1;i++)
        {
            for(int j=1;j<=sum4;j++)  
            {
                
                if((j>=a4&&j<=b4))
                {
					System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            a4=a4+1;
            b4=b4-1;
            System.out.println();
        }
        int num0=11;
        int f0=(num0/2)+1;
        int g0=(num0/2)+1;
        for(int i=1;i<=(num0/2)+1;i++)
        {
            for(int j=1;j<=num0;j++)                
            {                
                if((j<=f0&&j>=g0))
                {
					System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            f0=f0+1;
            g0=g0-1;
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
     *     
    ***    
   *****   
  *******  
 ********* 
***********

*/